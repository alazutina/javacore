import java.util.function.Function;

class UseFunctionInterfaceDemo {
    public static void main(String args[]){
        Function<Integer,Integer> factirial = (n)->{
            int result = 1;
            for(int i=1;i<=n;i++)
                result = i*result;
            return result;
        };
        System.out.println("Факториал 3 = "+factirial.apply(3));
        System.out.println("Факториал 5 = "+factirial.apply(5));
    }
}
