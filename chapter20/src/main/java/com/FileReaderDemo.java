import java.io.*;

class FileReaderDemo {
    public static void main(String args[]){
        try(FileReader fr = new FileReader("/home/anya/IdeaProjects/chapter20/src/main/java/FileReaderDemo.java")){
            int c;
            while ((c=fr.read())!=-1) System.out.print((char) c);
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода "+e);
        }
    }
}
