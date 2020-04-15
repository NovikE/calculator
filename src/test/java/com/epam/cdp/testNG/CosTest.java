package com.epam.cdp.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends BaseTest{

    @Test(groups = "trigonometry")
    public void cosDouble(){
        double result = calculator.cos(60);
        Assert.assertTrue(result == 0.5, "Invalid result of cos-function!");
    }
}
