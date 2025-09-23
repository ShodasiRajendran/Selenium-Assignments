package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Launch Chrome
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("https://www.facebook.com/");
		
		//maximize windows
		driver.manage().window().maximize();
		
		//Locate Username and Enter Username
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		
		//Locate password and enter password
		driver.findElement(By.id("pass")).sendKeys("12234");
		
		//click on login button
		driver.findElement(By.name("login")).click();
		
		//Get the title of the page
		String titleOfPage = driver.getTitle();
		//If(titleOfPage.equals("Log in to Facebook"))
			System.out.println("Printing title of the page : "+ titleOfPage);
		
	}

}
