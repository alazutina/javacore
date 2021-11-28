class NewThread3 implements  Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread3(String threadname){
        name = threadname;

        t = new Thread(this, name);
        System.out.println("Новый потмок: "+t);
        suspendFlag = false;
        t.start();
    }

    public void run(){
        try{
            for(int i =15;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e){
            System.out.println(name+ " прерван");
        }
        System.out.println(name+ " завершен");
    }
    synchronized  void mysuspend(){
        suspendFlag = true;
    }
    synchronized  void  myresume(){
        suspendFlag = false;
        notify();
    }
}


public class SuspendResume {
    public static void main(String args[]){

        NewThread3 ob1 = new NewThread3("ОДин");
        NewThread3 ob2 = new NewThread3("Два");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостновка потока ОДин");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока ОДин");
            ob2.mysuspend();
            System.out.println("Приостновка потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Два");

        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        try{
            System.out.println("Ожидание завершения потока");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
System.out.println("Главный поток завершен");
    }
}
