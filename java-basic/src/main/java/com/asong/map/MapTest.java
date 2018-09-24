package com.asong.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 证明hashMap的key可以为空
 */
public class MapTest {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put(null,"xs");
        map.put("xs",null);
        map.put(null,"xss");
        System.out.println(map);
    }
}
