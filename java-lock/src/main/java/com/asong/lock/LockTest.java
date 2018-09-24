package com.asong.lock;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockTest {



    //ReentrantLock

    public static void main(String[] args){
         final int MAXIMUM_CAPACITY = 1 << 30;

         System.out.println(MAXIMUM_CAPACITY);
         System.out.println(Integer.MAX_VALUE);
         Lock lock = new ReentrantLock();
         ReadWriteLock wiretReadLock = new ReentrantReadWriteLock();
         CountDownLatch latch = new CountDownLatch(4);
         ReentrantLock reentrantLock = new ReentrantLock();


    }
}
