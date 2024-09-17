package Wk2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args)
	{
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		dr.close();
		
		System.out.println("Browser Opened and URL launched and then its Closed now");
		
	}

}
