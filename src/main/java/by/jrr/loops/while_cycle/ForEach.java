package by.jrr.loops.while_cycle;

import by.jrr.loops.while_cycle.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ForEach {

    private Logger log = LoggerFactory.getLogger(ForEach.class);

    public void arrayCycleSyntax(String... arg) {
        for (String value : arg) {
            log.info("element " + value);
        }
    }

    public void collectionCycle(List<Person> personList) {
        for(Person person : personList) {
            log.info(person.toString().toUpperCase());
        }
    }
    public void collectionCycle(Person[] personList) {
        collectionCycle(Arrays.asList(personList));
    }

    public Person findByName(String name, Person[] people) {
        for(Person person : people) {
            if(person.getName().equals(name)); {
                return person;
            }
        }
        return null;
    }

    public void findFirstByName(String name, Person[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].getName().equals(name)) {
                log.info(name + " found at " + i);
                break;
            }
            log.info("cycle " + i);
        }
    }

    public void printAllExceptByName(String name, Person[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].getName().equals(name)) {
                continue;
            }
            log.info(people[i].toString());
        }
    }

}
