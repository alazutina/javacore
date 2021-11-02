import java.io.*;

class ConsoleDemo {
    public static void main(String args[]){
        String str;
        Console con;

        con = System.console();

        if(con == null) return;

        str = con.readLine("Введите строку: ");
con.printf("Введенная строка: %s\n", str);
    }
}

