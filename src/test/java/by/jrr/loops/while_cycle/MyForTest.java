package by.jrr.loops.while_cycle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyForTest {

    MyFor myFor;

    @Before
    public void setup() {
        myFor = new MyFor();
    }

    @Test
    public void syntax() {
        myFor.syntax();
    }

    @Test
    public void arrayCycleSyntax() {
        myFor.arrayCycleSyntax("Maxim", "apelsin");
    }
    @Test(timeout = 500)
    public void infiniteLoop() {
        myFor.infiniteLoop();
    }

    @Test
    public void quiz() {
        myFor.quiz();
    }
}
