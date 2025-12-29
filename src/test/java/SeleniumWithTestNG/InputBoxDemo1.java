package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputBoxDemo1
{
    WebDriver driver;
    WebElement inputBox;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
    @BeforeMethod
    public void findInputBox()
    {
        inputBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
    }


    @Test(priority = 1)
    public void isDisplay()
    {
        boolean isDisplay = inputBox.isDisplayed();

        Assert.assertTrue(isDisplay,"InputBox Not displayed");

    }

    @Test(priority = 2)
    public void isEnabled()
    {
        boolean isEnabled = inputBox.isEnabled();
        Assert.assertTrue(isEnabled,"InputBox Not Enabled");
        System.out.println("InputBox Enabled");

    }
    @Test(priority = 3)
    public void isWaterMark()
    {
        String actualWaterMark = inputBox.getAttribute("placeholder");
        String expectedWaterMark = "Email address or phone number";
        Assert.assertEquals(actualWaterMark,expectedWaterMark);
    }
    @Test(priority = 4)
    public void verifyEnteredData()
    {
        String enteredData ="osmansyed7776@gmail.com";
        inputBox.sendKeys(enteredData);

        String retrivedData = inputBox.getAttribute("value");
        Assert.assertEquals(enteredData,retrivedData,"Entered Data Not verified");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
