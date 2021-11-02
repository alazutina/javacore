import java.net.*;
import java.io.*;
import java.util.Date;


 class UCDemo {
  public static void main(String args[]) throws Exception {
   int c;
   URL hp = new URL("http://www.internic.net");
   URLConnection hpCon = hp.openConnection();

   long d = hpCon.getDate();
   if (d == 0) System.out.println("Сведения о дате отсутвсуют");
   else System.out.println("Дата - " + new Date(d));

   System.out.println("Тип содержимого - " + hpCon.getContentType());

   d = hpCon.getLastModified();
   if (d == 0) System.out.println("Сведения о дате модификации отсутвсуют");
   else System.out.println("Дата модификации - " + new Date(d));

   long len = hpCon.getContentLengthLong();
   if (len == -1) System.out.println("Длина содержимого недоступна");
   else System.out.println("Длина - " + len);

   if (len != 0) {System.out.println("==Содержимое==");
   InputStream input = hpCon.getInputStream();
   while (((c = input.read()) != -1)) {
    System.out.print((char) c);
   }

   input.close();
  } else {
    System.out.println("содержимое недоступно");

   }
  }
}
