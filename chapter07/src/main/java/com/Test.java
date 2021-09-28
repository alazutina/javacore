public class Test {
    int a,b;

    Test(int i, int j){
        a=i;
        b=j;
    }

//    boolean equals(Test o){
//        if(o.a==a && o.b==b) return true;
//        else return false;
//    }

    void math(Test o){
        o.a*=2;
        o.b/=2;
    }
}
