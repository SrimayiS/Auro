package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Home_Page extends Base_Page {
	
	@FindBy(xpath = "(//a[.='GET 30 DAYS FREE'])[1]")
	private WebElement get30DaysFreeButton;
	
	
	
	public Auro_Home_Page(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickGet30DaysFreeButton() {
		
		get30DaysFreeButton.click();
	}
	

	

}
