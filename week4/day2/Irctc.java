package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> address = driver.getWindowHandles();
		List<String> addressList=new ArrayList<String>(address);
		
		driver.switchTo().window(addressList.get(1));
		driver.close();
		
		driver.switchTo().window(addressList.get(0));
		driver.close();
		
		
		
	}

}
