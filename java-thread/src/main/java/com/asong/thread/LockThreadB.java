package com.asong.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class LockThreadB extends Thread {
    Lock lock;
    Condition condition;

    public LockThreadB(Lock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("B"+Thread.currentThread().getName());
            lock.lock();
            System.out.println(" name: " + Thread.currentThread().getName() + "在执行");
           /* condition.signal();
            System.out.println(Thread.currentThread().getName()+"执行完毕");*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
