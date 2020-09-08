package by.jrr.loops.while_cycle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDoWhileTest {

    MyDoWhile myDoWhile;

    @Before
    public void setup() {
        myDoWhile = new MyDoWhile();
    }

    @Test
    public void syntax() {
        myDoWhile.syntax();
    }
}
