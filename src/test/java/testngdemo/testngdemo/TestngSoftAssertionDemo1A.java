package testngdemo.testngdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngSoftAssertionDemo1A
{
    @Test
    public void funA()
    {
        System.out.println("funA of TestngSoftAssertionDemo1");

        SoftAssert sAssert = new SoftAssert();

        String expectedData1 = "RBG Technologies";
        String actualData1 = "RBG Technologies";

        sAssert.assertEquals(actualData1,expectedData1);
        System.out.println("Test Case1 Done");

        String expectedData2 = "Rbg Technologies";
        String actualData2 = "RBG Technologies";

        sAssert.assertEquals(actualData2,expectedData2);
        System.out.println("Test Case2 Done");

        sAssert.assertAll();
        System.out.println("All test Cases executed");

    }

}
