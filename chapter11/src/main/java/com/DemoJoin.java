class NewThread2 implements Runnable{
    String name;
    Thread t;

    NewThread2(String treadname){
        name = treadname;
        t = new Thread(this, name);

        System.out.println("Новый поток " +t) ;
        t.start();

    }

    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+ ": " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(name+ " прерван");
        }
        System.out.println(name+ " завершен");
    }
}



public class DemoJoin {
    public static void main(String [] args){
        NewThread2 ob1 = new NewThread2("ОДин");
        NewThread2 ob2 =new NewThread2("Два");
        NewThread2 ob3 =new NewThread2("Три");


        System.out.println("Поток ОДин запущен: "+ob1.t.isAlive());

        System.out.println("Поток Два запущен: "+ob2.t.isAlive());

        System.out.println("Поток Три запущен: "+ob3.t.isAlive());

        try{
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e ) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток ОДин запущен: "+ob1.t.isAlive());

        System.out.println("Поток Два запущен: "+ob2.t.isAlive());

        System.out.println("Поток Три запущен: "+ob3.t.isAlive());

        System.out.println("Главный поток завершен");
    }

}
