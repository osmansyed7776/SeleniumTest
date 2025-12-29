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

public class LabelText
{
    WebDriver driver;
    WebElement signInText;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("http://gmail.com");

    }
    @BeforeMethod
    public void findText()
    {
        signInText = driver.findElement(By.xpath("//span[text()='Sign in']"));
    }
    @Test
    public void textMatch()
    {
        String actualText = signInText.getText();
        String expectedText ="Sign In";

        Assert.assertEquals(actualText,expectedText,"Sign in text not matched ");
        System.out.println("Sign in text matched");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
