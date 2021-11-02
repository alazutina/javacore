import java.net.*;

class URLDemo {
    public static void main(String argsp[]) throws MalformedURLException{
        URL hp = new URL("https://lesgorodok.odinedu.ru/svedenia_ob_obrazov_org/Dokumentyi/");
        System.out.println("Протокол: "+ hp.getProtocol());
        System.out.println("Порт: "+hp.getPort());

        System.out.println("Хост: "+hp.getHost());
        System.out.println("Файл: "+hp.getFile());
        System.out.println("ПОлная форма: "+hp.toExternalForm());
    }
}
