package testngdemo.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngHardAssertionDemo1
{
    @Test
    public void funA()
    {
        System.out.println("funA of TestngHardAssertionDemo1");
        String expectedData = "Rbg technologies";
        String actualData = "Rbg technologies";
        Assert.assertEquals(actualData,expectedData);
        System.out.println("funA done");

    }
    @Test
    public void funB()
    {
        System.out.println("funB of TestngHardAssertionDemo1");
        String expectedData = "Rbg technologies";
        String actualData = "Selenium";
        Assert.assertEquals(actualData,expectedData);
        System.out.println("funB done");

    }

    @Test
    public void funC()
    {
//        AssertNotEquals

        System.out.println("funC of TestngHardAssertionDemo1");
        String expectedData = "Rbg technologies";
        String actualData = "Selenium";
        Assert.assertNotEquals(actualData,expectedData);
        System.out.println("funC done");

    }

    @Test
    public void funD()
    {
//        AssertNotEquals

        System.out.println("funD of TestngHardAssertionDemo1");
        String expectedData = "Rbg technologies";
        String actualData = "Rbg technologies";
        Assert.assertNotEquals(actualData,expectedData);
        System.out.println("funD done");

    }

    @Test
    public void funE()
    {
//        AssertTrue

        System.out.println("funE of TestngHardAssertionDemo1");
        Assert.assertTrue(true);
        System.out.println("funE done");
    }

    @Test
    public void funF()
    {
//        AssertTrue

        System.out.println("funF of TestngHardAssertionDemo1");
        Assert.assertTrue(false);
        System.out.println("funF done");
    }

    @Test
    public void funG()
    {
//        AssertFalse

        System.out.println("funG of TestngHardAssertionDemo1");
        Assert.assertFalse(false);
        System.out.println("funG done");
    }
    @Test
    public void funH()
    {
//        AssertFalse

        System.out.println("funH of TestngHardAssertionDemo1");
        Assert.assertFalse(true);
        System.out.println("funH done");
    }


}
