package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementFindElementsDemo2
{

    @Test
    public void findElement()
    {
        WebDriver driver = new ChromeDriver();
        List<WebElement> list = driver.findElements(By.xpath("//input[@id='rbg']"));
        int listCount = list.size();
        System.out.println("listCount : "+ listCount);

    }


}
