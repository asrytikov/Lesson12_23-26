package p2;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Ivan");
        names.add("Masha");
        names.add("Alex");
        names.add("Alex2");
        names.add("Igor");
        names.add("Masha2");
        System.out.println(names.size());

        //names.remove("Alex");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println(names.first());
        System.out.println(names.last());

        SortedSet<String> set = names.subSet("Igor","Masha2");
        System.out.println(set);

        String greater = names.higher("Masha");
        System.out.println(greater);
        System.out.println(names.lower("Masha"));

        SortedSet<String> setL = names.headSet("Ivan");
        System.out.println(setL);
        SortedSet<String> setH = names.tailSet("Ivan");
        System.out.println(setH);

        NavigableSet<String> namDesg = names.descendingSet();
        System.out.println(namDesg);




    }
}
