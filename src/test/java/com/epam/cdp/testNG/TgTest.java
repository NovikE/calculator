package com.epam.cdp.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgTest extends BaseTest{

    @Test(groups = "trigonometry")
    public void doubleTg(){
        double result = calculator.tg(15);
        Assert.assertEquals(result, 0.2679, 0.0001, "Invalid result of tg-function!");
    }
}
