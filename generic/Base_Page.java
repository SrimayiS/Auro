package generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base_Page {
	
	WebDriver driver;
	
	public Base_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyUrl(String Eurl,int time) {
		try {
			WebDriverWait wait =new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.urlContains(Eurl));
			System.out.println("valid url");
			
		} catch (Exception e) {
			System.out.println("invalid url");
		}
		
		
	}
	
	
}
