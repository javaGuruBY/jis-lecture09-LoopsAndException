package by.jrr.loops.while_cycle;

import by.jrr.loops.while_cycle.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NestedLoops {

    private Logger log = LoggerFactory.getLogger(NestedLoops.class);


    String[][] names = {
            {"max", "bax"},
            {"Oleg", "Anton", "dmitro"},
            {"Metro", "Lamaconda", "Sh"},
            {"boo"}
    };

    public void printAll() {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                log.info(names[i][j]);
            }
        }
    }

    public void printAllWithForEach() {
        for (String[] nameArr : names) {
            for (String name : nameArr) {
                log.info(name);
            }
        }
    }

    public void findFirstByNameAnton() {
        int g = 1;
        OUTER_LOOP: // label
        for (int i = 0; i < names.length; i++) {
            INNER_LOOP:
            for (int j = 0; j < names[i].length; j++) {
                if (names[i][j].equals("Anton")) {
                    log.info("Anton found at " + g + " cycle");
                    break OUTER_LOOP;
                }
                log.info(names[i][j] + " at cycle " + g++);
            }
        }
    }
}
