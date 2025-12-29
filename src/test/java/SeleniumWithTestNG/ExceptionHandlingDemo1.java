package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExceptionHandlingDemo1
{
    @Test
    public void exceptionHandling()
    {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//input[@id='rbg']"));
        System.out.println("Done");
    }
}
