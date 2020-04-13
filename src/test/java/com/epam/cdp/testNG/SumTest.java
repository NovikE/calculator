package com.epam.cdp.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @Test(dataProvider = "valuesForSumTest")
    public void sumTwoValues(long a, long b, long expectedValue){
        long result = calculator.sum(a, b);
        Assert.assertEquals(result,expectedValue, "Invalid result of sum operation!");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {0, 0, 0},
                {23, -1, 22},
                {-5, 8, 3},
                {14, 15, 29},
                {-10, -10, -20}
        };
    }

}
