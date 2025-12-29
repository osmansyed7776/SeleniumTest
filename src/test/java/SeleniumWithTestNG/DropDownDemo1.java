package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownDemo1
{
    WebDriver driver;
    WebElement DropDown;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/reservation.php");

    }
    @BeforeMethod
    public void findButton()
    {
        DropDown = driver.findElement(By.xpath("//select[@name='toMonth']"));
    }

    @Test
    public void testDropDown() throws Exception
    {
        Select select = new Select(DropDown);
        select.selectByIndex(10);
        Thread.sleep(4000);
        select.selectByValue("5");
        Thread.sleep(5000);
        select.selectByVisibleText("December");

    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
