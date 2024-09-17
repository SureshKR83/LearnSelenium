package Wk2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args)
	{
		//Launch the Browser
		ChromeDriver dr = new ChromeDriver();
		
		//Launch the URL
		dr.get("https://www.facebook.com/");
		
		//Maximize the window
		dr.manage().window().maximize();
		
		//finding the Element
		dr.findElement(By.id("email")).sendKeys("testuser12345@gmail.com");
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("qwer1234$");
		
		dr.findElement(By.xpath("//button[@name='login']")).click();		
		
		
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		dr.findElement(By.linkText("Find your account and log in.")).click();
}
}
