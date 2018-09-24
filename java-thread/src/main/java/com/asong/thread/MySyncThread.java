package com.asong.thread;

public class MySyncThread  implements  Runnable{
    public void run() {
        System.out.println("启动线程:"+Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
