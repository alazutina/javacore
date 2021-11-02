
import java.io.*;

class CharArrayReaderDemo {
    public static void main(String args[]){
        String tnp = "qwertyuiopljhgfdsazxvbnm";
        int length = tnp.length();
        char c[] = new char[length];

        tnp.getChars(0,length,c,0);
        int i;

        try(CharArrayReader input1 = new CharArrayReader(c)){
            System.out.println("input1: ");
            while ((i=input1.read())!=-1){System.out.print((char)i );}
            System.out.println();
        } catch (IOException e){
            System.out.println("Ошибки ввода-вывода- "+e);

        }

        try(CharArrayReader input2 = new CharArrayReader(c,0,5)){System.out.println("input1: ");
            while ((i=input2.read())!=-1){System.out.print((char)i );}
            System.out.println();
        } catch (IOException e){
            System.out.println("Ошибки ввода-вывода- "+e);

        }
    }
}
