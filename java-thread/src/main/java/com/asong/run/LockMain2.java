package com.asong.run;

import com.asong.thread.LockThreadC;
import com.asong.thread.LockThreadD;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMain2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Lock lock = new ReentrantLock();
        LockThreadC c = new LockThreadC(object,lock);
        LockThreadD d = new LockThreadD(object,lock);
        c.start();
        Thread.sleep(200);
        d.start();

    }
}
