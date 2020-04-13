package com.epam.cdp.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class SubTest extends BaseTest{

    @Test
    public void subtractionValues(){

        long result = calculator.sub(2,1);
        Assert.assertTrue(result == 1);
    }

}
