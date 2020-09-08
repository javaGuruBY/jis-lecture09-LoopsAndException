package by.jrr.loops.while_cycle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyWhileTest {

    MyWhile myWhile;

    @Before
    public void setup() {
        myWhile = new MyWhile();
    }

    @Test
    public void syntax() {
        myWhile.syntax();
    }

    @Test
    public void arrayCycleSyntax() {
        myWhile.arrayCycleSyntax("Maxim", "apelsin");
    }

    @Test(timeout = 500)
    public void infiniteLoop() {
        myWhile.infiniteLoop();
    }

    @Test(timeout = 500)
    public void infiniteListener() {
        myWhile.infiniteListener();
    }
}
