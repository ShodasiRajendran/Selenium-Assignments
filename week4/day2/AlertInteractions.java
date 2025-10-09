package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		String simpleAlertText = driver.switchTo().alert().getText();
		System.out.println("SimpleAlertText: "+simpleAlertText);
		driver.switchTo().alert().accept();
		
		//confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		String confirmationAlertText = driver.switchTo().alert().getText();
		System.out.println("Confirmation Alert Text:"+confirmationAlertText);
		driver.switchTo().alert().dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		String promptAlertText = driver.switchTo().alert().getText();
		System.out.println("Confirmation Alert Text:"+promptAlertText);
		driver.switchTo().alert().sendKeys("Sent Text");
		driver.switchTo().alert().accept();
		String promptAlertText1 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Prompt Alert Text :"+promptAlertText1);
		driver.close();
		
	}

}
