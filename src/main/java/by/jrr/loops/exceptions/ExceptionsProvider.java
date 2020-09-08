package by.jrr.loops.exceptions;

import java.util.concurrent.ThreadLocalRandom;

public class ExceptionsProvider {
    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";

    public void syntaxHandleException() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // do in any case
        }
    }

    public void wrongSyntaxHandleException() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // do in any case
        }
    }

    public void syntaxTrow() throws InterruptedException {
        Thread.sleep(500);
    }

    public String riskOperation() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            return SUCCESS;
        }
        return FAIL;
    }

    public void callToRiskOperation() {
        if (riskOperation().equals(SUCCESS)) {
            //continue program
        } else if (riskOperation().equals(FAIL)) {
            //exit program
            //or
            //notify about fail
        }
    }

    public void syntaxHandleExceptionNested() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } finally {
            // do in any case
        }
    }
}
