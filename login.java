package Fabulate;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class login {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stage-client.fabulate.com.au/sign-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

  @Test(priority=1)
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
		
		
		
		
		//*********************************************************************************************************************************
		driver.findElement(By.name("causeName")).sendKeys("Automation brief ");
		// Brief name 
		System.out.println("Enter Brief name");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/input")).click();
		// Click to open the date picker 
		System.out.println("Click on date picker");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[5]/div[3]")).click();
		// Select material date 
		System.out.println("Select the material date");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div/div/div/input")).click();
		// Pitch deadline date picker (Click)
		System.out.println("Click on the date pitch deadline");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[5]/div[2]")).click();
		//Select the date of pitch deadline
		System.out.println("Select the pitch deadline");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/button")).click();
		System.out.println("click on add detail button");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[1]/div[2]/div/div/span/span[1]")).click();
		System.out.println("Click on the content genre");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[1]/div[2]/div/span/span/span/span/ul/li[1]")).click();
		System.out.println("Select the content genre product");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div/span/span[1]")).click();
		System.out.println("Click on the format type");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/span/span/span/span/ul/li[1]")).click();
		System.out.println("select the format type");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[3]/div[2]/div/div/span/span[1]")).click();
		System.out.println("click on the content content type");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[3]/div[2]/div/span/span/span/span/ul/li[1]")).click();
		System.out.println("Select the cintent type product");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[4]/div/table/tbody/tr/td[3]/div/span[2]/button")).click();
		System.out.println("Add the product quantity");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[3]/div/button[2]")).click();
		System.out.println("Click on Add product");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
		System.out.println("Click on the add button of the 1st step");
	
		// *******************************************  Step 2 **************************************************
		System.out.println("****************** STEP 2*****************");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/span/span[1]/input")).click();
		System.out.println("click on the content type");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/span/span/span/span/ul/li[1]")).click();
		System.out.println("select from content type droupdown");
		
		driver.findElement(By.name("causeContentIdea")).sendKeys("Test test test test test");
		System.out.println("Write lines in comntent idea");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/label/div/div/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div[3]/label/div/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div[3]/label/div/div/span/input")).click();
		System.out.println("select the checkboxes");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
		System.out.println("Click on the nect button of 2nd step");
		
		
		System.out.println("****************** STEP 3 *****************");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/label/div/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/label/div/div/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/div/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[4]/label/div/div/span/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[7]/label/div/div/span/input")).click();
		System.out.println("select the checkboxes");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
		System.out.println("Click on the next button step 3");
		
		driver.findElement(By.name("causeSeo")).sendKeys("Test test test test test");
		System.out.println("Enter the text in the Required SEO terms field");
		
		driver.findElement(By.name("causeFurtherUrl")).sendKeys("https:test.com");
		System.out.println("Enter the Further URLs for reference fields");
		
		driver.findElement(By.xpath("//div[@id='root']/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div/input")).sendKeys("D:\\Fabulate Sachin\\Files for Uploading\\Files\\Test Image.png");
		driver.findElement(By.xpath("//div[@id='root']/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div/input")).sendKeys("D:\\Fabulate Sachin\\Files for Uploading\\Files\\Gif.gif");
		System.out.println("Upload files in the 4th step");
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
		System.out.println("4th step next button");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[1]/img")));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[1]/img")).click();
		System.out.println("Select the amplify organization");
		
		
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]")).click();
		System.out.println("selet the amplify product");
		
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/label/div/div/span/input")).click();
		System.out.println("Enter the product quantity");
		
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/button")).click();
		System.out.println(" Click on the add prduct button ");
		
		driver.findElement(By.name("startDate")).click();
		System.out.println("Click on the start date");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[5]/div[3]")).click();
		System.out.println("select the date");
	
		driver.findElement(By.name("endDate")).click();
		System.out.println("Click on the end date");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div[5]/div[5]")).click();
		System.out.println("select the end date");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
		System.out.println("click on the next button");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
		System.out.println("click on the finish button");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[5]/button[1]")).click();
		System.out.println("click on the finish button");
		Thread.sleep(5000);	
		
	}

	
	@Test(priority=2)
	public void Creator() throws InterruptedException {
		
			driver.findElement(By.name("email-signIn")).sendKeys("creatoramplify@yopmail.com");
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
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/section/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/div/a/div")).click();
			System.out.println("Select the brief");
		
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();
			System.out.println("Click on the my pitch tab");
	
			driver.findElement(By.name("tagline")).sendKeys("Tag line");
			System.out.println("write headline");
			
			driver.findElement(By.name("outline")).sendKeys("Test test");
			System.out.println("write the outline");
			
			driver.findElement(By.name("brandIntegration")).sendKeys("Cover Letter");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
			
			driver.findElement(By.name("headline")).sendKeys("Headline");
			
			driver.findElement(By.name("outline")).sendKeys("Synopsis");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/button")).click();
			
			
			// For testing Git
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
			
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/button")).click();



			
			
			
			
					
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void afterMethod() {
	}

}
