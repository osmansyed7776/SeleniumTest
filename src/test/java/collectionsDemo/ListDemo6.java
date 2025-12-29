package collectionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ListDemo6
{
    public static void main(String[] args) {
        List<ABC> list = new ArrayList<ABC>();
        list.add(new ABC());


        WebDriver driver = new ChromeDriver();
        WebElement element1 = driver.findElement(By.xpath(""));
        WebElement element2 = driver.findElement(By.xpath(""));
        WebElement element3 = driver.findElement(By.xpath(""));
        WebElement element4 = driver.findElement(By.xpath(""));
        WebElement element5 = driver.findElement(By.xpath(""));

        List<WebElement> list2 = new ArrayList<WebElement>();
        list2.add(element1);//0
        list2.add(element2);//1
        list2.add(element3);//2
        list2.add(element4);//3
        list2.add(element5);//4

        WebElement fourthElement = list2.get(3);
        fourthElement.click();

//OR

//      list2.get(3).click();

    }
}
