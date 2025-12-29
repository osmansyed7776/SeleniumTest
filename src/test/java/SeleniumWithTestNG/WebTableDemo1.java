package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo1
{
    @Test
    public void tableTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

        WebElement tableBox1 = driver.findElement(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[1]/td[1]"));

        String value = tableBox1.getText();
        System.out.println("value  : "+ value);
    }
}
