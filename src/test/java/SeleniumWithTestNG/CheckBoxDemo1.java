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

public class CheckBoxDemo1
{
WebDriver driver;
WebElement checkBox3G;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

    }
    @BeforeMethod
    public void findElement()
    {
         checkBox3G = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
    }
    @Test
    public void CheckBoxTesting()
    {
        boolean checkBox3GIsDisplay = checkBox3G.isDisplayed();
        Assert.assertTrue(checkBox3GIsDisplay,"CheckBox not Displayed");

        boolean checkBox3GIsEnable = checkBox3G.isEnabled();
        Assert.assertTrue(checkBox3GIsEnable,"CheckBox not Enabled");

        boolean checkBox3GIsSelect = checkBox3G.isSelected();
        Assert.assertFalse(checkBox3GIsSelect,"CheckBox not Selected");

        checkBox3G.click();
        boolean checkBox3GIsSelectAfterClick = checkBox3G.isSelected();
        Assert.assertFalse(checkBox3GIsSelectAfterClick,"CheckBox not Selected After Click");

    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
