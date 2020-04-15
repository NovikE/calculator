package com.epam.cdp.testNG;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @Test(dataProviderClass = TestData.class, dataProvider = "valuesForSumTest", groups = "algebra")
    public void sumTwoValues(long a, long b, long expectedValue){
        long result = calculator.sum(a, b);
        Assert.assertEquals(result,expectedValue, "Invalid result of sum operation!");
    }


}
