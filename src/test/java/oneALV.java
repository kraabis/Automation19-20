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
        driver.findElement(By.xpath("//div[@class='/p/klepjdators-lenovo-ideapad-3-17-platinum-gray-81w20017pb-pl-amd-athlon-4gb-256gb-17-3/8v7u']")).click();

    }
}
