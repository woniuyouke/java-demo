package com.asong.run;

import com.asong.ProtectedSon;
import com.asong.clazz.Person;
import com.asong.clazz.ProtectedFather;

import java.net.ProtocolException;

public class ProtectedMain {
    public static void main(String[] args){
        ProtectedSon protect = new ProtectedSon();
        protect.sayLove();
        protect.sayHello();

    }
}
