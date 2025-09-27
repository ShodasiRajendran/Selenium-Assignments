package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeads {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("Guest");
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Enter Username and Password
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//click crm/sfa
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		
		//click Leads
		driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
		
		//Find Leads
		driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();
		
		//Find Lead with phonenumber
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12345");
		
		//click Find Leads
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(4000);
		//Click the first Lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		
		//Get First Name
		String firstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		//Delete
		driver.findElement(By.xpath("//a[contains(text(), 'Delete')]")).click();
		
		//To verify lead is deleted, Find Leads by FirstName
		driver.findElement(By.xpath("//a[contains(text(), 'Find Leads')]")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys(firstName);
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		String Lead = driver.findElement(By.xpath("//div[contains(text(), 'No records to display')]")).getText();
		System.out.println("Lead");
		if(Lead.equalsIgnoreCase("no records to display"))
			System.out.println(firstName+" is not a lead");
		driver.close();

	}

}
