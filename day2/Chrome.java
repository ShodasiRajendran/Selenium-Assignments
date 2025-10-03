package week3.day2;


public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("openIncognito from chrome class");

	}
	public void clearCache() {
		System.out.println("clearCache from Chrome class");

	}
	public static void main(String[] args) {
		Chrome options=new Chrome();
		options.openIncognito();
		options.clearCache();
		options.closeBrowser();
		options.navigateBack();
		options.openURL();
		
		

	}
	
	
}
