package testngdemo;

import org.testng.annotations.Test;

public class TestngDemo2A
{

    @Test(priority = 2)
    public void funB()
    {
        System.out.println("funB of TestngDemo2A");
    }
    @Test(priority = 1)
    public void funA()
    {
        System.out.println("funA of TestngDemo2A");
    }

    @Test(priority = 3)
    public void funC()
    {
        System.out.println("funC of TestngDemo2A");
    }
    @Test(priority = 4)
    public void funD()
    {
        System.out.println("funD of TestngDemo2A");
    }

}
