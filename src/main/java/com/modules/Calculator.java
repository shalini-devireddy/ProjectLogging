package com.modules;

import org.apache.log4j.Logger;

public class Calculator {

    private static final Logger LOG = Logger.getLogger(Calculator.class);

    public Calculator() {
        LOG.info("Created new calculator class");
    }

    public int add(int a, int b){
        LOG.debug("I'm inside the add method");
        LOG.debug("I'm about to add "+a+" and"+b);
        /// types of log messages
        // info
        // debug
        // error if there is error like in exceptions
        return a+b;
    }
}
