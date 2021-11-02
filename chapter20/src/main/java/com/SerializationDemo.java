import java.io.*;

class MyClass implements Serializable{
    String s;
    int i;
    double d;
    public MyClass(String s, int i, double d){
        this.s=s;
        this.i=i;
        this.d=d;
    }
    public String toString(){
        return "s="+s+"; i="+i+"; d="+d;
    }
}

class SerializationDemo {
    public static void main(String args[]){
        try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))){
            MyClass obj1 = new MyClass("Hello", -7,2.7e10);
            System.out.println("obj1: "+obj1);
            objOStrm.writeObject(obj1);
        } catch (IOException e){
            System.out.println("исключение при сериализации - "+e);
        }

        try(ObjectInputStream objISStrm = new ObjectInputStream(new FileInputStream("serial"))){
            MyClass obj2 = (MyClass) objISStrm.readObject();
            System.out.println("obj2: "+obj2);
        }catch (Exception e){
            System.out.println("исключение при десериализации - "+e);
            System.exit(0);
        }
    }
}
