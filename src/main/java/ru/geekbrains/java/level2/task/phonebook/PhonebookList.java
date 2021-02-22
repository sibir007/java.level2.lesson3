package ru.geekbrains.java.level2.task.phonebook;

import java.util.*;

public class PhonebookList {
    private List<Contact> phonebook = new LinkedList<>();



    /**
     * Добавляет новый контакт в телефонную книгу,
     * предварительно проверяя есть ли уже такой,
     * выводит соответствующие сообщения
     * @param name имя контакта
     * @param phone телефон контакта
     */
    public void add(String name, String phone) {
        boolean check = true;
        Contact newContact = new Contact(name, phone);
        Iterator<Contact> iter = phonebook.iterator();
        while (iter.hasNext()){
            if (newContact.equals(iter.next())){
                check = false;
                break;
            }
        }
        if (check) {
            phonebook.add(new Contact(name, phone));
            System.out.println("Контакт " + name + " " + phone + " добавлен в телефонную книгу");
        }else {
            System.out.println("Контакт " + name + " " + phone + " уже есть в телефонной книге");
        }
        Collections.sort(phonebook);
    }

    /**
     * Получает в качестве аргумента имя контакта
     * осуществляет его поиск в телефонной книге
     * возвращает List всех контактов совпадающих
     * по имени
     * @param name имя контакта
     * @return List всех контактов совпадающих по имени
     */
    public List<Contact> get(String name){
        List contacts = new ArrayList();
        Iterator<Contact> iter = phonebook.iterator();
        while (iter.hasNext()){
            Contact nextContact = iter.next();
            if (nextContact.getName().equals(name)){
                contacts.add(nextContact);
            }
        }
        return contacts;
    }

    @Override
    public String toString() {
        String phonebook = "Телефонная книга";
        for (Contact contact: this.phonebook) {
            phonebook = phonebook + contact.toString();
        }
        return phonebook;
    }
}
