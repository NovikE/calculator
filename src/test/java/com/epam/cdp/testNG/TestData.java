package com.epam.cdp.testNG;

import org.testng.annotations.DataProvider;

public class TestData {

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
