package com.shuffled;

import java.util.LinkedList;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList=new LinkedList<>();
        linkedList.add(new Person("Alex", 18));
        linkedList.add(new Person("Alex1", 19));
        linkedList.add(new Person("Alex2", 20));
        linkedList.add(new Person("Alex3", 21));

    }
    public static record Person(String name, int age){}
}
