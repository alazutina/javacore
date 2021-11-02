import java.io.*;

class ByteArrayInputStreamDemo {
    public static void main(String args[]){
        String tmp = "fwjhbjwhbfwebbwiuiwuiubwuviu";
        byte b[]=tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2
                = new ByteArrayInputStream(b,0,3);
    }
}
