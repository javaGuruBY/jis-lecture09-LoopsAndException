package by.jrr.loops.exceptions;

import by.jrr.loops.exceptions.exceptions.CalculatorException;
import by.jrr.loops.exceptions.exceptions.DivideByZeroException;
import by.jrr.loops.exceptions.exceptions.NegativeArgumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private Logger log = LoggerFactory.getLogger(Calculator.class);

    public double divide(int a, int b) throws DivideByZeroException, NegativeArgumentException {
        if (b == 0) {
//            log.info("divide on zero is forbidden!");
            throw new DivideByZeroException();
        }
        if (b < 0 || a < 0) {
            throw new NegativeArgumentException();
        }
        return a / b;
    }
}
