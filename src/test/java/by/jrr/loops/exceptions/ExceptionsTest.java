package by.jrr.loops.exceptions;

import org.junit.Test;

public class ExceptionsTest {

    @Test(expected = ArithmeticException.class)
    public void t1() {
        int i = 1 / 0;
    }

    @Test(expected = NumberFormatException.class)
    public void t2() {
        String name = "name";
        Long i = Long.valueOf(name);
    }

    @Test(expected = ClassCastException.class)
    public void t3() {
        Object name = "name";
        StringBuffer i = (StringBuffer) name;
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void t4() {
        int[] ints = new int[0];
        int l = ints[1];
    }

    @Test(expected = NullPointerException.class)
    public void t5() {
        int[] ints = null;
        int l = ints[1];
    }

    //JVM
    @Test(expected = ExceptionInInitializerError.class)
    public void t6() {
        new ForInitializerError();
    }

    @Test(expected = StackOverflowError.class)
    public void t7() {
        t7();
    }
    @Test(expected = OutOfMemoryError.class)
    public void t8() {
        StringBuffer memoryKiller = new StringBuffer("memory killer");
        for(int i=0; i<Integer.MAX_VALUE; i++) {
            memoryKiller.append(memoryKiller.toString());
        }
    }

    @Test(expected = InterruptedException.class)
    public void t9() throws InterruptedException {
        try{
            throw new InterruptedException();
        } finally {
            System.out.println("prints anyway");
        }
    }

}
