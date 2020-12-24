package Fabulate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class fabulatelogin {
	WebDriver driver;
  @Test
  public void f() {
  }
  
  @BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stage-client.fabulate.com.au/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
 }

  @Test
	public void buyerlogin() throws InterruptedException {
		driver.findElement(By.name("email-signIn")).sendKeys("buyeramplify@yopmail.com");
		// Email
		System.out.println("Enter email");
		driver.findElement(By.name("password-singIn")).sendKeys("123456");
		// Password
		System.out.println("Password");
		driver.findElement(By.id("agreement")).click();
		// Check Box
		System.out.println("select checkbox");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/button")).click();
		// Login Button
		System.out.println("click on login bytton");
		// Post a brief            Post a brief                 post a brief
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/section/div[1]/div/div/div/div[1]/div[2]/div[2]/div/div/button")));
	Thread.sleep(4000);  // To stop automation for 4 seconds 
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/section/div[1]/div/div/div/div[1]/div[2]/div[2]/div/div/button")).click();
		// Click on the post a brief button
		System.out.println("click on post brief button");
  }
  
  
  
  
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
  }

}
