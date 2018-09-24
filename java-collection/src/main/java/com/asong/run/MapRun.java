package com.asong.run;
import java.util.*;

public class MapRun {
    public static void main(String[] args){
        Map<String ,String > map = new HashMap<String, String>(16);
        map.put(null,null);
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("34","4");
        map.put("11","5");
        Set<String> set = map.keySet();
        for(String key : set){
            System.out.println("key:"+key+" value:"+map.get(key));
        }
        Map<String,String> orderlyMap = new LinkedHashMap<String, String>(16);
        orderlyMap.put(null,null);
        orderlyMap.put("1","1");
        orderlyMap.put("2","2");
        orderlyMap.put("3","3");
        orderlyMap.put("34","4");
        orderlyMap.put("11","5");
        Iterator<String> iterator = orderlyMap.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key:"+key+"  value:"+orderlyMap.get(key));
        }

    }
}
