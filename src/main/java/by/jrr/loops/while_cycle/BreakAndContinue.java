package by.jrr.loops.while_cycle;

import by.jrr.loops.while_cycle.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BreakAndContinue {

    private Logger log = LoggerFactory.getLogger(BreakAndContinue.class);

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

    public void findFirstByNameForEach(String name, Person[] people) {
        int i = 0;
        for(Person person : people) {
            if(person.getName().equals(name)) {
                log.info(name + " found at " + i);
                break;
            }
            log.info("cycle " + i);
            i++;
        }
    }
    public void printAllExceptByNameForEach(String name, Person[] people) {
        for(Person person : people) {
            if(person.getName().equals(name)) {
                continue;
            }
            log.info(person.toString());
        }
    }
}
