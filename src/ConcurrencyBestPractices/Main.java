package ConcurrencyBestPractices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static synchronized void performAction(String action){
        System.out.println(action);
    }

    public void performActionCodeBlock(String action){
        synchronized (this){
            System.out.println(action);
        }
    }

    public static void main(String[] args){
        System.out.println("Testing started...");

        //create new thread pool
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("fire-and-forget!");
            }
        });
    }

}
