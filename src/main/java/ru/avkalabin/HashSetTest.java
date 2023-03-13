package ru.avkalabin;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Moscow");
        cities.add("Saint Petersburg");
        cities.add("Perm");
        cities.add("Yekaterinburg");
        cities.add("Moscow");
        cities.add("Allan-ya");
        System.out.println(cities.contains("Moscow"));
        Iterator<String> i = cities.iterator();

        do {
            System.out.println(i.next());
            i.remove();
        } while (i.hasNext());

        System.out.println(cities);


    }
}
