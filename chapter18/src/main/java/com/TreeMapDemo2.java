import java.util.*;

class TComp implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j,k;
        i = aStr.lastIndexOf(' ');
        j=bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0) return  aStr.compareTo(bStr);
        else
            return k;

    }
}

public class TreeMapDemo2 {
    public static void main(String args[]){

        TreeMap<String, Double> tm =
                new TreeMap<String,Double>(new MyComp());

        tm.put("Джон Доу", new Double(3423.34));
        tm.put("Том Смит", new Double(123.23));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        Set<Map.Entry<String,Double>> set =
                tm.entrySet();

        for (Map.Entry<String,Double> me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());

        }
        System.out.println();

        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance+1000);

        System.out.println("Новый остаток на счетет Джон Доу: "+
                tm.get("Джон Доу"));

    }
}
