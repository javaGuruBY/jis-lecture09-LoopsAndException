package by.jrr.loops.exceptions;

import by.jrr.loops.exceptions.exceptions.CalculatorException;
import by.jrr.loops.exceptions.exceptions.DivideByZeroException;
import by.jrr.loops.exceptions.exceptions.NegativeArgumentException;
import by.jrr.loops.while_cycle.NestedLoops;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;
    private Logger log = LoggerFactory.getLogger("Test");


    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void divide() {
        try {
            calculator.divide(6, 0);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        } catch (NegativeArgumentException e) {
            e.printStackTrace();
        } catch (CalculatorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void divideWithNegative() {
        try {
            calculator.divide(6, -1);
        } catch (DivideByZeroException e) {
            log.info(DivideByZeroException.class.getName());
        } catch (NegativeArgumentException e) {
            log.info(NegativeArgumentException.class.getName());
        } catch (CalculatorException e) {
            log.info(CalculatorException.class.getName());
        }
    }

    @Test
    public void divideByZero() {
        try {
            calculator.divide(6, 0);
        } catch (DivideByZeroException e) {
            log.info(DivideByZeroException.class.getName());
        } catch (NegativeArgumentException e) {
            log.info(NegativeArgumentException.class.getName());
        } catch (CalculatorException e) {
            log.info(CalculatorException.class.getName());
        }
    }

    @Test(expected = NegativeArgumentException.class)
    public void divideWithNegativeEx() throws CalculatorException {
        calculator.divide(6, -1);
    }
    @Test(expected = DivideByZeroException.class)
    public void divideWithZeroEx() throws CalculatorException {
        calculator.divide(6, 0);
    }
    @Test(expected = CalculatorException.class)
    public void divideWithCalcEx() throws CalculatorException {
        calculator.divide(6, -1);
    }
    @Test(expected = Exception.class)
    public void divideWithEx() throws CalculatorException {
        calculator.divide(6, -1);
    }
}
