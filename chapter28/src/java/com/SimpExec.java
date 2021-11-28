import java.util.concurrent.*;

public class SimpExec {
    public static void main(String [] args){
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd12 = new CountDownLatch(5);
        CountDownLatch cd13 = new CountDownLatch(5);
        CountDownLatch cd14 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(2);

        es.execute(new MyThread0(cd1,"A"));
        es.execute(new MyThread0(cd12,"B"));
        es.execute(new MyThread0(cd13,"C"));
        es.execute(new MyThread0(cd14,"D"));

        try{
            cd1.await();
            cd12.await();
            cd13.await();
            cd14.await();
        } catch (InterruptedException exc){
            System.out.println(exc);
        }

        es.shutdown();
        System.out.println("Завершение потоков");

    }
}

class MyThread0 implements Runnable{
    String name;
    CountDownLatch latch;

    MyThread0(CountDownLatch c, String n){
        latch = c;
        name = n;
        new Thread(this);
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(name+": "+i);
            latch.countDown();
        }
    }
}
