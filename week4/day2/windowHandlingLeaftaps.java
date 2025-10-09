package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowHandlingLeaftaps {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("Guest");
		//Launch Browser, Enter url and maximize window
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		//Enter username, password and click login
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the link CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Contacts> Merge Contacts
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//From Contact
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();
		//getting the window addresses
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> address=new ArrayList<String>(windowHandles);
		for(int i=0;i<2;i++)
		{
			System.out.println(address.get(i));
		}
		//Moving to window 2 and maximize
		driver.switchTo().window(address.get(1));
		driver.manage().window().maximize();
		//Selecting the first contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//switch to parent window
		driver.switchTo().window(address.get(0));
		//To contact
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();
		//Getting window addresses
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> address1=new ArrayList<String>(windowHandles2);
		for(int j=0;j<2;j++)
		{
			System.out.println(address1.get(j));
		}
		//Move to window 2 and maximize
		driver.switchTo().window(address1.get(1));
		driver.manage().window().maximize();
		//Selecting the second contact 
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
		//Switch to parent window
		driver.switchTo().window(address1.get(0));
		//Click on merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Switch to alert and accept
		driver.switchTo().alert().accept();
		//get title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page is :"+title);
		}
		
		

	}
