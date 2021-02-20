package ru.geekbrains.java.level2.lesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        linkedList.add(1,"A2");
        System.out.println("1. linkedList: " + linkedList);
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("2. linkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("3. linkedList: " + linkedList);
        String val = linkedList.get(2);
        linkedList.set(2, val + " change");
        System.out.println("4. linkedList: " + linkedList);
    }
}
