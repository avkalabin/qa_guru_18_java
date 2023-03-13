package ru.avkalabin;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque<String> cities = new ArrayDeque<>();
        cities.add("Moscow");
        cities.addFirst("Perm");
        cities.push("Yekaterinburg");
        cities.addLast("Saint Petersburg");
        cities.add("Saint Petersburg");
        System.out.println(cities);
        System.out.println(cities.contains("Perm"));
        cities.removeLast();
        for (String city : cities) {
            System.out.println(city);
        }



    }

}


