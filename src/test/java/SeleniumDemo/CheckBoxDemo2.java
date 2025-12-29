package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo2
{

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/mortgage-calculator.html");

        WebElement checkBox = driver.findElement(By.xpath("//span[@class='cbmark'][1]"));

        boolean checkBoxisDisplay = checkBox.isDisplayed();
//        System.out.println("checkBox3GisDisplaying : "+checkBoxisDisplay);

        if (checkBoxisDisplay==true){
            System.out.println("CheckBox is Displaying");
        }
        else {
            System.out.println("CheckBox is Not Displaying");
        }

        boolean checkBoxisEnable = checkBox.isEnabled();
//        System.out.println("checkBox3GisEnable : "+checkBoxisEnable);

        if (checkBoxisEnable==true){
            System.out.println("CheckBox is Enable");
        }
        else {
            System.out.println("CheckBox is Not Enable");
        }

        boolean checkBoxisSelect = checkBox.isSelected();
//        System.out.println("checkBox3GisSelect is : "+checkBoxisSelect);

        if (checkBoxisSelect==true){
            System.out.println("CheckBox is Selected");
        }
        else {
            System.out.println("CheckBox is Not Selected");
        }

        checkBox.click();

        boolean checkBoxisSelectAfterClick = checkBox.isSelected();

        if (checkBoxisSelectAfterClick==true){
            System.out.println("CheckBox is Selected");
        }
        else {
            System.out.println("CheckBox is Not Selected");
        }

    }

}
