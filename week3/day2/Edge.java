package week3.day2;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("To Take Snap");
	}
	
	public void clearCookies() {
		System.out.println("To clear cookies");
	}
	
	public static void main(String[] args) {
		
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
	}
}
