package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo2B
{

    @Test(priority = 1)
    public void checkBoxTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/mortgage-calculator.html");
        WebElement checkBox = driver.findElement(By.xpath("//span[@class='cbmark'][1]"));
        WebElement checkBoxForSelect = driver.findElement(By.xpath("//input[@id='caddoptional']"));

        boolean checkBoxIsDisplay = checkBox.isDisplayed();
        Assert.assertTrue(checkBoxIsDisplay,"CheckBox Not Displaying");

        boolean checkBoxIsSelect = checkBoxForSelect.isSelected();
        Assert.assertTrue(checkBoxIsSelect,"CheckBox Not Selected");

        checkBox.click();

        boolean checkBoxIsSelectAfterClick = checkBoxForSelect.isSelected();
        Assert.assertFalse(checkBoxIsSelectAfterClick,"CheckBox Not Selected After Click");

    }

}
