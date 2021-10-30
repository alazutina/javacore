class A {
    int i,j;
}
class B{
    int i,j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}
class InstanceOf {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if( a instanceof A){
            System.out.println("a экземпляр A");
        }
        if( b instanceof B){
            System.out.println("b экземпляр B");
        }

        if( c instanceof C){
            System.out.println("c экземпляр C");
        }
        if( c instanceof A){
            System.out.println("c можно привести к A");
        }
        if( a instanceof C){
            System.out.println("a можно привести к C");
        }
        System.out.println();
        A ob = d;

        System.out.println("ob ссылается на d");
        if (ob instanceof  D) System.out.println("ob экземпляр D");
        System.out.println();

        ob = c;
        System.out.println("ob ссылается на c");
        if (ob instanceof  D) System.out.println("ob можно привести к  D");
        else System.out.println("ob нельзя привести к D");

        if (ob instanceof  A) System.out.println("ob можно привести к  A");
        System.out.println();

        if(a instanceof Object) System.out.println("a можно привести к Object");
        if(b instanceof Object) System.out.println("b можно привести к Object");
        if(c instanceof Object) System.out.println("c можно привести к Object");
        if(d instanceof Object) System.out.println("d можно привести к Object");



    }
}
