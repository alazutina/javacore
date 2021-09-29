class Outer{
    int outer_x=100;


    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("Вывод: outer_x= "+outer_x);
        }

    }

    void showy(){
    //    System.out.println(y);
    }

}


public class InnerClassDemo {
    public static void main(String args[]){
        Outer outer = new Outer();
        outer.test();
    }
}
