package testngdemo;

import org.testng.annotations.*;

public class TestngAnnotationsDemo3 {
    @Test
    public void funA()
    {
        System.out.println("funA of TestngAnnotationsDemo3");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite of TestngAnnotationsDemo3");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest of TestngAnnotationsDemo3");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("beforeClass of TestngAnnotationsDemo3");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod of TestngAnnotationsDemo3");
    }


}
