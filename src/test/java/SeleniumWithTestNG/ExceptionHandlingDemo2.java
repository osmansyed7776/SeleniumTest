package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandlingDemo2
{
    @Test
    public void exceptionHandling()
    {
        WebDriver driver = new ChromeDriver();
        try
        {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@id='rbg']"));
        }
        catch (Exception e)
        {

        }
        System.out.println("Done");
    }
}
