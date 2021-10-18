import java.util.*;

public class LinkedListDemo {
    public static void main(String args[]){

        LinkedList <String> li =
                new LinkedList<String>();

        li.add("F");
        li.add("B");
        li.add("D");
        li.add("E");
        li.add("C");
        li.addLast("Z");
        li.addFirst("A");
        li.add(1,"A2");

        System.out.println("Исходное содержимое связного списка li: "+li);

        li.remove("F");
        li.remove(2);

        System.out.println(
                "Содержимое связного li списка "
+
                " после удаления элементов: "+li);

        li.removeFirst();
        li.removeLast();

        System.out.println(
                "Содержимое связного li списка "
                        +
                        " после удаления первого и последнего элементов: "+li);

        String val = li.get(2);

        li.set(2, val+" изменено");

        System.out.println("Содержимое связного списка li после изменения: "+li);
        }
}
