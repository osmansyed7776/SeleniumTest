package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo3
{
    @Test
    public void funA()
    {
        WebDriver driver = new ChromeDriver();
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][5]"));

        driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
        driver.manage().window().maximize();

        boolean checkBoxIsDisplay = checkBox.isDisplayed();
        Assert.assertTrue(checkBoxIsDisplay);

        boolean checkBoxIsEnable = checkBox.isEnabled();
        Assert.assertTrue(checkBoxIsEnable);

        boolean checkBoxIsSelect = checkBox.isSelected();
        Assert.assertTrue(checkBoxIsSelect);

        checkBox.click();

        boolean checkBoxIsSelectAfterClick = checkBox.isSelected();
        Assert.assertTrue(checkBoxIsSelectAfterClick);

    }

}
