package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Level_Page extends Base_Page{

	@FindBy(xpath = "//div[@data-option='Beginner']")
	private WebElement beginnerButton;
	
	
	@FindBy(id = "levels-submit-button")
	private WebElement nextButton;
	
	public Auro_Level_Page(WebDriver driver) {
		super(driver);
	}
	
	public void selectBeginner() {
		beginnerButton.click();
	}
	
	public void clickNextButton() {
		nextButton.click();
	}
}
