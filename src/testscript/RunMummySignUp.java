package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Precondition;
import pom.Auro_Categories_Page;
import pom.Auro_Checkout_Page;
import pom.Auro_Goals_Page;
import pom.Auro_Home_Page;
import pom.Auro_Level_Page;
import pom.Auro_SignUp_Page;
import pom.Login_Page;

public class RunMummySignUp extends Precondition {
	
	
	
   //Valid Signup make payment and avail offer entering @aurotest.com
	@Test(priority = 0,invocationCount = 0)
	public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment() throws InterruptedException {
		
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
		AC.selectSpin();
		AC.clickNextButton();
		
		Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
		AS.clickEmailTextfield();
		
		AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
		AS.setPassword("assdf");
		AS.setFirstName("Ajuna");
		AS.clickSignUp();
		
		Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
		ACP.scrollToElement();
		ACP.enterCouponCode("RMR20");
		ACP.clickApplyButton();
		ACP.verifyCouponCodeApplied();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		ACP.clickEnterCardNumber();
		ACP.clearEnterCardNumber();
		ACP.enterCardNumber("4242424242424242");
		ACP.enterExpDate("1221");
		ACP.entercVc("122");
		ACP.enterZipCode("12345");
		driver.switchTo().defaultContent();
		ACP.clickStartFreeTrialButton();
		Thread.sleep(6000);
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "https://stage-web.auro.fit/coworking-signup/thank-you");
		
}
	 //Valid Signup make payment and avail offer entering gmail account
		@Test(priority = 0,invocationCount = 0)
		public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_gmail() throws InterruptedException {
			
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
			AC.selectSpin();
			AC.clickNextButton();
			
			Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
			AS.clickEmailTextfield();
			
			AS.setEmail(System.currentTimeMillis()+"@gmail.com");
			AS.setPassword("assdf");
			AS.setFirstName("Ajuna");
			AS.clickSignUp();
			
			Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
			ACP.scrollToElement();
			ACP.clickCouponCode();
			ACP.enterCouponCode("RMR20");
			ACP.clickApplyButton();
			ACP.verifyCouponCodeApplied();
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			ACP.clickEnterCardNumber();
			ACP.clearEnterCardNumber();
			ACP.enterCardNumber("4242424242424242");
			ACP.enterExpDate("1221");
			ACP.entercVc("122");
			ACP.enterZipCode("12345");
			driver.switchTo().defaultContent();
			ACP.clickStartFreeTrialButton();
			Thread.sleep(10000);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);
			Assert.assertEquals(actualurl, "https://stage-web.auro.fit/coworking-signup/thank-you");
			
	}
	 
		
	//InValidalid Sign up By entering already Registered Email and check the error Message
			@Test(priority = 0,invocationCount = 0)
			public void select_LoseWeight_Beginner_Spin_ENTER_ALREADY_REGISTERED_EMAIL() throws InterruptedException {
				
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
				
				Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				AS.clickEmailTextfield();
				
				AS.setEmail(validemail1);
				AS.setPassword("assdf");
				AS.setFirstName("Ajuna");
				AS.clickSignUp();
				Thread.sleep(3000);
				AS.verifyALreadyRegisteredError("You've already registered with us. Please log into your account");
			}
			
			//Invalid SignUp By entering Invalid Email and check the error Message
			@Test(priority = 0,invocationCount = 0)
			public void select_LoseWeight_Beginner_Spin_ENTER_INVALID_EMAIL() throws InterruptedException {
				
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
				Thread.sleep(1000);
				AC.selectSpin();
				AC.clickNextButton();
				
				Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				AS.clickEmailTextfield();
				
				AS.setEmail(invalidemail);
				AS.clickPasswordTextField();
				AS.verifySignUpEmailErrormessageText("Please enter a valid email address.");
			}
			
			//Invalid SignUp By not Entering Password and check the error Message
			@Test(priority = 0,invocationCount =0)
			public void select_LoseWeight_Beginner_Spin_ENTER_NO_PASSWORD() throws InterruptedException {
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
				
				Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				AS.clickEmailTextfield();
				
				AS.setEmail(validemail1);
				AS.setPassword("");
				AS.clickSignUp();
				AS.verifySignUpBLANKpasswordErrormessageText("Please enter your password");
				
			}
			
			//Invalid SignUp By not Entering Email and check the error Message
			@Test(priority = 0,invocationCount =0)
			public void select_LoseWeight_Beginner_Spin_ENTER_NO_EMAIL() throws InterruptedException {
				
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
				Thread.sleep(2000);
				AC.selectSpin();
				AC.clickNextButton();
				
				Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				AS.clickEmailTextfield();
				
				AS.clickEmailTextfield();
				AS.setEmail("");
				AS.setPassword(validpassword2);
				AS.clickSignUp();
				AS.verifySignUpEmailErrormessageText("Please enter your email");
			}
			
			//Invalid SignUp By not Entering Email and Password and check the error Message
			@Test(priority = 0,invocationCount = 100)
			public void select_LoseWeight_Beginner_Spin_ENTER_NO_EMAIL_AND_PASSWORD() throws InterruptedException {
				
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
				Thread.sleep(2000);
				AC.selectSpin();
				AC.clickNextButton();
				
				Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				AS.clickEmailTextfield();
				
				AS.clickEmailTextfield();
				AS.setEmail("");
				AS.setPassword("");
				AS.clickSignUp();
				AS.verifySignUpEmailErrormessageText("Please enter your email");
				AS.verifySignUpBLANKpasswordErrormessageText("Please enter your password");
			}
			
			// SignUp Using FB Account
			@Test(priority = 0,invocationCount =0)
			public void select_LoseWeight_Beginner_Spin_SignUp_By_Fb_Account() throws InterruptedException {
				
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
				
				Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
				AS.clickContinueWithFaceBook();
				AS.switchWindow();
				AS.setFacebookEmail("9620143074");
				AS.setFacebookPassword("mnbvc1234@");
				AS.clickFaceBookLoginButton();
				/*String parent = driver.getWindowHandle();
				driver.switchTo().window(parent);
				Thread.sleep(10000);
				String actualurl = driver.getCurrentUrl();
				System.out.println(actualurl);
				Assert.assertEquals(actualurl, "https://stage-web.auro.fit/profile/account-details?mpt=6650d4a82093db24849b326c60f573edd2d31d011443bf197d38ac8bafc943e3");
				*/
				
			}
}
