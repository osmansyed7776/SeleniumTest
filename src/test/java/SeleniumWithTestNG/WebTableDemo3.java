package SeleniumWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableDemo3 {
    @Test
    public void printTable() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
        List<WebElement> rowsList = driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr"));
        int rowsCount = rowsList.size();
        System.out.println("rowsCount : "+ rowsCount);

        List<WebElement> columnList = driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[1]/td"));
        int columnCount = columnList.size();
        System.out.println("columnCount : "+ columnCount);

//        String xpath1 = "//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[";
//        String xpath2 = "]/td[";
//        String xpath3 = "]";
//
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 6; j++) {
//                System.out.println(xpath1 + i + xpath2 + j + xpath3);
//                String tableData = driver.findElement(By.xpath(xpath1 + i + xpath2 + j + xpath3)).getText();
//                System.out.println("tableData : " + tableData);
//
//            }
//        }



    }

}