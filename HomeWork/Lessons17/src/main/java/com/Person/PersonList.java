package com.Person;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@ToString
public class PersonList {
    Person person = new Person("Доминик", "Тореро");
    Person person1 = new Person("Уголь", "Андрей");
    Person person2 = new Person("Дед", "Максим");
    Person person3 = new Person("Клинтон", "Бил");
    Person person4 = new Person("Пресли", "Элвис");

    ArrayList<Person> persons = new ArrayList<Person>(Arrays.asList(person, person1, person2, person3, person4));

    public ArrayList<Person> firstLetter() {
        String start = "Д";
        ArrayList<Person> copy = new ArrayList<>();
        for (Person per : persons) {
            if (per.getSurname().startsWith(start))
                copy.add(per);
        }
        System.out.println(copy);
        return copy;
    }

    public void info() {
        System.out.println(persons);
    }
}
