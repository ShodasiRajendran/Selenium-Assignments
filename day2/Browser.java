package week3.day2;

public class Browser {
	public void openURL() {
		System.out.println("openURL from Browser class");

	}
	public void closeBrowser() {
		System.out.println("closeBrowser from Browser class");
	}
	public void navigateBack() {
		System.out.println("navigateback from Browser class");

	}
	public static void main(String[] args) {
		Browser options1=new Browser();
		options1.closeBrowser();
		
	}

}
