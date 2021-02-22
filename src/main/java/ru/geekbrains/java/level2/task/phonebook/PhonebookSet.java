package ru.geekbrains.java.level2.task.phonebook;

import java.util.*;

public class PhonebookSet {
    private Set<Contact> phonebook = new TreeSet<>();


    /**
     * Добавляет новый контакт в телефонную книгу,
     *
     * @param name  имя контакта
     * @param phone телефон контакта
     */
    public void add(String name, String phone) {
        phonebook.add(new Contact(name, phone));
    }

    /**
     * Получает в качестве аргумента имя контакта
     * осуществляет его поиск в телефонной книге
     * возвращает List всех контактов совпадающих
     * по имени
     *
     * @param name имя контакта
     * @return List всех контактов совпадающих по имени
     */
    public List<Contact> get(String name) {
        List contacts = new ArrayList();
        Iterator<Contact> iter = phonebook.iterator();
        while (iter.hasNext()) {
            Contact nextContact = iter.next();
            if (nextContact.getName().equals(name)) {
                contacts.add(nextContact);
            }
        }
        return contacts;
    }

    @Override
    public String toString() {
        String phonebook = "Телефонная книга";
        for (Contact contact : this.phonebook) {
            phonebook = phonebook + contact.toString();
        }
        return phonebook;
    }

    public void print() {
        Iterator<Contact> iter = phonebook.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
