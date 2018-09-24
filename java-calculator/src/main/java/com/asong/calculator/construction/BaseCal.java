package com.asong.calculator.construction;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * 采用模板模式
 */
public abstract  class BaseCal {
    public String invoke(String exp){
        //1.入队列
        //2.入栈出栈得到逆波兰队列
        //3.计算
        List<String> list = pushList(exp);
        System.out.println(JSON.toJSON(list));
        List<String> suffixList = suffixList(list);
        System.out.println(JSON.toJSON(suffixList));
        String result = cal(suffixList);
        System.out.println("result:"+result);
        return result;
    }

    public abstract List<String> pushList(String exp);

    public abstract List<String> suffixList(List<String> list);

    public abstract  String cal(List<String> suffixList);

}
