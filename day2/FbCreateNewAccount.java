package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateNewAccount {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//Validate Facebook image
		//boolean fbImage = driver.findElement(By.xpath("//img[contains(@alt='Facebook')]")).isDisplayed();
		//System.out.println("The Facebook Image is displayed: "+fbImage);
		
		//boolean displayed = driver.findElement(By.xpath("//class[contains(text(),'helps you connect')]")).isDisplayed();
		//System.out.println(displayed);
		
		//Click on Create Account - Id is dynamic using linktext, since it is anchor tag
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter Firstname
		driver.findElement(By.name("firstname")).sendKeys("user1");
		
		//Enter Surname
		driver.findElement(By.name("lastname")).sendKeys("name");
		
		//Date of Day - Month
		WebElement dobDate = driver.findElement(By.id("day"));
		Select options=new Select(dobDate);
		options.selectByIndex(30);
		
		//Date of Birth - Month
		WebElement dobMonth = driver.findElement(By.id("month"));
		Select options1=new Select(dobMonth);
		options1.selectByValue("10");
		
		//Date of Birth - Year
		WebElement dobYear = driver.findElement(By.id("year"));
		Select options3=new Select(dobYear);
		options3.selectByVisibleText("2000");
		
		//Gender
		driver.findElement(By.xpath("//input[@Value='1']")).click();
		
		// Mobile number or email address
		driver.findElement(By.name("reg_email__")).sendKeys("user1.name@gmail.com");
		
		//New password
		driver.findElement(By.id("password_step_input")).sendKeys("asd123");
		
		//submit button
		driver.findElement(By.name("websubmit")).click();
		

	}

}
