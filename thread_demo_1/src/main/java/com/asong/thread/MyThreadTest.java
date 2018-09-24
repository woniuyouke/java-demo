package com.asong.thread;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadTest {
    static Thread thread1 = new Thread(new Runnable() {
        public void run() {
            sleep();
            System.out.println("thread1");
        }
    });
    static Thread thread2 = new Thread(new Runnable() {
        public void run() {
            sleep();
            System.out.println("thread2");
        }
    });
    static Thread thread3 = new Thread(new Runnable() {
        public void run() {
            sleep();
            System.out.println("thread3");
        }
    });
    static void sleep(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static ExecutorService service = Executors.newSingleThreadExecutor();
    public static void main(String[] arg){
        /*thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();*/
        /**
         * FIFO 先进先出
         */
        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.shutdown();
        while (!service.isTerminated())
        {
            System.out.println("线程还没有执行完毕");
        }
    }
}
