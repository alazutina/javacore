import java.net.*;
import java.io.*;
import java.util.*;



public class HttpURLDemo {
    public static void main(String args[]) throws Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection)  hp.openConnection();

        System.out.println("МЕтод запроса: "+hpCon.getRequestMethod());
        System.out.println("код ответа: "+hpCon.getResponseCode());
        System.out.println("Ответное сообщение: "+hpCon.getResponseMessage());

        Map <String, List<String>> hdrMap  = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовлк: ");
        for(String k: hdrField){
            System.out.println("ключ: "+k+" значение- "+ hdrMap.get(k));
        }

    }

}
