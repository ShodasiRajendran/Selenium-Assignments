package week4.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAllWebElement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size=elements.size();
		List<String> price=new ArrayList<String>();
		System.out.println("Number of Phones: "+size);
		System.out.println("Price of phones are:");
		for(int i=0; i<elements.size();i++)
		{
			WebElement webElement = elements.get(i);
			String text1=webElement.getText();
			price.add(text1);
			System.out.println(text1);
		}
		System.out.println("--------------");
		Collections.sort(price);
		System.out.println("Lowest Price is:" +price.get(0));
		driver.close();
	}

}
