package me.whiteship.chapter01.item07.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample2 {

    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(10); //10씩
//        ExecutorService service = Executors.newScheduledThreadPool(10); //10씩
//        ExecutorService service = Executors.newSingleThreadExecutor(); //하나씩
        ExecutorService service = Executors.newCachedThreadPool();  //한꺼번에
        for (int i = 0; i < 100; i++) {
            service.submit(new Task());
        }

        System.out.println(Thread.currentThread() + " hello");
        service.shutdown();
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try{
               Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "  world");
        }
    }

}
