abstract class AA{
    abstract void callme();

    void callmetoo(){
        System.out.println("Это конкретный метод.");
    }
}

class BB extends AA{
    void callme(){
        System.out.println("Реализация метода callme() из класса В.");
    }
}


public class AbstractDemo {
    public static void main(String [] args){
        BB b = new BB();
        b.callme();
        b.callmetoo();
    }
}
