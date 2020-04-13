package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class CosTest extends BaseTest {

    @Test
    public void cosDouble(){
        double result = calculator.cos(60);
        Assert.assertTrue("Invalid test!", 0.5 == result);
    }
}
