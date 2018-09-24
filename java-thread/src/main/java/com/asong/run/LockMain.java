package com.asong.run;


import com.asong.thread.LockThreadA;
import com.asong.thread.LockThreadB;
import com.asong.thread.LockThreadE;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMain {


    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();
        LockThreadA lockThreadA = new LockThreadA(lock,conditionA);
        LockThreadB lockThreadB = new LockThreadB(lock,conditionB);
        LockThreadE lockThreadE = new LockThreadE(lock,conditionA);
        lockThreadA.start();
        lockThreadB.start();
        lockThreadE.start();
        HashMap<String,String> map = new HashMap<String, String>();
        ConcurrentHashMap<String,String> conMap = new ConcurrentHashMap<String, String>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
    }

}
