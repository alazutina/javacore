import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite1 {
    public static void main(String args[]) {
        FileOutputStream fout = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try {

            fout = new FileOutputStream("/home/anya/IdeaProjects/chapter21/test2.txt");
            fChan = fout.getChannel();
            mBuf = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) mBuf.put((byte) ('A' + i));
            mBuf.rewind();
            fChan.write(mBuf);
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода " + e);
            System.exit(1);
        } finally {
            // {
            try {
                if (fChan != null) fChan.close();
            } catch (IOException e) {
                System.out.println("ошибка закрытия файла");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println("ошибка закрытия файла");
            }
        }
    }
}