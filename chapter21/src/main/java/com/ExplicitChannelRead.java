import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;


class ExplicitChannelRead {
    public static void main(String args[]){
        int count;
        Path filepath = null;

        try{
            filepath = Paths.get("/home/anya/IdeaProjects/chapter21/test.txt");

        }catch (InvalidPathException e){
            System.out.println("Path err "+e);
            return;
        }

        try(SeekableByteChannel fChan = Files.newByteChannel(filepath)){
            ByteBuffer mBuf = ByteBuffer.allocate(126);

            do{
                count = fChan.read(mBuf);
                if(count!=-1){
                    mBuf.rewind();
                    for(int i=0; i<count;i++) System.out.print((char) mBuf.get());
                }
            } while (count !=-1);
            System.out.println();

        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода "+e);
        }



    }
}
