package com.eli.bbp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by elizhou on 2018/6/21.
 */
@Component
public class Bean4BBP {
    private static final Logger log = LoggerFactory.getLogger(Bean4BBP.class);

    public Bean4BBP() {
        log.info("construce Bean4BBP");
    }
}
