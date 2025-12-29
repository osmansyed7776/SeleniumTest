package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo1
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));

        boolean isDisplay = inputBox.isDisplayed();
        boolean isEnabled = inputBox.isEnabled();

        if (isDisplay){
            System.out.println("input box is displayed ");
        }
        else{
            System.out.println("input box is not displayed");
        }

        if (isEnabled){
            System.out.println("Input box is enabled ");
        }
        else{
            System.out.println("Input box is disabled");
        }

        String actualWaterMark = inputBox.getAttribute("placeholder");
        String expectedWaterMark = "Email address or phone number";
        System.out.println("Watermark Text is "+actualWaterMark);

        if (actualWaterMark.equals(expectedWaterMark)){
            System.out.println("The Water Mark verified");
        }
        else {
            System.out.println("WaterMark not verified");
        }

        String enteredData ="osmansyed7776@gmail.com";
        inputBox.sendKeys(enteredData);

        String retrivedData = inputBox.getAttribute("value");

        if (retrivedData.equals(enteredData)){
            System.out.println("Entered Data validated ");
        }
        else {
            System.out.println("Entered data not validated");
        }
    }
}