package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo2

{
    public static void main(String[] args) throws Exception
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/button");
        driver.switchTo().frame(0);
        WebElement button = driver.findElement(By.xpath("//input[@class='ui-button ui-widget ui-corner-all']"));

        Thread.sleep(5000);

        boolean actualDisplay = button.isDisplayed();
        System.out.println("The actualDisplay is : "+actualDisplay);

        if (actualDisplay==true){
            System.out.println("Button is Displaying");
        }
        else
        {
            System.out.println("Button is not displaying");
        }

        boolean buttonEnabled = button.isEnabled();
        System.out.println("The buttonEnabled : "+buttonEnabled);

        if (buttonEnabled==true)
        {
            System.out.println("Button is Enabled");
        }
        else
        {
            System.out.println("Button is not Enabled");
        }
        button.click();
    }
}