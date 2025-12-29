package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelText
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        WebElement signInText = driver.findElement(By.xpath("//span[text()='Sign in']"));
        String actualText = signInText.getText();
        String expectedText ="Sign In";

         if (actualText.equals(expectedText))
         {
             System.out.println("Actual test matched with expected test");
         } else
         {
             System.out.println("Actual test not matched with expected test");
         }
    }
}