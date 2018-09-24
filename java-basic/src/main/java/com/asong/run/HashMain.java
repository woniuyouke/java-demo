package com.asong.run;

import com.asong.hash.HashObject;

import java.util.HashSet;

public class HashMain {

    public static void main(String[] args){
 /*       HashSet<Object> set = new HashSet<Object>();
        set.add(new Object());
        set.add(new Object());
        System.out.println(set.size());*/

        HashObject object  = new HashObject();
        System.out.println(object.hashCode());
    }
}
