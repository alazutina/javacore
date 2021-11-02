import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;


class ExplicitChannelRead2 {
    public static void main(String args[]){
        FileInputStream fin=null;
        FileChannel fchan = null;
        ByteBuffer mBuf;


        int count;


        try{
            fin = new FileInputStream("/home/anya/IdeaProjects/chapter21/test.txt");
            fchan =fin.getChannel();
            mBuf = ByteBuffer.allocate(128);
            do{
                count =fchan.read(mBuf);


                if(count!=-1){
                    mBuf.rewind();
                    for(int i=0; i<count;i++) System.out.print((char) mBuf.get());
                }
            } while (count !=-1);
            System.out.println();

        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода "+e);
        } finally {

              try{  if(fchan!=null )fchan.close();
            } catch (IOException e) {System.out.println("ошибка закрытия файла");}
              try{
                  if(fin!=null) fin.close();
              } catch (IOException e) {
                  System.out.println("ошибка закрытия файла");
              }
        }



    }
}

