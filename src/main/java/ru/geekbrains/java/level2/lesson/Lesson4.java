package ru.geekbrains.java.level2.lesson;

import java.util.*;

public class Lesson4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A","B","C","C","A","A","B","C","B"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("A")) {
                iter.remove();
            }
        }
        System.out.println(list);



    }
}
