package testngdemo;

import org.testng.annotations.*;

public class TestngAnnotationsDemo2 {
    @Test
    public void funA()
    {
        System.out.println("funA of TestngAnnotationsDemo2");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod of TestngAnnotationsDemo2");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass of TestngAnnotationsDemo2");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest of TestngAnnotationsDemo2");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite of TestngAnnotationsDemo2");
    }
}
