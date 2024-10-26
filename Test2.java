package TestNG_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

    WebDriver driver;
    PageClass pg;

    @BeforeClass
    public void launchBrowser() {
        driver = new ChromeDriver();
        pg = new PageClass(driver);
    }

    public Test2() {
    
    }

    @Test(priority=1)
    public void Registration() {
        driver.get("https://magento.softwaretestingboard.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]")).click();
        pg.FN("Arti");
        pg.LN("Korade");
        pg.email("abc@gmail.com");
        pg.password("xxxx");
        pg.cpassword("xxxx");
        driver.findElement(By.xpath("(//span[text()='Create an Account'])[1]")).click();
        }
    
    @Test(priority=2)
    public void signin()
    {
    	driver.navigate().to("https://magento.softwaretestingboard.com/");
    	driver.findElement(By.xpath("(//a[contains(text(),'Sign In ')])[1]")).click();
    	pg.username("abc@gmail.com");
    	pg.passwd("xxxx");
    	driver.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
    }

}