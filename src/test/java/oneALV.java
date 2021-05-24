import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class oneALV {
    @Test

     public void lenovoTest(){

        String driverPath = "/Users/kristskrenbergs/IdeaProjects/Lecture19/src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.1a.lv/");
        driver.findElement(By.id("q")).sendKeys("lenovo");
        driver.findElement(By.xpath("//button[@class='main-search-submit']")).click();





    }
}
