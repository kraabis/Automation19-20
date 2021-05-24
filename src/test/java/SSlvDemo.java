import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SSlvDemo {
    @Test
    public void suniUnKuceni(){

        String driverPath = "/Users/kristskrenbergs/IdeaProjects/Lecture19/src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_8_min")).sendKeys("1");
        driver.findElement(By.id("f_o_8_max")).sendKeys("2");
        driver.findElement(By.id("f_o_1276_min")).sendKeys("3");
        driver.findElement(By.id("f_o_1276_max")).sendKeys("4");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();

    }

    @Test

    public void carsTest(){

        String driverPath = "/Users/kristskrenbergs/IdeaProjects/Lecture19/src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");
        driver.findElement(By.id("mtd_97")).click();
        Select yearMin = new Select(driver.findElement(By.id("f_o_18_min")));
        yearMin.selectByVisibleText("2007");
        Select yearMax = new Select(driver.findElement(By.id("f_o_18_max")));
        yearMax.selectByVisibleText("2012");
        Select tilpMin = new Select(driver.findElement(By.id("f_o_15_min")));
        tilpMin.selectByVisibleText("0.1");
        Select tilpMax = new Select(driver.findElement(By.id("f_o_15_max")));
        tilpMax.selectByVisibleText("2.3");

        Select engType = new Select(driver.findElement(By.id("f_o_34")));
        engType.selectByValue("494");
        Select transType = new Select(driver.findElement(By.id("f_o_35")));
        transType.selectByValue("497");
        Select bodyType = new Select(driver.findElement(By.id("f_o_32")));
        bodyType.selectByValue("486");
        Select colorType = new Select(driver.findElement(By.id("f_o_17")));
        colorType.selectByValue("6319");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();


    }
}
