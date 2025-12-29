package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo2
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        String actualWaterMark =inputBox.getAttribute("placeholder");
        String expectedWaterMark = "Email or phone";

//      Hint : It is not a WaterMark

        if (actualWaterMark.equals(expectedWaterMark)){
            System.out.println("Watermark validated");
        }
        else{
            System.out.println("Watermark not Validated");
        }
    }
}
