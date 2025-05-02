package week1.day2;

public class Browser {
	
	
	String launchBrowser(String browserName)
	{
		System.out.println("Browser Launched SUccessfully");
		System.out.println(browserName);
		return browserName;
		
	}
	
	void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Browser br = new Browser();
		
		br.launchBrowser("Chrome");
		br.loadUrl();

	}

}
