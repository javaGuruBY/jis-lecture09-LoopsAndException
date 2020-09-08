package by.jrr.loops.while_cycle;

import com.sun.jdi.connect.spi.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


public class MyFor {

    private Logger log = LoggerFactory.getLogger(MyFor.class);

    public void syntax() {

        log.info("start cycle");
        for (int i = 4; i > 1; --i) {
            log.info("Cycling " + i);
        }
        log.info("end cycle");
    }

    public void arrayCycleSyntax(String... arg) {
        for (int i = 0; i < arg.length; i++) {
            log.info("element " + i + " = " + arg[i]);
        }
    }

    public void infiniteLoop() {
        for (; ; ) {
            log.info("infinite loop");
        }
    }

    public void quiz() {
        boolean b = false;
        for (int i = 0; b != b; ) {
            log.info("cycle N " + i++);
        }
    }

    public void weired1() {
        int i = 0;
        for (String obj = "hello"; i < 10; i++) {
        }
    }

    public void weired2() {
        int i;
        int k;
        String obj;
        for (i = 0, k = 0, obj = "hello"; i < 10; i++) {
        }
        for (int j = 0, l = 0; j + l < 10; j++) {
        }
        for (++k; i + k < 10; i++) {
        }
        for (new ArrayList(); i < 10; i++) {
        }
        for (System.out.println("hello"); i < 10; i++) {
        }
        for (i++; i < 10; System.out.println("hello")) {
        }
        Connection conn;
        for (; i < 10; conn = MyConnection.getConnection()) {
        }
        for (Connection mc = MyConnection.getConnection(); mc != null; ) {
        }
    }
}
