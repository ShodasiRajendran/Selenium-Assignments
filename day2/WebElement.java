package week3.day2;

public class WebElement {

	public void click() {
		System.out.println("click from Superclass-WebElement");

	}
	public void setText(String text) {
		System.out.println("setText from Superclass-WebElement:"+text);
	}
	
	public static void main(String[] args) {
		System.out.println("Printing from the Main method of superclass-webElement");
		
		//Superclass can call methods inside the class alone
		WebElement obj=new WebElement();
		obj.click();
		obj.setText("note2");
		
	}

}
