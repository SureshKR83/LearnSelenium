package Wk2.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	
	public static void main(String[] args)
	{
		
		ChromeDriver Drnew = new ChromeDriver();
		
		Drnew.get("http://leaftaps.com/opentaps/control/main");
		
		Drnew.manage().window().maximize();
		
		Drnew.findElement(By.id("username")).sendKeys("demosalesmanager");
		Drnew.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		Drnew.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		Drnew.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		Drnew.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		Drnew.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		Drnew.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Ernest Young");
		
		Drnew.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Suresh Kumar");
		
		Drnew.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Ramalingam");
		
		WebElement D1 = Drnew.findElement(By.xpath("//select[@Id = 'createLeadForm_dataSourceId']"));
		
		Select dd1 = new Select(D1);
		
		dd1.selectByIndex(4);
		
		WebElement D2 = Drnew.findElement(By.xpath("//select[@Id = 'createLeadForm_marketingCampaignId']"));
		
		Select dd2 = new Select(D2);
		
		dd2.selectByVisibleText("Automobile");
		
		WebElement D3 = Drnew.findElement(By.xpath("//select[@Id = 'createLeadForm_ownershipEnumId']"));
		
		Select dd3 = new Select(D3);
		
		dd3.selectByValue("OWN_CCORP");
		
		
		Drnew.findElement(By.xpath("//input[@id = 'createLeadForm_primaryPhoneNumber']")).sendKeys("224413");
		
		Drnew.findElement(By.xpath("//input[@id = 'createLeadForm_generalCity']")).sendKeys("Waukegan");
		
		Drnew.findElement(By.xpath("//input[@id = 'createLeadForm_generalPostalCode']")).sendKeys("60085");
		
		WebElement D4 = Drnew.findElement(By.xpath("//select[@Id = 'createLeadForm_generalStateProvinceGeoId']"));
		
		Select dd4 = new Select(D4);
		
		dd4.selectByValue("IL");
		
		Drnew.findElement(By.xpath("//input[@name = 'submitButton']")).click();
		
		
	
	}

}
