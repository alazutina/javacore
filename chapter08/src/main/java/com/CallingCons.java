class A5{
    A5(){
        System.out.println("В конструкторе А.");
    }
}

class B5 extends A5{
    B5(){
        System.out.println("В конструкторе B.");
    }
}

class C extends B5{
    C(){
        System.out.println("В конструкторе C.");
    }
}



public class CallingCons {
    public static void main(String [] args){
        C c = new  C();
    }
}
