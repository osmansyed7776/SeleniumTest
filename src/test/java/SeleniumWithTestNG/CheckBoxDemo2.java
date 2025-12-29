package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxDemo2
{
WebDriver driver;
WebElement checkBox;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://www.calculator.net/mortgage-calculator.html");

    }
    @BeforeMethod
    public void findElement()
    {
        checkBox = driver.findElement(By.xpath("//span[@class='cbmark'][1]"));
    }
    @Test
    public void CheckBoxTesting()
    {
        boolean checkBoxIsDisplay = checkBox.isDisplayed();
        Assert.assertTrue(checkBoxIsDisplay,"CheckBox not Displayed");

        boolean checkBoxIsEnable = checkBox.isEnabled();
        Assert.assertTrue(checkBoxIsEnable,"CheckBox not Enabled");

        boolean checkBoxIsSelect = checkBox.isSelected();
        Assert.assertFalse(checkBoxIsSelect,"CheckBox not Selected");

        checkBox.click();
        boolean checkBoxIsSelectAfterClick = checkBox.isSelected();
        Assert.assertFalse(checkBoxIsSelectAfterClick,"CheckBox not Selected After Click");

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
