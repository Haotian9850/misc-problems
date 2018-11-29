package ConcurrencyBestPractices;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LocksDemo {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void performAction(){
        lock.lock();
        try{
            System.out.println("Trying to lock...");
        }finally{
            lock.unlock();
        }
    }

    public static void performActionWithWait() throws InterruptedException {
        if(lock.tryLock(5, TimeUnit.SECONDS)){
            try{
                System.out.println("Trying to lock in 5 seconds...");
            }finally{
                lock.unlock();
            }
        }
    }


    public static void main(String[] args){


    }

}
