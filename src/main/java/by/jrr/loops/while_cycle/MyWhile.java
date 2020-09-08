package by.jrr.loops.while_cycle;

import com.sun.jdi.connect.spi.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyWhile {

    private Logger log = LoggerFactory.getLogger(MyWhile.class);

    public void syntax() {
        int i = 4;
        log.info("start cycle");
        while(i > 1) {
            log.info("Cycling " + i);
            --i;
        }
        log.info("end cycle");
    }

    public void arrayCycleSyntax(String... arg) {
        int i = 0;
        while (i < arg.length) {
            log.info("element " + i + " = " + arg[i]);
            i++;
        }
    }

    public void infiniteLoop() {
        while (true) {
            log.info("infinite loop");
        }
    }
    public void infiniteListener() {
        Connection conn;
        while ((conn = MyConnection.getConnection()) != null) {
            log.info("making requests to database");
        }
    }
}
