package ru.avkalabin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        Map<Integer, String> cities = new HashMap<>();
        System.out.println(cities);

        var citiesList = Map.of(
                1, "Perm",
                2, "Moscow",
                3, "Yekaterinburg",
                4, "Saint Petersburg"
        );
        cities.putAll(citiesList);
        System.out.println(cities);
        System.out.println(cities.get(1));
        cities.put(11, "Samara");
        cities.remove(3);
        System.out.println(cities);
        System.out.println(cities.containsValue("Perm"));
        System.out.println(cities.values());

        Iterator<Map.Entry<Integer, String>> iterator = cities.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getValue());
            iterator.remove();
        }


        System.out.println(cities);
    }
}
