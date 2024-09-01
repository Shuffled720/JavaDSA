package com.shuffled;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List colours=new ArrayList();
        colours.add("blue");
        colours.add("purple");
        colours.add(1);
        colours.add(new Object());

        System.out.println(colours);

        List<String> colours2=new ArrayList<>();
        colours2.add("blue");
        colours2.add("purple");
        System.out.println(colours2.size());
        System.out.println(colours2.contains("red"));
        System.out.println(colours2.contains("blue"));
        System.out.println(colours2);

        for(String s: colours2){
            System.out.println(s);
        }
        colours2.forEach(System.out::println);

    }
}
