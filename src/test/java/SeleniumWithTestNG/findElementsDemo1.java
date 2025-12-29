package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findElementsDemo1
{

    @Test
    public void findElement()
    {
        WebDriver driver = new ChromeDriver();

//        driver.get("");
        driver.findElement(By.xpath("(//input[@type=radio])[4]")).click();

    }
}
