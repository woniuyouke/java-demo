package com.asong;

import com.asong.clazz.ProtectedFather;

public class ProtectedSon extends ProtectedFather {
    @Override
    public void sayHello(){
        super.sayHello();
        System.out.println("son:hello");
    }

}
