import java.util.*;
import java.util.stream.*;


class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail1(String n, String p, String e){
        name = n;
        phonenum  = p;
        email = e;
    }
}


class NamePhone1{
    String name;
    String phonenum;

    NamePhone1 (String n, String p){
        name = n;
        phonenum = p;
    }
}

class StreamDemo7{

    public  static  void main(String args[]){

        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail1("Larry", "555-5555","Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail1("James", "555-4444","James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail1("Mary", "555-3333","Mary@HerbSchildt.com"));




        Stream<NamePhone1> nameAndPhone1 = myList.stream().map(
                (a)->new NamePhone1(a.name,a.phonenum)
        );

        List<NamePhone1> npList = nameAndPhone1.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в списк List: ");
        for(NamePhone1 e: npList)
            System.out.println(e.name+": "+e.phonenum);

        nameAndPhone1 = myList.stream().map(
                (a)->new NamePhone1(a.name, a.phonenum)
        );


      Set<NamePhone1> npSet = nameAndPhone1.collect(Collectors.toSet());

      System.out.println("\nИмена и номера телефонов в Set: ");
      for(NamePhone1 e: npSet)
          System.out.println(e.name+" "+e.phonenum);


    }


}
