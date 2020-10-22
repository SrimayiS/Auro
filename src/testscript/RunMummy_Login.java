package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;
import pom.Login_Page;

public class RunMummy_Login extends Precondition{

	//Login with valid credentials
	 @Test(invocationCount = 00)
     public void select_LoseWeight_Beginner_Spin_VALID_LOGIN() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		AC.clickNextButton();
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		Thread.sleep(2000);
		AS.clickLogin();
		
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(validemail1);
		LN.clickPassword();
		LN.setPassword(validpassword1);
		
		LN.clickLogin();
		Thread.sleep(3000);
		LN.clickLogin();
		Thread.sleep(7000);
		/*String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "https://stage-web.auro.fit/profile/account-details?mpt=f9c7e6ad53bd304ee4ec3a9dc1354509c09f09deef2e98c00fa77e99e9177b05");
		
		*/
		
}
	
	 //Login with valid credentials2
	  @Test(invocationCount = 0)
      public void select_LoseWeight_Beginner_Spin_VALID_LOGIN2() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		 	Auro_Level_Page AL=new Auro_Level_Page(driver);
		 	Thread.sleep(5000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		AC.selectSpin();
		AC.clickNextButton();
		Thread.sleep(3000);
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(validemail2);
		LN.clickPassword();
		LN.setPassword(validpassword2);
		
		/*Thread.sleep(10000);
		LN.clickLogin();
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "https://stage-web.auro.fit/profile/account-details?mpt=4c5e2895df3c47b3ac0c8e5dfb5a384094724f6d9d1ee9af4a5438c0a5ae2ae1");
		*/
}
	  
	  //Login with  valid Email and invalid Password and verify the error message
	   @Test(invocationCount = 0)
       public void select_LoseWeight_Beginner_Spin_LOGIN_VALID_EMAIL_INVALID_PASSWORD() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(2000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		AC.clickNextButton();
		
		Thread.sleep(3000);
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(validemail1);
		LN.clickPassword();
		LN.setPassword(invalidpassword);
		
		LN.clickLogin();
		Thread.sleep(2000);
		LN.verifypasswordErrormessageText("Invalid email or password");
		
}
	  
	   //Login Entering Invalid Email and Valid Password and verify the error message
	   @Test(invocationCount =0)
       public void select_LoseWeight_Beginner_Spin_LOGIN_INVALID_EMAIL__VALIDPASSWORD() throws InterruptedException {
 		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(5000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		AC.selectSpin();
		AC.clickNextButton();
		Thread.sleep(3000);
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(invalidemail);
		LN.clickPassword();
		LN.setPassword(validpassword1);
		
		LN.clickLogin();
		LN.verifyEmailErrormessageText("Please enter a valid email address.");
	  }	
	  
	  //Login Entering Unregistered Mail and check the error message
	   @Test(invocationCount = 0)
       public void select_LoseWeight_Beginner_Spin_LOGIN_UNREGISTEREDMAIL() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(2000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		AC.clickNextButton();
		Thread.sleep(1000);
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(unRegisteredmail);
		LN.clickPassword();
		LN.setPassword(validpassword1);
		LN.clickLogin();
		Thread.sleep(1000);
		LN.verifyinvalidusernameorpassworderrormessageText("Invalid email or password");
	  }
	   //Login Entering No Email and check the error Message
	   @Test(invocationCount = 0)
       public void select_LoseWeight_Beginner_Spin_LOGIN_ENTERNO_EMAIL__ENTER_PASSWORD() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(2000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		AC.clickNextButton();
		Thread.sleep(1000);
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail("");
		LN.clickPassword();
		LN.setPassword(validpassword1);
		LN.clickLogin();
		Thread.sleep(1000);
		LN.verifyBLANKEmailErrormessageText("Please enter your email");
	  }
	   
	   //Login Entering Email but No Password and check the error Message
	   @Test(invocationCount = 0)
       public void select_LoseWeight_Beginner_Spin___LOGIN_VALIDEmail_NO_PASSWORD() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(3000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(3000);
		AC.selectSpin();
		AC.clickNextButton();
		Thread.sleep(3000);
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail(validemail1);
		LN.clickPassword();
		LN.setPassword("");
		LN.clickLogin();
		Thread.sleep(1000);
		LN.verifyBLANKpasswordErrormessageText("Please enter your password");
	  }
	   
	   
	 //Dont enter Email and Password and login and check the error Message
	   @Test(invocationCount = 100)
       public void select_LoseWeight_Beginner_Spin___LOGIN_ENTER_NO_Email_AND_PASSWORD() throws InterruptedException {
		
		Auro_Home_Page AH=new Auro_Home_Page(driver);
		AH.clickGet30DaysFreeButton();
		
	    Auro_Goals_Page AG=new Auro_Goals_Page(driver);
		AG.selectLoseweight();
		AG.clickNextButton();
		
		Auro_Level_Page AL=new Auro_Level_Page(driver);
		Thread.sleep(1000);
		AL.selectBeginner();
		AL.clickNextButton();
		
		Auro_Categories_Page AC=new Auro_Categories_Page(driver);
		Thread.sleep(1000);
		AC.selectSpin();
		AC.clickNextButton();
		Thread.sleep(1000);
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickLogin();
		
		Login_Page LN=new Login_Page(driver);
		LN.clickEmail();
		LN.setEmail("");
		LN.clickPassword();
		LN.setPassword("");
		LN.clickLogin();
		Thread.sleep(1000);
		LN.verifyBLANKpasswordErrormessageText("Please enter your password");
		LN.verifyBLANKEmailErrormessageText("Please enter your email");
	  }
}
