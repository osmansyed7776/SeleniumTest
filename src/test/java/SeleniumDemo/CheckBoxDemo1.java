package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1
{

    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");

        WebElement checkBox3G = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));

        boolean checkBox3GisDisplay = checkBox3G.isDisplayed();
//        System.out.println("checkBox3GisDisplaying : "+checkBox3GisDisplay);

        if (checkBox3GisDisplay==true){
            System.out.println("CheckBox is Displaying");
        }
        else {
            System.out.println("CheckBox is Not Displaying");
        }

        boolean checkBox3GisEnable = checkBox3G.isEnabled();
//        System.out.println("checkBox3GisEnable : "+checkBox3GisEnable);

        if (checkBox3GisEnable==true){
            System.out.println("CheckBox is Enable");
        }
        else {
            System.out.println("CheckBox is Not Enable");
        }

        boolean checkBox3GisSelect = checkBox3G.isSelected();
//        System.out.println("checkBox3GisSelect is : "+checkBox3GisSelect);

        if (checkBox3GisSelect==true){
            System.out.println("CheckBox is Selected");
        }
        else {
            System.out.println("CheckBox is Not Selected");
        }

        checkBox3G.click();

        boolean checkBox3GisSelectAfterClick = checkBox3G.isSelected();

        if (checkBox3GisSelectAfterClick==true){
            System.out.println("CheckBox is Selected");
        }
        else {
            System.out.println("CheckBox is Not Selected");
        }

    }

}
