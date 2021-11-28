class Q1{
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet)            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("исключение типа InterruptedException перехвачено");
            }

        System.out.println("ПОлучено: "+ n);
        valueSet  = false;
        notify();
        return n;
    }

    synchronized void  put(int n){
        this.n = n;
        System.out.println("Отправлено: "+n);
    }
}

class Producer1 implements Runnable{
    Q q;
    Producer1(Q q){
        this.q = q;
        new Thread(this,"Поставщик").start();
    }
    public  void  run(){
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}

class Consumer1 implements Runnable{
    Q q;
    Consumer1(Q q){
        this.q = q;
        new Thread(this,"Потребитель").start();
    }
    public  void  run(){

        while (true){
            q.get();
        }
    }
}

public class PCFixed {
    public static void main(String args[]){
        Q q = new Q();

        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки Ctrl-C");

    }
}

