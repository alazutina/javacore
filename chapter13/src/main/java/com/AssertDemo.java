 class AssertDemo {
    static int val = 3;
    static int intgetnum(){
        return val--;
    }

    public static void main(String args[]){
        int n;
        for(int i=0;i<10;i++){
            n = intgetnum();
            assert  n>0;
            System.out.println("n = "+n);
        }
    }
}