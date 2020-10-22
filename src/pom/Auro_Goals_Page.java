package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Goals_Page extends Base_Page {

	@FindBy(xpath = "//p[.='Lose weight']")
	private WebElement loseweightButton;
	
	
	@FindBy(xpath = "//p[.='Run a race']")
	private WebElement runaRaceButton;
	
	
	@FindBy(xpath = "//p[.='Build strength']")
	private WebElement buildStrengthButton;
	
	@FindBy(id = "goals-submit-button")
	private WebElement nextButton;
	
	
	public Auro_Goals_Page(WebDriver driver) {
		super(driver);
	}
	
	
	 public void selectLoseweight() {
			
			loseweightButton.click();
		}
	 
	public void selectRunaRace() {
		
		runaRaceButton.click();
	}
	
    public void selectBuildStrength() {
		
    	buildStrengthButton.click();
	}

	public void clickNextButton() {
		
		nextButton.click();
	}
	
}
