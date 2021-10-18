import java.util.*;

public class AlgorithmsDemo {
public static void main(String args[]){

    LinkedList <Integer> li = new LinkedList<Integer>();
    li.add(-8);
    li.add(20);
    li.add(-20);
    li.add(8);

    Comparator<Integer> r = Collections.reverseOrder();

    Collections.sort(li,r);

    System.out.print("Список отсортирован в обратном порядке: ");

    for(int i: li) System.out.print(i+" ");
    System.out.println();

    Collections.shuffle(li);

    System.out.print("Список перетасован: ");

    for(int i: li) System.out.print(i+" ");

    System.out.println();

    System.out.println("Минимум: "+ Collections.min(li));
    System.out.println("Максимум: "+Collections.max(li));


}

}
