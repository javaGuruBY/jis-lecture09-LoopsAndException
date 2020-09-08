package by.jrr.loops.while_cycle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NestedLoopsTest {

    NestedLoops nestedLoops;

    @Before
    public void setup() {
        nestedLoops = new NestedLoops();
    }

    @Test
    public void printAll() {
        nestedLoops.printAll();
    }

    @Test
    public void printAllWithForEach() {
        nestedLoops.printAllWithForEach();
    }

    @Test
    public void findFirstByNameLamaconda() {
        nestedLoops.findFirstByNameAnton();
    }
}
