class A0{
    void callme(){
        System.out.println("B методе callme() из класса A");
    }
}

class B0 extends A0{
    void callme(){
        System.out.println("B методе callme() из класса B");
    }
}

class C0 extends A0{
    void callme(){
        System.out.println("B методе callme() из класса C");
    }
}
public class Dispatch {
    public static void main(String [] args){
        A0 a =  new A0();
        B0 b = new B0();
        C0 c = new C0();

        A0 r;

        r = a;

        r.callme();

        r = b;
        r.callme();

        r=c;
        r.callme();



    }
}
