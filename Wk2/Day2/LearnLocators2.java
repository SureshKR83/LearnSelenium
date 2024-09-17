package Wk2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators2 {
	
	public static void main(String[] args)
	{
		ChromeDriver newDr = new ChromeDriver();
		
		//Launch the URL
		newDr.get("http://leaftaps.com/opentaps/control/main");
		
		newDr.manage().window().maximize();
		
		newDr.findElement(By.xpath("//input[@id='username']")).sendKeys("DemcoCSR");

		newDr.findElement(By.xpath("//input[@name = 'PASSWORD']")).sendKeys("crmsfa");
		
		newDr.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		
		
		
	}

}
