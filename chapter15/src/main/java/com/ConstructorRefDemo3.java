interface MyFunc5 <R,T>{
    R func(T n);
}

class MyClass3 <T> {
    private T val;

    MyClass3(T v){val = v;}

    MyClass3(){val=null;}

    T getVal() { return val;}
}

class MyClass4{
    String str;

    MyClass4(String s){str = s;}
    MyClass4(){str="";}
    String getVal(){return str;}
}


class ConstructorRefDemo3 {

    static <R,T> R myClassFactory(MyFunc5 <R,T> cons, T v){
        return cons.func(v);
    }

    public static void main(String args[]){
        MyFunc5<MyClass3<Double>, Double> myClassCons = MyClass3<Double>::new;
        MyClass3<Double> mc = myClassFactory(myClassCons,100.1);
        System.out.println("Значение val в обьекте mc равно "+mc.getVal());

        MyFunc5<MyClass4, String> myClassCons2 = MyClass4::new;
        MyClass4 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("значение str в обьекте mc2 равно "+ mc2.getVal());

    }
}

