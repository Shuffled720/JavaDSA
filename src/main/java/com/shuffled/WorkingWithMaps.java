package com.shuffled;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
//        maps();


    }

    private static void maps() {
        Map<Integer,Person> map= new HashMap<>();
        map.put(1,new Person("alex"));
        map.put(2,new Person("alex2"));
        map.put(3,new Person("alex3"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(map.values());
    }

    record Person(String name){}
    record Diamond(String name){}
}
