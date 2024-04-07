package practicetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3_Assertions {
	WebDriver driver;
	
	@BeforeMethod
	public void lounchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
	}
	
	
	@DataProvider()
	public Object[][] data() {
		Object ob[][]=new Object[][] {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};
		return ob;
	}
	
	@Test(dataProvider="data")
	public void loginwithvalidcred(String user,String pass) {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		
//		boolean b=login.isDisplayed();
//		Assert.assertTrue(b);
		
		login.click();
		
		WebElement prname=driver.findElement(By.xpath("//span[text()='Products']"));
		boolean b=prname.isDisplayed();
		
		Assert.assertEquals(b, true);
		
		System.out.println(Thread.currentThread().getId());
	}
	

}
