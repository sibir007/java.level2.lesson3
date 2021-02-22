package ru.geekbrains.java.level2.task.phonebook;

import java.util.Objects;

public class Contact implements Comparable{
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals (Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        Contact other = (Contact) otherObject;
        return name.equals(other.name)
                && phone.equals(other.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }


    @Override
    public String toString() {
        return "\nContact[name=" + name
                + ",phone=" + phone
                + "]";
    }

    @Override
    public int compareTo (Object otherObject) {
        Contact other = (Contact) otherObject;
        if (this.name.compareTo(other.getName()) > 0){
            return 1;
        }
        if (this.name.compareTo(other.name) < 0){
            return -1;
        }
        return 0;
    }

}
