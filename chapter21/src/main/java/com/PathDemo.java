
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

 class PathDemo {
  public static void main(String args[]){
   Path filepath = Paths.get("/home/anya/IdeaProjects/chapter21/test.txt");

   System.out.println("Имя файла: "+filepath.getName(1));
   System.out.println("Путь к файлу: "+filepath);
   System.out.println("Абсолютный путь к файлу: "+filepath.toAbsolutePath());
   System.out.println("Родительский каталог: "+
           filepath.getParent());

   if(Files.exists(filepath)) System.out.println("Файл существует");
else     System.out.println("Файл не существует");

try{
 if(Files.isHidden(filepath)) System.out.println("файл скрыт");
 else System.out.println("файл не скрыт");
} catch (IOException e){
 System.out.println("ошибка ввода-вывода "+e);
}
Files.isWritable(filepath);
System.out.println("файл доступен для записи");

Files.isReadable(filepath);
System.out.println("файл доступен для чтения");

try{
 BasicFileAttributes attribs =
         Files.readAttributes(filepath,BasicFileAttributes.class);
 if(attribs.isDirectory())System.out.println("это каталог");
 else System.out.println("это не каталог");

 if(attribs.isRegularFile()) System.out.println("это обычный файл");
 else System.out.println("это не обычный файл");

 if(attribs.isSymbolicLink()) System.out.println("Это символическая ссылка");
 else System.out.println("Это не символическая ссылка");

 System.out.println("Время последней модификации файла: "+
         attribs.lastModifiedTime());
 System.out.println("Размер файла: " +attribs.size()+ " байтов");
} catch (IOException e){
 System.out.println("Ошибка чтения атрибутов "+e);
}

  }
}
