package com.asong.thread;

public class SyncTest {
    public static void  main(String[] args){
        int song = 0;
        synchronized (SyncTest.class){
             song = 520;
        }
        System.out.println("你好"+song);
        
    }
}
