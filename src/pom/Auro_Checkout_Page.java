package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Auro_Checkout_Page extends Base_Page {
	WebDriver driver;
	
	@FindBy(id = "checkout-coupon")
	private WebElement enterCouponCodeTestfield;
	
	@FindBy(id = "coupon-apply-btn")
	private WebElement applyButton;
	
	@FindBy(name = "cardnumber")
	private WebElement enterCardNumberTextField;
	
	@FindBy(name = "exp-date")
	private WebElement expDate;
	
	@FindBy(id = "complete-purchase-button")
	private WebElement startFreeTrialButton;
	
	@FindBy(name = "cvc")
	private WebElement cVc;
	
	
	@FindBy(name = "postal")
	private WebElement zipCode;
	
	@FindBy(xpath = "//p[@id='coupon-message']")
	private WebElement couponMesage;
	
	@FindBy(xpath = "//p[.='This coupon code is invalid. Please try a different one']")
	private WebElement InvalidCouponCard;
	
	@FindBy(xpath = "//div[.='Your card has expired.']")
	private WebElement expiredCard;
	
	@FindBy(xpath = "(//div[contains(.,'security code is incorrect')])[14]")
	private WebElement incorrectSecurityCode;
	
	
	@FindBy(xpath = "//div[.='An error occurred while processing your card. Try again in a little bit.']")
	private WebElement ProcessingCardError;
	
	@FindBy(xpath = "//div[.='Your card number is invalid.']")
	private WebElement InvalidCard;
	
	@FindBy(xpath = "(//div[contains(.,'expiration date is incomplete')])[14]")
	private WebElement IncompleteCardExpireDate;
	
	@FindBy(xpath = "(//div[contains(.,'security code is incomplete.')])[14]")
	private WebElement IncomleteSecurityCode;
	
	@FindBy(xpath = "//div[.='Your card number is incomplete.']")
	private WebElement IncomleteCardNumber; 
	
	@FindBy(xpath = "(//div[contains(.,'Your postal code is incomplete.')])[14]")
	private WebElement IncomletePostalCode;
	
	@FindBy(xpath = "//div[contains(.,'expiration year is in the past.')]")
	private WebElement CardExpireDateInThePast;
	
	
	public Auro_Checkout_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	
	public void clickCouponCode() {
		enterCouponCodeTestfield.click();
	}
	
	public void enterCouponCode(String Couponcode) {
		enterCouponCodeTestfield.sendKeys(Couponcode);
	}
	
	public void clickApplyButton() {
		applyButton.click();
	}
	
	public void clickEnterCardNumber() throws InterruptedException {
		
		enterCardNumberTextField.click();
	}
	
	public void clearEnterCardNumber() {
		enterCardNumberTextField.clear();
	}
	
	
	public void enterCardNumber(String Cardnum) throws InterruptedException {
		
		enterCardNumberTextField.sendKeys(Cardnum);
		
	}
	
	public void enterExpDate(String expDAte) {
		expDate.sendKeys(expDAte);
	}
	
	public void entercVc(String cVcCode) {
		cVc.sendKeys(cVcCode);
	}
	
	public void enterZipCode(String Zip) {
		zipCode.sendKeys(Zip);
	}
	
	public void clickStartFreeTrialButton() throws InterruptedException {
		
		startFreeTrialButton.click();
	}
	
   public void verifyCouponCodeMessage(String CouponCodeMessage)  {
		
		getText(couponMesage, 10, CouponCodeMessage);
	}
   
   public void verifyCouponCodeApplied()  {
		
		verifyElement(couponMesage, 10);
	}
   
   public void verifyCouponCodeErrorMessage()  {
		
		verifyElement(InvalidCouponCard, 10);
	}
   
  
   
   public void verifyExpiredCardMessage(String ExpiredCardMessage)  {
		
		getText(expiredCard, 10, ExpiredCardMessage);
	}
   
   public void verifyIncorrectSecurityCodeMessage(String IncorrectSecurityMessage)  {
		
		getText(incorrectSecurityCode, 10, IncorrectSecurityMessage);
	}
   
   public void verifyProcessingErrorMessage(String ProcessingErrorMessage)  {
		
		getText(ProcessingCardError, 10, ProcessingErrorMessage);
	}
   
   public void verifyInvalidCardNumber(String InvalidCardNumberErrorMessage)  {
		
		getText(InvalidCard, 10, InvalidCardNumberErrorMessage);
	}
   
   public void verifyInvalidCouponCardError(String InvalidCouponCardError)  {
		
		getText(InvalidCouponCard, 10, InvalidCouponCardError);
	}
   
   public void verifyIncompleteCardExpiryDate(String IncompleteCouponCardExpireDate)  {
		
		getText(IncompleteCardExpireDate, 10, IncompleteCouponCardExpireDate);
	}
 
   public void verifyIncomleteSecurityCodeError(String verifyIncomleteSecurityCode)  {
		
		getText(IncomleteSecurityCode, 10, verifyIncomleteSecurityCode);
	}
   
   public void verifyIncomletePostalCodeError(String enterIncomletePostalCode)  {
		
		getText(IncomletePostalCode, 10, enterIncomletePostalCode);
	}
	
   public void verifyIncomleteCardNumberError(String enterIncomleteCardNumber)  {
		
		getText(IncomleteCardNumber, 10, enterIncomleteCardNumber);
	}
   
   public void verifyExpirationDateIsInThePastErrorMessage(String ExpirationDateInThePast)  {
		
		getText(CardExpireDateInThePast, 10, ExpirationDateInThePast);
	}
	public void verifyUrl(String Eurl,int time) {
		verifyUrl(Eurl,time);
	}
	public void scrollToElement() {
		scrollToSpecifivLocation(enterCouponCodeTestfield);
	}
	
}
