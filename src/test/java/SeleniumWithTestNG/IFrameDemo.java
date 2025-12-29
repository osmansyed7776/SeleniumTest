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

public class IFrameDemo
{
    WebDriver driver;
    WebElement text;
    WebElement input1;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
//        driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
        driver.get("file:///C:/Users/ADMIN/Desktop/Selenium/IFrame%203.html");

    }
    @BeforeMethod
    public void findText()
    {
        text = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/h2/span"));
        input1 = driver.findElement(By.xpath(""));

    }
    @Test
    public void textMatch()
    {
        String actualText = text.getText();
        System.out.println("text : "+actualText);
        String expectedText ="Saturday, 3 January 2015";

        Assert.assertEquals(actualText,expectedText,"text not matched ");
        System.out.println("text matched");
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
