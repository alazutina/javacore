import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String args[]){
        try(FileChannel fChan =(FileChannel)
                Files.newByteChannel(Paths.get("/home/anya/IdeaProjects/chapter21/test.txt"),
                    StandardOpenOption.WRITE,
        StandardOpenOption.CREATE)){
            ByteBuffer mBuf = ByteBuffer.allocate(24);

            for(int i =0; i<24;i++)mBuf.put((byte) ('A'+i));
            mBuf.rewind();
            fChan.write(mBuf);
        } catch (InvalidPathException e){
            System.out.println("ошибкка в пути "+e);
        } catch (IOException e){
            System.out.println("ошибка ввода-вывода "+e);
            System.exit(1);
        }
    }
}
