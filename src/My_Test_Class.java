import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_Test_Class {
	
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.saucedemo.com/";
	String UserName = "standard_user";
	String Password = "secret_sauce";
	
	@BeforeTest
	public void beforTast () {
		
    	driver.get(URL);
	}
	
    @Test()
	public void myTest () {
    	WebElement UserNameInputFailed = driver.findElement(By.id("user-name"));
    	WebElement PasswordInputFailed = driver.findElement(By.id("password"));
    	WebElement LoginButton = driver.findElement(By.id("login-button"));
    	
    	
    	UserNameInputFailed.sendKeys(UserName);
    	PasswordInputFailed.sendKeys(Password);
    	LoginButton.click();
    	List <WebElement> AddToCartButtos = driver.findElements(By.className("btn_primary"));
    	for(int i=0; i<AddToCartButtos.size(); i+=2) {
    		
    		AddToCartButtos.get(i).click();
    	}}
	
	@AfterTest
	public void afterTast() {}

}
