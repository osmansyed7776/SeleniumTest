package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement button = driver.findElement(By.xpath("//button[@name='login']"));

        if (button.isDisplayed()){
            System.out.println("Button is displayed");
        }
        else {
            System.out.println("Button is not displayed");
        }

        if (button.isEnabled()){
            System.out.println("Button is enabled");
        }else {
            System.out.println("Button is disabled");
        }

        String expectedText ="Log in";
        String actualText = button.getText();

        if (expectedText.equals(actualText)){
            System.out.println("The text verified");
        }
        else {
            System.out.println("The text not verified");
        }
        button.click();
    }
}