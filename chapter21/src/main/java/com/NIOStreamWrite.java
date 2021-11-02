import java.io.*;
import java.nio.file.*;

class NIOStreamWrite {
    public static void main(String args[]){
        try(OutputStream fout = new BufferedOutputStream(
                Files.newOutputStream(Paths.get("/home/anya/IdeaProjects/chapter21/test.txt"))
        )){
            for(int i =0;i<26;i++) fout.write((byte) ('A'+i));
        } catch (InvalidPathException e){
            System.out.println("ошибка в пути "+e);
        } catch (IOException e){
            System.out.println("ошибка ввода- вывода "+e);
        }
    }
}
