package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2
{
    @Test
    public void alertDemo2Testing() throws Exception
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.meghanabus.in/index.html");
        driver.manage().window().maximize();

        WebElement manageBookings = driver.findElement(By.xpath("//a[@title='Manage Bookings']"));
        manageBookings.click();
        Thread.sleep(4000);

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
        Thread.sleep(4000);

        String alertText = driver.switchTo().alert().getText();
        System.out.println("alertText is : "+ alertText);
        driver.switchTo().alert().accept();


//
//        WebElement text = driver.findElement(By.xpath("/html/body/div/section[2]/div[1]/div[1]/div[1]/span"));
//        text.getText();
//        Thread.sleep(4000);
    }

}
