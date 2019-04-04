package com.qa19.tests;

import org.testng.annatations.AfterClass;
import org.testng.annatations.BeforeClass;
import org.testng.annatations.Test;

public class FirstTest {
    WebDriver wd;

    @BeforeClass
    public void setAp(){
        wd = new ChromeDriver();
    }

    @Test
    public void openGoogleTest(){
    wd.get("https://www.google.com/");
    }

    @AfterClass
    public void tearDown(){
    wd.quit();
    }
}
