import javax.imageio.IIOException;
import java.nio.file.*;
import  java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String args[]){
        if(args.length!=2){
            System.out.println("Приминение - откуда и куда копировать");
            return;
        }

        try{
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);
           Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);
       //     Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        }

        catch (InvalidPathException e){
            System.out.println("Ошибка в пути "+e);
        }
        catch (IOException e){
            System.out.println("ошибка ввода-вывода "+e );
        }
    }

}
