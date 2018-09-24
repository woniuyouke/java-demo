package com.asong.calculator.construction;


import javax.naming.ldap.StartTlsRequest;
import java.util.*;

public class CalImpl extends BaseCal {

    private static Map<String, Integer> priorityMap = new HashMap<String, Integer>();

    static {
        priorityMap.put("+", 1);
        priorityMap.put("-", 1);
        priorityMap.put("*", 2);
        priorityMap.put("/", 2);
        priorityMap.put("(", 3);
    }

    public List<String> pushList(String exp) {
        List<String> list = new ArrayList<String>();
        if (exp != null && !"".equals(exp.trim())) {
            StringTokenizer stringTokenizer = new StringTokenizer(exp, "+-*/()", true);
            while (stringTokenizer.hasMoreTokens()) {
                list.add(stringTokenizer.nextToken());
            }
        }
        return list;
    }

    // (a+b）*c --> ab+c*
    public List<String> suffixList(List<String> list) {
        List<String> suffixList = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        for (String str : list) {
            if (isDigital(str)) {
                suffixList.add(str);
            } else if ("(".equals(str)) {
                stack.push(str);
            } else if (")".equals(str)) {
                if (!stack.isEmpty()) {
                    String temp = stack.pop();
                    while (!("(".equals(temp) )) {
                        suffixList.add(temp);
                        if(!stack.isEmpty()) {
                            temp = stack.pop();
                        }else{
                            break;
                        }
                    }
                }
            } else if ("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str)) {
                if (stack.isEmpty()) {
                    stack.push(str);
                } else {
                    String temp = stack.pop();
                    if (priorityMap.get(str) > priorityMap.get(temp)) {
                        stack.push(temp);
                        stack.push(str);
                    } else {
                        if (!"(".equals(temp)) {
                            while (true){
                                if ("(".equals(temp)) {
                                    stack.push(temp);
                                    stack.push(str);
                                    break;
                                }
                                if(priorityMap.get(str) <= priorityMap.get(temp) ) {
                                    suffixList.add(temp);
                                }else{
                                    stack.push(temp);
                                    stack.push(str);
                                    break;
                                }
                                if(!stack.isEmpty()) {
                                    temp = stack.pop();
                                }else{
                                    stack.push(str);
                                    break;
                                }
                            }
                        } else {
                            stack.push(temp);
                            stack.push(str);
                        }
                    }
                }
            } else {

            }
        }
        while (!stack.isEmpty()) {
            suffixList.add(stack.pop());
        }
        return suffixList;
    }

    public String cal(List<String> suffixList) {
        Stack<String> stack = new Stack<String>();
        for (String str : suffixList) {
            if (isDigital(str)) {
                stack.push(str);
            } else {
                double b = Double.parseDouble(stack.pop());
                double a = Double.parseDouble(stack.pop());
                double temp = 0;
                if ("+".equals(str)) {
                    temp = a + b;
                } else if ("-".equals(str)) {
                    temp = a - b;
                } else if ("*".equals(str)) {
                    temp = a * b;
                } else if ("/".equals(str)) {
                    temp = a / b;
                } else {

                }
                stack.push(String.valueOf(temp));
            }
        }
        return stack.pop();
    }


    private boolean isDigital(String str) {
        boolean flag = false;
        try {
            Double.parseDouble(str);
            flag = true;
        } catch (NumberFormatException e) {

        }
        return flag;
    }
}
