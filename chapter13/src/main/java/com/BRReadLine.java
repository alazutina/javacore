import java.io.*;

class BRReadLine {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("стоп"));
    }
}
