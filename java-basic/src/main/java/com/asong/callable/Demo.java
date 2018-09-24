package com.asong.callable;

import java.util.concurrent.*;

public class Demo  implements  Callable<String >{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Demo demo = new Demo();
        Future<String> future = service.submit(demo);
        System.out.println(future.get());
        service.shutdown();
        System.out.println("xwk:ai");
    }

    public String call() throws Exception {
        Thread.sleep(1000);
        return "xwk";
    }
}
