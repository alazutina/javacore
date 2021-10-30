public class Exc2 {
    public static void main(String args[]){
        int a,d;
        try {
            d=0;
            a=2/d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        System.out.println("После catch");
    }
}
