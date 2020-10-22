package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Categories_Page extends Base_Page {

	@FindBy(xpath = "//p[.='Spin']")
	private WebElement spinButton;
	
	
	@FindBy(id = "categories-submit-button")
	private WebElement nextButton;
	
	
	public Auro_Categories_Page(WebDriver driver) {
		super(driver);
	}
	
	
	public void selectSpin() {
		spinButton.click();
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
}
