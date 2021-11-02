import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

class MappedChannelRead {
    public static void main(String args[]){
        try(FileChannel fCh = (FileChannel) Files.newByteChannel(Paths.get("/home/anya/IdeaProjects/chapter21/test.txt"))){
            long fSize = fCh.size();
            MappedByteBuffer mBuf = fCh.map(FileChannel.MapMode.READ_ONLY,0,fSize);
            for(int i=0;i<fSize;i++){
                System.out.print((char) mBuf.get());

            }System.out.println();

        }catch (InvalidPathException e){
            System.out.println("Ошибка указания пути "+e);
        } catch (IOException e){
            System.out.println("ошибка ввода-вывода "+e);
        }
    }
}
