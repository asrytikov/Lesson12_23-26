package p1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Igor");
        names.add("Masha");
        boolean fl = names.add("Alex");
        System.out.println(fl);

        System.out.println(names.size());
        for (String name: names){
            System.out.println(name);
        }

        names.remove("Alex");

        System.out.println("________________________");

        HashSet<People> peoples = new HashSet<>();
        peoples.add(new People("Alex"));
        peoples.add(new People("Masha"));
        peoples.add(new People("Katya"));
        peoples.add(new People("Alex"));

        for (People people: peoples){
            System.out.println(people.getName());
        }




    }
}
