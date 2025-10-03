package week3.day2;

public class CheckBoxButton extends Button{

	public void clickCheckBox() {
		System.out.println("subclass-CheckBoxButton, method: clickCheckBox");
	}
	public static void main(String[] args) {
		System.out.println("subclass-CheckBoxButton, Main method");
		// Can call methods of one and its parent and grandparent
		CheckBoxButton obj=new CheckBoxButton();
		obj.clickCheckBox();
		obj.submit(); //parent's methods
		obj.click(); //grandparent's methods
		obj.setText("note3");
		
	}

}
