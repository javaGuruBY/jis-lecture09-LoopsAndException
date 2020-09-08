package by.jrr.loops.while_cycle;

import by.jrr.loops.while_cycle.service.PersonProvider;
import org.junit.Before;
import org.junit.Test;

public class BreakAndContinueTest {
    BreakAndContinue breakAndContinue;

    @Before
    public void setup() {
        breakAndContinue = new BreakAndContinue();
    }

    @Test
    public void findIndexAtByName() {
        breakAndContinue.findFirstByName("Boris", PersonProvider.getTestPersons());
    }

    @Test
    public void printAllExceptByName() {
        breakAndContinue.printAllExceptByName("Boris", PersonProvider.getTestPersons());
    }

    @Test
    public void findIndexAtByNameForEach() {
        breakAndContinue.findFirstByNameForEach("Boris", PersonProvider.getTestPersons());
    }

    @Test
    public void printAllExceptByNameForEach() {
        breakAndContinue.printAllExceptByNameForEach("Boris", PersonProvider.getTestPersons());
    }


}
