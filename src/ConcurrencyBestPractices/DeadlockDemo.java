package ConcurrencyBestPractices;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {

    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void performAction(){
        lock1.lock();
        try{
            System.out.println("trying...");
            try{
                System.out.println("locking lock2");
                lock2.lock();
            }finally{
                System.out.println("unlocking lock2");
                lock2.unlock();
            }
        }finally{
            System.out.println("unlocking lock1");
            lock1.unlock();
        }
    }

    public static void performAnotherAction(){
        lock2.lock();
        try{
            System.out.println("locking...");
            try{
                System.out.println("locking lock1...");
                lock1.lock();
            }finally{
                System.out.println("unlocking lock1...");
                lock1.unlock();
            }
        }finally {
            System.out.println("unlocking lock2...");
            lock2.unlock();
        }
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                performAction();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                performAnotherAction();
            }
        });

        t1.run();
        
    }

}
