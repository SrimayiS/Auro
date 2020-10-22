package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Login_Page extends Base_Page {

	@FindBy(id = "email-login")
	private WebElement loginEmailTextfield;
	
	@FindBy(id = "password-login")
	private WebElement LoginpasswordTextfield;
	
	@FindBy(xpath ="//button[.='LOG IN']")
	private WebElement loginButton;
	
	@FindBy(id = "email-login-error")
	private WebElement emailErrorMessage;
	
	@FindBy(id = "log-in-error-label")
	private WebElement passwordErrorMessage;
	
	@FindBy(xpath = "//label[.='Invalid email or password']")
	private WebElement invalidusernameorpassworderrormessage;
	
	
	@FindBy(id = "email-login-error")
	private WebElement BlankLoginEmail;
	
	@FindBy(id = "password-login-error")
	private WebElement BlankLoginPassword;
	
	public Login_Page(WebDriver driver) {
		super(driver);
	}
	
	public void clickEmail() {
		loginEmailTextfield.click();
	}
	
	public void setEmail(String loginEmail) {
		loginEmailTextfield.sendKeys(loginEmail);
	}
	
	public void clickPassword() {
		LoginpasswordTextfield.click();
	}
	public void setPassword(String loginPassword) {
		LoginpasswordTextfield.sendKeys(loginPassword);
	}
	
	public void clickLogin() {
		loginButton.click();
		
	}
	
	public void verifyemailErrorMessage() {
		verifyElement(emailErrorMessage, 5);
	}
	
	public void verifypasswordErrorMessage() {
		verifyElement(passwordErrorMessage, 5);
	}
	
	public void verifyEmailErrormessageText(String EmailErrorMessageTEXT) {
	getText(emailErrorMessage, 10, EmailErrorMessageTEXT);
	}
	
	public void verifypasswordErrormessageText(String passwordErrorMessageText) {
		getText(passwordErrorMessage, 10, passwordErrorMessageText);
	}
	
	public void verifyBLANKEmailErrormessageText(String passwordErrorMessageText) {
		getText(BlankLoginEmail, 10, passwordErrorMessageText);
	}
	
	public void verifyBLANKpasswordErrormessageText(String passwordErrorMessageText) {
		getText(BlankLoginPassword, 10, passwordErrorMessageText);
	}
	
	public void verifyinvalidusernameorpassworderrormessageText(String invalidusernameorpassworderrormessageText) {
		getText(invalidusernameorpassworderrormessage, 10, invalidusernameorpassworderrormessageText);
	}
}
