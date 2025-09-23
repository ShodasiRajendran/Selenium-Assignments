package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadsFunctionality {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("Guest");
		
		//Launch Chrome
		ChromeDriver driver=new ChromeDriver(opt);
		
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize
		driver.manage().window().maximize();
		
		//Enter Username,Password and click login
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crm/sfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		//Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		//Enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		
		//Click LeadButton
		driver.findElement(By.name("submitButton")).click();
		
		//Verify Firstname
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("FirstName is "+firstName);
		
		//close browser
		driver.close();

	}

}
