package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonDemo1
{

    @Test
    public void funA()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement roundButton =driver.findElement(By.xpath("//input[@name='tripType' and @value ='oneway']"));

        boolean isDisplay = roundButton.isDisplayed();
        Assert.assertTrue(isDisplay);

        boolean isEnabled = roundButton.isEnabled();
        Assert.assertTrue(isEnabled);

        boolean isSelected= roundButton.isSelected();
        Assert.assertFalse(isSelected);

        roundButton.click();

        boolean isSelectedAfterClick = roundButton.isSelected();
        Assert.assertTrue(isSelectedAfterClick);

    }
}
