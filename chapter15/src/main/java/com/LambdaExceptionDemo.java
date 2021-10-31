interface DoubleNumericArryaFunc{
    double func(double [] n) throws  EmptyArrayException;
}

class  EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Массив пуст");
    }
}

class LambdaExceptionDemo {
    public static void main(String args[]) throws EmptyArrayException{
        double [] values = {1.0,2.3,3.0,4.0};
        DoubleNumericArryaFunc average = (n) ->{
            double sum = 0;
            if (n.length==0) throw  new EmptyArrayException();
            for (int i =0; i<n.length;i++) sum += n[i];
            return  sum/n.length;
        };
        System.out.println("Среднее равно " + average.func(values));
        System.out.println("Среднее равно " + average.func(new double[0]));
      //  System.out.println("Среднее равно " + average.func(values));
    }
}
