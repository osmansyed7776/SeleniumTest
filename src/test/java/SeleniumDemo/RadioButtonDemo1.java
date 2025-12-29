package SeleniumDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtonDemo1
{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement roundButton =driver.findElement(By.xpath("//input[@name='tripType' and @value ='oneway']"));

        boolean isDisplay = roundButton.isDisplayed();

        if (isDisplay==true){
            System.out.println("roundButton displayed");
        }
        else{
            System.out.println("roundButton not displayed");
        }

        boolean isEnabled = roundButton.isEnabled();

        if (isEnabled==true){
            System.out.println("roundButton Enabled");
        }else {
            System.out.println("roundButton not enabled");
        }

        boolean isSelected= roundButton.isSelected();

        if (isSelected==true){
            System.out.println("roundButton is selected");
        }
        else{
            System.out.println("roundButton is not selected");
        }

        roundButton.click();

        boolean isSelectedAfterClick = roundButton.isSelected();

        if (isSelectedAfterClick==true){
            System.out.println("roundButton is selected");
        }
        else{
            System.out.println("roundButton is not selected");
        }

    }
}