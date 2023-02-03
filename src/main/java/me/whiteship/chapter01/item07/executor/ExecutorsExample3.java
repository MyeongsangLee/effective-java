package me.whiteship.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = Executors.newFixedThreadPool(10);
        ExecutorService service = Executors.newScheduledThreadPool(10);

        Future submit = service.submit(new Task());

        System.out.println(Thread.currentThread() + " hello");

        System.out.println(submit.get());
        service.shutdown();
    }

    static class Task implements Callable {

        @Override
        public String call() throws Exception {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(Thread.currentThread() + "  world");
            return Thread.currentThread() + "  world";
        }
    }
//    static class Task implements  {
//        @Override
//        public void run() {
//            try{
//               Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread() + "  world");
//        }
//    }

}
