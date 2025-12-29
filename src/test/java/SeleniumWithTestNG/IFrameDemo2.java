package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameDemo2
{
    @Test
    public void iFrameTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/ADMIN/Desktop/Selenium/IFrame%203.html");
//        driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
        driver.switchTo().frame(0);

       WebElement iframeLabel1 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/h2/span"));

       String text = iframeLabel1.getText();
        System.out.println(" i frame Text : "+text);

        WebElement inputBox = driver.findElement(By.xpath("//input[@name='Town']"));
        inputBox.sendKeys("Hyderabad");
    }
}
