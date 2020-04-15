package com.epam.cdp.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {

    @Test(groups = "trigonometry")
    public void doubleSin(){
        double result = calculator.sin(30);
        Assert.assertEquals(result, 0.5, 0.00001, "Invalid result of sin-function!");
    }

}
