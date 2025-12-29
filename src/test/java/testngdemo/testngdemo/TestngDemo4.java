package testngdemo.testngdemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngDemo4
{

    public static boolean flagResult;

    @Test(priority = 1)
    public void loginTest()
    {
        try {
            System.out.println("loginTest test of TestngDemo4");
            System.out.println(0 / 0);
            flagResult  = true ;
        }
        catch (Exception val)
        {
            flagResult =false;

        }
    }

    @Test(priority = 2)
    public void customerDetails()
    {
        if (flagResult==true) {
            System.out.println("loginTest test of TestngDemo4");
        }
        else
        {
            throw new SkipException("Test case skipped");

        }
    }

}
