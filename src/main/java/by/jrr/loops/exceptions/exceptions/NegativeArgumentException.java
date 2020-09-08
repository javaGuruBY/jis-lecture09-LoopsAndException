package by.jrr.loops.exceptions.exceptions;

public class NegativeArgumentException extends CalculatorException {
    public NegativeArgumentException() {
        super("operations with negative is forbidden");
    }
}
