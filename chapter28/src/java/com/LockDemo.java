import java.util.concurrent.locks.*;


public class LockDemo {
    public static void main(String [] args){
        ReentrantLock lock = new ReentrantLock();
        new LockThread0(lock,"A");
        new LockThread0(lock,"B");
    }

}

class Shared1{
    static int count = 0;
}


class LockThread0 implements Runnable{
    String name;
    ReentrantLock lock;
    LockThread0(ReentrantLock lk, String n){
        lock=lk;
        name=n;
        new Thread(this).start();

    }
    public void run(){
        try{
            System.out.println("Поток "+ name+ " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток "+ name+ " блокирует счетчик");
            Shared1.count++;
            System.out.println("Поток "+ name+": "+Shared1.count);
            System.out.println("Поток "+ name+ " ожидает");
            Thread.sleep(1000);

        } catch (InterruptedException exc){
            System.out.println(exc);
        } finally {
            System.out.println("ПОток "+ name+ " разблокирует счетчик");
            lock.unlock();
        }
    }
}