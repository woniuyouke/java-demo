package com.asong.run;

import com.asong.thread.MySyncThread;

public class SyncMain {
    public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(new MySyncThread());
            thread.start();
            thread.stop();
            Thread.sleep(2000);
            System.out.println("i love asong");

    }
}
