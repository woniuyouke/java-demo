package com.asong;

/**
 * 验证编译通过与否的问题
 */


abstract class A {
    abstract int getInfo();
}

class B extends A {

    private int a = 0;

    int getInfo() {
        return a;
    }
}

public class CompileTest {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
    }
}
