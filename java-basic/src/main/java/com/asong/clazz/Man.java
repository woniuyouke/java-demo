package com.asong.clazz;

public class Man extends Person {

    public Man(String name) {

        super(name);
        System.out.println("man:" + name);
    }

    public Man() {
        super("xwl");
    }
}
