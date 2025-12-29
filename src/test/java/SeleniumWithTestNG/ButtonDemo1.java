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

public class ButtonDemo1
{
   WebDriver driver;
   WebElement button;

   @BeforeClass
   public void setUp()
   {
       driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
   }

   @BeforeMethod
   public void findButton()
   {
       button = driver.findElement(By.xpath("//button[@name='login']"));
   }

   @Test(priority = 1)
   public void isDisplayed()
   {
       boolean isDisplayed = button.isDisplayed();
       Assert.assertTrue(isDisplayed,"button is not displayed");
   }

   @Test(priority = 2)
   public void isEnabled()
   {
       boolean isEnabled = button.isEnabled();
       Assert.assertTrue(isEnabled,"button is not enabled");
   }
   @Test(priority = 3)
   public void verifyButtonName()
   {
       String actualName = button.getText();
       String expectedName = "Log in";
       Assert.assertEquals(actualName,expectedName,"Button Name Not Matched");

   }
   
   @AfterClass
   public void tearDown()
   {
        driver.quit();
   }

}
