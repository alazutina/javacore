interface NumericTest2{
    boolean test(int n, int d);
}

class LambdaDemo3 {
    public static void main(String args[]){
        NumericTest2 isFactor = (n,d) -> (n%d) == 0;

        if(isFactor.test(10,2)) System.out.println("2 множитель 10");
        if(!isFactor.test(10,3)) System.out.println("3 не множитель 10");
    }
}
