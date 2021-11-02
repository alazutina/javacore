import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;


class DirList1 {
    public static void main(String args[]){
        String dirname = ("/home/anya/");
        DirectoryStream.Filter<Path> how =
                new DirectoryStream.Filter<Path>()
       {public boolean accept(Path filename) throws IOException{
           if(Files.isWritable(filename)) return true;
           else return false;
       }};
                try(DirectoryStream<Path> dirstrm =
                        Files.newDirectoryStream(Paths.get(dirname),how)){
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

