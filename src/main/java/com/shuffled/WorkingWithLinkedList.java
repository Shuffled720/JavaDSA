package com.shuffled;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList=new LinkedList<>();
        linkedList.add(new Person("Alex", 18));
        linkedList.add(new Person("Alex1", 19));
        linkedList.add(new Person("Alex2", 20));
        linkedList.add(new Person("Alex3", 21));
        linkedList.addFirst(new Person("Alex4",22));

        ListIterator<Person> personListIterator=linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }
    public static record Person(String name, int age){}
}
