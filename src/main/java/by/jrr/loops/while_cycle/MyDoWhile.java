package by.jrr.loops.while_cycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyDoWhile {

    private Logger log = LoggerFactory.getLogger(MyDoWhile.class);

    public void syntax() {
        int i = 4;
        log.info("start cycle");
        do {
            log.info("Cycling " + i);
            --i;
        } while(i > 1);
        log.info("end cycle");
    }
}
