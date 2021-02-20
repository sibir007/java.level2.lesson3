package ru.geekbrains.java.level2.lesson;

import java.util.ArrayList;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] arr = new Integer[list.size()];
        list.toArray();


    }
}
