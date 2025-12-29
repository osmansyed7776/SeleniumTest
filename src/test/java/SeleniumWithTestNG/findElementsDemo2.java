package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class findElementsDemo2
{
    @Test
    public void findElements()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("");

        List<WebElement> radioButtonList= driver.findElements(By.xpath("//input[@type=radio]"));
        radioButtonList.get(3).click();

        WebElement fourthRadioButton = radioButtonList.get(3);
        fourthRadioButton.click();

    }
}
