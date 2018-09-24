package com.asong.thread;

import java.util.concurrent.locks.Lock;

public class LockThreadD extends Thread {
    Object object;
    Lock lock;

    public LockThreadD(Object object, Lock lock) {
        this.object = object;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (object) {
            System.out.println("D开始执行");
            object.notify();
            System.out.println("D执行完毕");
        }


    }
}
