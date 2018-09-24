package com.asong.run;

import com.asong.nio.ClientThread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class NioClientMain {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayBlockingQueue<String>  words = init();
        for (int i = 0; i < 1; i++) {
            new Thread(new ClientThread(words,random,8081)).start();
        }
    }

    private static  ArrayBlockingQueue<String>  init() {
        ArrayBlockingQueue<String> words = new ArrayBlockingQueue<String>(5);
        try {
            words.put("hi");
            words.put("who");
            words.put("what");
            words.put("where");
            words.put("bye");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return words;

    }

}
