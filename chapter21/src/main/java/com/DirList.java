import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;


class DirList {
    public static void main(String args[]){
        String dirname = ("/home/anya/");
        try(
                DirectoryStream<Path> dirstrm=
                        Files.newDirectoryStream(Paths.get(dirname))
                ){
            System.out.println("Каталог "+dirname);
            for(Path entry:dirstrm){
                BasicFileAttributes attr =
                        Files.readAttributes(entry,BasicFileAttributes.class);
                if(attr.isDirectory()) System.out.print("<DIR>");
                else System.out.print("   ");
                System.out.println( entry.getName(1));

            }
        } catch (InvalidPathException e){
            System.out.println("ошибка указания пути "+e);
        } catch (NotDirectoryException e){
            System.out.println(dirname+"не является каталогом");
        } catch (IOException e){
            System.out.println("ошибка ввода-вывода "+e);
        }
    }
}
