package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter Username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		//Filling up the details
		//Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("Account636");
		
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter Industry
		WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select options=new Select(industryDropdown);
		options.selectByIndex(3);
		
		//Enter Ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select options1=new Select(ownership);
		options1.selectByVisibleText("S-Corporation");
		
		//Enter Source
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select options2=new Select(source);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		//Enter marketingCampaignId
		WebElement marketingCampaignId = driver.findElement(By.id("marketingCampaignId"));
		Select options3=new Select(marketingCampaignId);
		options3.selectByIndex(6);
		
		//Enter state/province
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4=new Select(state);
		options4.selectByValue("TX");
		
		//Click Create Account
		driver.findElement(By.className("smallSubmit")).click();
		
	
		//verify AccountName
	   // String accountName = driver.findElement(By.className("titleCell").className("requiredField")).getText();
		//String accountName = driver.findElement(By.xpath("//span[text()='Account Name']")).getText();
		//System.out.println(accountName);
		
		//close browser
		driver.close();
		
	}

}
