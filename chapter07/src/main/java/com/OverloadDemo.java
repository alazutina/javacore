public class OverloadDemo {
 //   public static void main(String[] args){

        void test(){
            System.out.println("Париметры отсутвуют");
        }
        void test(int a){
            System.out.println("a: "+a);
        }

        void test(int a,int b){
            System.out.println("a и b: "+a+" "+b);
        }

        double test(double a){
            System.out.println("double a: "+a);
            return a*a;
        }


   // }
}
