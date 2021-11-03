import java.util.*;
import java.util.stream.*;


class StreamDemo10 {

    public static void main(String args[]){

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator<String> splitIter = myStream.spliterator();
        Spliterator<String> splitIter2 = splitIter.trySplit();

        if(splitIter2 !=null){
            System.out.println("Результат, выводимый splitItr2: ");
            splitIter2.forEachRemaining((n)->System.out.println(n));
        }

        System.out.println("Результат выводимый итератором splitItr: ");
        splitIter.forEachRemaining((n)->System.out.println(n));

    }


}

