package by.jrr.loops.exceptions;

public class ForInitializerError {
    static int counter = 0;

    static {
        counter = 1 / 0;
    }
}
