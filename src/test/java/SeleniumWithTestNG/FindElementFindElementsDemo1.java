package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementFindElementsDemo1
{

    @Test
    public void findElement()
    {
        WebDriver driver = new ChromeDriver();
//        driver.findElement(By.xpath("//input[@id='rbg']"));
        driver.findElements(By.xpath("//input[id='rbg']"));
        System.out.println("findElement of FindElementFindElementsDemo1 ");
    }


}
