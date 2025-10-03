package week3.day2;

public class Button extends WebElement{

	public void submit() {
		System.out.println("subclass-Button, method: submit");
	}
	public static void main(String[] args) {
		System.out.println("subclass-Button, Main method");
		//subclass can call the methods of one and superclass
		Button obj=new Button();
		obj.submit();
		obj.click();
		obj.setText("");
	}

}
