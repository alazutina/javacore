package MyPack;

public class Balance1{
    public  String name;
    public  double bal;
    public Balance1(String n, double b){
        name = n;
        bal = b;
    }

   public void show(){
        if(bal<0)
            System.out.print("-->");
        System.out.println(name+ " : $"+bal);
    }
}
