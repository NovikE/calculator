package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    protected static Calculator calculator;

    @BeforeClass
    public static void setUP(){
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown(){
        calculator = null;
    }

}
