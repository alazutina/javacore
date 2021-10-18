import java.util.*;

public class PropDemoDef {
    public static void main(String args[]){


        Properties defList = new Properties();
        defList.put("Флорида","Телесси");
        defList.put("Висконсин","Медисон");

        Properties capitals = new Properties(defList);

        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джеффесон-Сити");
        capitals.put("Вашингтон", "ОЛимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        Set<?> states = capitals.keySet();

        for(Object name: states)
            System.out.println("Столица штата "+ name+
                    " - "+capitals.getProperty((String)name)+".");

        System.out.println();
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида - "+str+".");


    }
}

