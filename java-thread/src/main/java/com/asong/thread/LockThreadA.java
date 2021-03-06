package com.asong.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class LockThreadA extends   Thread {

    Lock lock ;
    Condition condition;
    public LockThreadA(Lock lock,Condition condition){
        this.lock = lock;
        this.condition = condition;
    }

    public void run() {
        try{
            System.out.println("A"+Thread.currentThread().getName());
           lock.lock();
           Thread.sleep(1000000);
            System.out.println("name:"+Thread.currentThread().getName()+"在执行");
           /* try {
                System.out.println(Thread.currentThread().getName()+"开始阻塞");
                condition.await();
                System.out.println(Thread.currentThread().getName()+"重新执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
             lock.unlock();
        }
    }
}
