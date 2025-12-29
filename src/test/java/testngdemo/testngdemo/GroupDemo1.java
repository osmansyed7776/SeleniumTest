package testngdemo.testngdemo;

import org.testng.annotations.Test;

public class GroupDemo1
{


    @Test(groups = "sanity")
    public void funA()
    {
    System.out.println("FunA of GroupDemo1");
    }

    @Test(groups = "sanity")
    public void funB()
    {
        System.out.println("FunB of GroupDemo1");
    }

    @Test(groups = "regression")
    public void funC()
    {
        System.out.println("FunC of GroupDemo1");
    }

    @Test(groups = "regression")
    public void funD()
    {
        System.out.println("FunD of GroupDemo1");
    }

}
