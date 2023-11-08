package p3;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<People> peoples = new TreeSet<>();
        peoples.add(new People("Alex"));
        peoples.add(new People("Ivan"));

        System.out.println(peoples);

    }

}
