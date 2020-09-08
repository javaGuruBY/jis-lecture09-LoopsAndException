package by.jrr.loops.while_cycle;

import by.jrr.loops.while_cycle.bean.Person;
import by.jrr.loops.while_cycle.service.PersonProvider;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ForEachTest {

    ForEach forEach;

    @Before
    public void setup() {
        forEach = new ForEach();
    }


    @Test
    public void arrayCycleSyntax() {
        forEach.arrayCycleSyntax("maksim", "Andrei");
    }

    @Test(timeout = 500)
    public void collectionCycle() {
        List<Person> personList = PersonProvider.getNPersons(1000);
        forEach.collectionCycle(personList);
    }

    @Test
    public void findByName() {
        Person expected = new Person(1, "max", 23);
        Person actual = forEach.findByName("max", PersonProvider.getTestPersons());
        assertEquals(expected, actual);
    }
}
