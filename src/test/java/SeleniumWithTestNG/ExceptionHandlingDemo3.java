package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ExceptionHandlingDemo3
{
    @Test
    public void exceptionHandling()
    {
        WebDriver driver = new ChromeDriver();
        List<WebElement> element1 = driver.findElements(By.xpath("//input[@id='rbg']"));

        int elementCount = element1.size();
        System.out.println("elementCount : "+elementCount);

        if (elementCount>0)
        {
            element1.get(0).click();

        }
        System.out.println("Done");
    }
}
