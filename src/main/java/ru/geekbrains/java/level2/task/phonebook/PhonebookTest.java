package ru.geekbrains.java.level2.task.phonebook;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class PhonebookTest {
    public static void main(String[] args) {
        PhonebookList phonebook = new PhonebookList();
        phonebook.add("Иванов", "+7-911-000-00-01");
        phonebook.add("Петров", "+7-911-000-00-02");
        phonebook.add("Сидоров", "+7-911-000-00-03");
        phonebook.add("Александров", "+7-911-000-00-04");
        phonebook.add("Романов", "+7-911-000-00-05");
        phonebook.add("Дмитриев", "+7-911-000-00-06");
        phonebook.add("Алексеев", "+7-911-000-00-07");
        phonebook.add("Константинов", "+7-911-000-00-08");
        phonebook.add("Максимов", "+7-911-000-00-09");
        phonebook.add("Денисов", "+7-911-000-00-10");
        phonebook.add("Родионов", "+7-911-000-00-11");
        phonebook.add("Сергеев", "+7-911-000-00-12");
        phonebook.add("Иванов", "+7-911-000-00-01");
        phonebook.add("Иванов", "+7-911-000-00-13");
        phonebook.add("Дмитриев", "+7-911-000-00-14");
        phonebook.add("Алексеев", "+7-911-000-00-15");
        phonebook.add("Сидоров", "+7-911-000-00-16");
        phonebook.add("Александров", "+7-911-000-00-04");
        phonebook.add("Родионов", "+7-911-000-00-11");
        phonebook.add("Родионов", "+7-911-000-00-18");
        phonebook.add("Родионов", "+7-911-000-00-19");

        System.out.println(phonebook);

        List<Contact> getContact1 = phonebook.get("Родионов");
        System.out.println(getContact1);

        List<Contact> getContact2 = phonebook.get("Иванов");
        System.out.println(getContact2);

        //phonebook.print();
    }
}
