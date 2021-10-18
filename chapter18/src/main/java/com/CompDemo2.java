import java.util.*;

class MyComp1 implements Comparator<String>{
    public int compare(String aStr, String bStr){

        return bStr.compareTo(aStr);

    }

}

public class CompDemo2 {

        public static void main(String args[]){
            MyComp1 mc = new MyComp1();
            TreeSet<String> ts = new TreeSet<String>(
                    (mc.reversed())
            );
            ts.add("C");
            ts.add("A");
            ts.add("B");
            ts.add("E");
            ts.add("F");
            ts.add("D");
            //ts.add("C");

            for (String element: ts)
                System.out.print(element+" ");

            System.out.println();


        }
    }


