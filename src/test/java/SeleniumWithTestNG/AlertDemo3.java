package SeleniumWithTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo3
{
    @Test
    public void funA() throws Exception
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

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println("alertText is : "+ alertText);
        alert.accept();

    }

}
