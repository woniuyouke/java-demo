package com.asong.thread;

import java.util.concurrent.locks.Lock;

public class LockThreadC extends  Thread {
    Object object;
    Lock lock;
    public LockThreadC(Object object,Lock lock){
        this.object = object;
        this.lock = lock;
    }

    @Override
    public void run(){
       synchronized (object){
           System.out.println("C开始执行");
           try {
               object.wait(100);
               System.out.println("C执行完毕");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}
