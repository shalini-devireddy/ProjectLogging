package com.tests;

import com.modules.Calculator;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddition {

    private static final Logger LOG = Logger.getLogger(TestAddition.class);
    @Test
    public void testAdd(){
        LOG.debug("testing add method");
        Calculator aCalculator = new Calculator();
        LOG.debug("about to assert");
        Assert.assertEquals(aCalculator.add(5,3), 8);
    }
}
