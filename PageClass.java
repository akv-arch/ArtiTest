package TestNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageClass {

    private WebDriver driver;

    public PageClass(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize(); // Maximize window here
    }

    public void FN(String fn) {
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fn);
    }

    public void LN(String ln) {
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(ln);
    }

//    public WebElement getSearchbox() {
//        return driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
    
    
	public void email(String email) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
}
	
	public void password(String pw) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);
}
	
	public void cpassword(String cp) {
		driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys(cp);
}
    
	public void username(String username) {
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys(username);
}
	
	public void passwd(String password) {
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(password);
}
}