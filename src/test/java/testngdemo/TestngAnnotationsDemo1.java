package testngdemo;

import org.testng.annotations.*;

public class TestngAnnotationsDemo1
{
    @Test
    public void funA()
    {
        System.out.println("funA of TestngAnnotationsDemo1");
    }

    @Test
    public void funB()
    {
        System.out.println("funB of TestngAnnotationsDemo1");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite of TestngAnnotationsDemo1");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest of TestngAnnotationsDemo1");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass of TestngAnnotationsDemo1");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod of TestngAnnotationsDemo1");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod of TestngAnnotationsDemo1");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("afterClass of TestngAnnotationsDemo1");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest of TestngAnnotationsDemo1");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite of TestngAnnotationsDemo1");
    }
}
