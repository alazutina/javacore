import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

class MappedChannelRead1 {
    public static void main(String args[]){
        FileInputStream fin = null;
        FileChannel fchan = null;
        long fsize;
        MappedByteBuffer mbuf;

        try{
            fin = new FileInputStream("/home/anya/IdeaProjects/chapter21/test.txt");
            fchan = fin.getChannel();
            fsize  = fchan.size();
            mbuf = fchan.map(FileChannel.MapMode.READ_ONLY,0,fsize);

                 for(int i=0;i<fsize;i++){
                System.out.print((char) mbuf.get());

            }System.out.println();

        }catch (IOException e){
            System.out.println("ошибка ввода-вывода "+e);
        }
        finally {
            {
                try{
                    if(fchan!=null) fchan.close();
                } catch (IOException e){
                    System.out.println("ошибка закрытия файла");
                }
                try{
                    if(fin!=null) fin.close();
                } catch (IOException e){
                    System.out.println("ошибка закрытия файла");
                }
            }
        }
    }
}