interface MyNumber{
    double getValue();
}

class LambdaDemo {
    public static void main(String args[]){
        MyNumber myNum;
        myNum = () ->123.45;
        System.out.println("Фикстрованное значение: "+ myNum.getValue());
        myNum = () ->Math.random() *100;
        System.out.println("Случайное значение: "+ myNum.getValue());
        System.out.println("Еще одно случайное значение: "+ myNum.getValue());
        System.out.println("и еще одно случайное значение: "+ myNum.getValue());
        myNum = () ->Math.sqrt(222.22);
        System.out.println("значение: "+ myNum.getValue());

    }
}
