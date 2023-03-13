package ru.avkalabin;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Moscow");
        cities.add("Saint Petersburg");
        cities.add("Perm");
        cities.add("Yekaterinburg");
        cities.add("Moscow");
        System.out.println(cities);
        cities.add(1, "Paris");
        System.out.println(cities);
        System.out.println(cities.contains("perm"));
        System.out.println(cities.contains("Perm"));
        cities.remove("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }



    }

}

