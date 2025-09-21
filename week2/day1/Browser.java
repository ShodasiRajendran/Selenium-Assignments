package week2.day1;

public class Browser {

	public void launchBrowser(String browserName) {
		System.out.println("BrowserName is "+browserName);

	}
	
	//return type string is declared
	public String loadURL() {
		String url="Url loaded successfully";
		System.out.println(url);
		return url;
	}
	public static void main(String[] args) {
		Browser	browserFunctions=new Browser();
		browserFunctions.launchBrowser("Chrome");
		String c=browserFunctions.loadURL();
		System.out.println(c);
		

	}

}
