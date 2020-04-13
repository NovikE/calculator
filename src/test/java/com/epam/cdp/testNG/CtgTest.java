package com.epam.cdp.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest{

    @Test
    public void doubleCtg(){
        double result = calculator.ctg(15);
        Assert.assertEquals(result, 3.73205, 0.00001);
    }
}
