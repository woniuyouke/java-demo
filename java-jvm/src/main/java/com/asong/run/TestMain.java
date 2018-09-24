package com.asong.run;

public class TestMain {
    public static void main(String[] args){
     for(int i=0;i<100;i++){
         new MyThread().start();
     }
    }


    static class MyThread extends  Thread{
        public void run(){
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName()+"执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
