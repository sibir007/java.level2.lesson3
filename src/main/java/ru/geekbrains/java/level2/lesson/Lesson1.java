package ru.geekbrains.java.level2.lesson;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add(1,"B");
        System.out.println(arrayList);
        arrayList.remove("E");
        arrayList.remove(2);
        System.out.println(arrayList);


    }
}
