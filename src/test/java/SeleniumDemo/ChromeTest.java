import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");
//        driver.findElement(By.id("identifierid")).sendKeys("RBG Technologies");
//        driver.findElement(By.name("identifier")).sendKeys("RBG Technologies");
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("RBG Technologies");
        System.out.println("done");
    }
}