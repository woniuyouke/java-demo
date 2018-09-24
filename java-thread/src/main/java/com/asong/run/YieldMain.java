package com.asong.run;

import com.asong.thread.YieldThread;

public class YieldMain {

    public static void main(String[] args){
     new Thread(new YieldThread()).start();
    }
}
