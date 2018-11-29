package ConcurrencyBestPractices;

import java.util.concurrent.*;

public class Main {

    public static synchronized void performAction(String action){
        System.out.println(action);
    }

    public void performActionCodeBlock(String action){
        synchronized (this){
            System.out.println(action);
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        System.out.println("Testing started...");

        //create new thread pool
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("fire-and-forget!");
            }
        });

        //Future: may not be available immediately, but can use .get() to wait
        Future<Integer> futureResult = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 29;
            }
        });

        Integer value = futureResult.get(5, TimeUnit.SECONDS);

        System.out.println(value);
    }



}
