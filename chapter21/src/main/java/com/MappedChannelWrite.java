import java.io.IOException;
import java.io.OutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class MappedChannelWrite {
    public static void main(String args[]){
        try(FileChannel fChan = (FileChannel)
                Files.newByteChannel(Paths.get("/home/anya/IdeaProjects/chapter21/test.txt"),
                    StandardOpenOption.WRITE,
        StandardOpenOption.READ,
        StandardOpenOption.CREATE)){
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_WRITE,0,26);
            for(int i=0;i<26;i++) mBuf.put((byte) ('A'+i));
        } catch (InvalidPathException e){
            System.out.println("Ошибка в пути "+ e);
        }
        catch (IOException e){
            System.out.println("ошибка ввода=выода "+e);
        }
    }
}
