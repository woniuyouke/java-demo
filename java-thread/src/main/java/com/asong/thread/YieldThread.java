package com.asong.thread;

public class YieldThread implements  Runnable {
    public void run() {
        System.out.println("放弃cpu资源");
        Thread.yield();
        System.out.println("重新获得cpu资源");
    }
}
