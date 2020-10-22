package Buyer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BuyerLogin {
	WebDriver driver;
  @Test
  public void Login() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
  	 driver = new ChromeDriver();
    
   driver.get("https://stage-client.fabulate.com.au/sign-in");
   // To maximize the browser
   driver.manage().window().maximize();
   // implicit wait
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
   driver.findElement(By.name("email-signIn")).sendKeys("buyeramplify@yopmail.com");

      driver.findElement(By.name("password-singIn")).sendKeys("123456");

      driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/div/div[1]/div/div/span/input")).click();
      driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/button")).click();
      
      // This is for testing purposes.
  }
}