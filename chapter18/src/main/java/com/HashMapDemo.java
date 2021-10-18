import java.util.*;

public class HashMapDemo {
public static void main(String args[]){
HashMap<String,Double> hm =
new HashMap<String,Double>();

hm.put("Джон Доу", new Double(3423.34));
    hm.put("Том Смит", new Double(123.23));
    hm.put("Джейн Бейкер", new Double(1378.00));
    hm.put("Тод Холл", new Double(99.22));
    hm.put("Ральф Смит", new Double(-19.08));

    Set<Map.Entry<String,Double>> set=
            hm.entrySet();
    for (Map.Entry<String,Double> me: set){
        System.out.print(me.getKey()+": ");
        System.out.println(me.getValue());


    }
    System.out.println();

    double balance = hm.get("Джон Доу");
    hm.put("Джон Доу", balance+1000);

    System.out.println("Новый остаток на счетет Джон Доу: "+
            hm.get("Джон Доу"));

}

}
