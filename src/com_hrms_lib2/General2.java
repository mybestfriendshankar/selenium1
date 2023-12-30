package com_hrms_lib2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class General2 extends Global2 {

	// to provide  related  all re_useable or methods whole application
	public void openapplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		System.out.println("application open");
	}
	
	
	public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(username);	
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login completed");
	}
	
public void pimmouseover () throws InterruptedException {
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	System.out.println("pim completed");
	driver.findElement(By.linkText(btn_addemploye)).click();
	Thread.sleep(4000);
	System.out.println("add employe completed");
}
public void enterframe() {
	driver.switchTo().frame(frame_employeinfo);
	System.out.println("enter frame");
}
public void employeinformation() {
	driver.findElement(By.xpath(Emplastname)).sendKeys(lastname);
	driver.findElement(By.name(Empfirstname)).sendKeys(firstname);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("employes detials completed");		
}
	//public void exitfame() {
	//	driver.switchTo().defaultContent();
	//	System.out.println("exit frame");
	//}
	public void exitfame() {
			driver.switchTo().defaultContent();
			System.out.println("exit frame");
		}
	public void logut() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
	}
	public void closeapplication() {
		driver.close();
		System.out.println("closed application");
	}
	
}
