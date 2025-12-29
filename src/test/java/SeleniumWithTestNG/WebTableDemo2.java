package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo2
{
    @Test
    public void printTable()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

                WebElement table = driver.findElement(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody"));
                String value = table.getText();
                System.out.println("value  : "+ value);

    }
}
