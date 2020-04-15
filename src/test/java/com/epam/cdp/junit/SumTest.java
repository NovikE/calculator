package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SumTest extends BaseTest {

    @Test
    public void sumTwoValues(){
        long result = calculator.sum(10, 20);
        Assert.assertEquals("Invalid result of sum operation!",30, result);
    }
}
