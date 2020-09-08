package by.jrr.loops.while_cycle.service;

import by.jrr.loops.while_cycle.bean.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PersonProvider {

    public static List<Person> getNPersons(int i) {
        List<Person> personList = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            Person person = new Person("Name is " + j,
                    ThreadLocalRandom.current().nextInt(18, 65));
            personList.add(person);
        }
        return personList;
    }

    public static Person[] getTestPersons() {
        return new Person[]{
                new Person(1, "max", 23),
                new Person(2, "Andrei", 35),
                new Person(3, "Boris", 54),
                new Person(4, "Tania", 18),
                new Person(5, "oleg", 28)
        };
    }
}
