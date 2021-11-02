import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead1 {

        public static void main(String args[]){
            int count;


            try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("/home/anya/IdeaProjects/chapter21/test.txt")))
            {

                ByteBuffer mBuf = ByteBuffer.allocate(126);

                do{
                    count = fChan.read(mBuf);
                    if(count!=-1){
                        mBuf.rewind();
                        for(int i=0; i<count;i++) System.out.print((char) mBuf.get());
                    }
                } while (count !=-1);
                System.out.println();

            } catch (InvalidPathException e){
                System.out.println("ошибка в пути "+e);
            }
               catch (IOException e){
                System.out.println("Ошибка ввода-вывода "+e);
            }



        }
    }

//}
