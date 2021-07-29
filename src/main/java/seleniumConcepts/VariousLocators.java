package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Aug2020_Selenium\\session2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
	public void practiceLocators() {
		// locator:Name.
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		//driver.findElement(By.id("photo")).click();
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.findElement(By.partialLinkText("Product Backend")).click();
		
		//NOW WE ARE USING CSSSELECTOR TO LOCATE THE ELEMENT
		
		//driver.findElement(By.cssSelector("input#sex-1")).clear();
	//	driver.findElement(By.cssSelector("input.input-file")).click();
		driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
		
		//now we are using xpath
		driver.findElement(By.xpath("//a[contains(text(),'Frameworks')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Frameworks\")]")).click();
		
	}
    
  //  @Test
   //	public void practiceLocators1() {
   		//driver.findElement(By.partialLinkText("Product Backend")).click();
   		
   	}
    	
  //  }

