interface MyFunc3 <T>{
    MyClass2 <T> func(T n);
}

class MyClass2 <T> {
    private T val;

    MyClass2(T v){val = v;}

    MyClass2(){val=null;}

    T getVal() { return val;}
}


class ConstructorRefDemo2 {
    public static void main(String args[]){
           MyFunc3<Integer> myClassCons = MyClass2<Integer>::new;
           MyClass2<Integer> mc = myClassCons.func(100);
           System.out.println("Значение val в обьекте mc равно "+mc.getVal());

    }
}
