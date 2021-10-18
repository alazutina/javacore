import java.util.*;

class CompLastNames implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j;
        i = aStr.lastIndexOf(' ');
        j=bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

    }
}

class CompThenByFirstName implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

public class TreeMapDemo2A {
    public static void main(String args[]){

        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm =
                new TreeMap<String,Double>(compLastThenFirst);

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
