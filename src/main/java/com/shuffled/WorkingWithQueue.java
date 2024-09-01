package com.shuffled;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket=new LinkedList<>();
        supermarket.add(new Person("Alex",24));
        supermarket.add(new Person("Alex1",18));
        supermarket.add(new Person("Alex2",2));

        System.out.println(supermarket);

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    public record Person (String name, int age) {}
}
