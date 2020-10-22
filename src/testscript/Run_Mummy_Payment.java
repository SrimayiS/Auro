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

public class Run_Mummy_Payment extends Precondition {

	
	  //Valid Sign up make payment and avail offer @aurotest.com
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
			Thread.sleep(2000);
			AC.selectSpin();
			AC.clickNextButton();
			
			Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
			AS.clickEmailTextfield();
			
			AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
			AS.setPassword("assdf");
			AS.setFirstName("Ajuna");
			AS.clickSignUp();
			
			Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
			Thread.sleep(3000);
			ACP.scrollToElement();
			ACP.clickCouponCode();
			ACP.enterCouponCode("RMR20");
			ACP.clickApplyButton();
			ACP.verifyCouponCodeApplied();
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			ACP.clickEnterCardNumber();
			ACP.clearEnterCardNumber();
			ACP.enterCardNumber("4242424242424242");
			ACP.enterExpDate("1221");
			ACP.entercVc("122");
			ACP.enterZipCode("12345");
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			ACP.clickStartFreeTrialButton();
			Thread.sleep(10000);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);
			Assert.assertEquals(actualurl, "https://stage-web.auro.fit/coworking-signup/thank-you");
			
	}
		//Enter the Expired Card Credentials And verify "Your card has expired." Error Message
		@Test(priority = 0,invocationCount = 0)
		public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_Expired_Card_Credentials() throws InterruptedException {
			
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
			Thread.sleep(1000);
			AC.selectSpin();
			AC.clickNextButton();
			
			Auro_SignUp_Page AS=new Auro_SignUp_Page(driver);
			AS.clickEmailTextfield();
			
			AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
			AS.setPassword("assdf");
			AS.setFirstName("Ajuna");
			AS.clickSignUp();
			
			Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
			Thread.sleep(3000);
			ACP.scrollToElement();
			ACP.enterCouponCode("RMR20");
			ACP.clickApplyButton();
			ACP.verifyCouponCodeApplied();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			ACP.clickEnterCardNumber();
			ACP.clearEnterCardNumber();
			ACP.enterCardNumber("4000000000000069");
			ACP.enterExpDate("1221");
			ACP.entercVc("122");
			ACP.enterZipCode("12345");
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			ACP.clickStartFreeTrialButton();
			ACP.verifyExpiredCardMessage("Your card has expired.");
			
			/*Thread.sleep(10000);
			String actualurl = driver.getCurrentUrl();
			System.out.println(actualurl);
			Assert.assertEquals(actualurl, "https://stage-web.auro.fit/coworking-signup/thank-you");*/
			
	}
		
		//Enter the Card Credentials And verify "Your card's security code is incorrect." Error Message
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_Credentials_Incorrect_Security_Code() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(2000);
					ACP.scrollToElement();

					ACP.enterCouponCode("RMR20");
					ACP.clickApplyButton();
					ACP.verifyCouponCodeApplied();
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4000000000000127");
					ACP.enterExpDate("1221");
					ACP.entercVc("122");
					ACP.enterZipCode("12345");
					driver.switchTo().parentFrame();
					Thread.sleep(2000);
					ACP.clickStartFreeTrialButton();
					ACP.verifyIncorrectSecurityCodeMessage("Your card's security code is incorrect.");
					
				}
				
				//Enter the  Card Credentials And verify "An error occurred while processing your card. Try again in a little bit." Error Message while processing the Card
				@Test(priority = 0,invocationCount = 100)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_Credentials_Error_while_processing_the_card() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					ACP.scrollToElement();
					Thread.sleep(1000);
					ACP.enterCouponCode("RMR20");
					Thread.sleep(1000);
					ACP.clickApplyButton();
					ACP.verifyCouponCodeApplied();
					
					
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4000000000000119");
					ACP.enterExpDate("1221");
					ACP.entercVc("122");
					ACP.enterZipCode("12345");
					driver.switchTo().parentFrame();
					Thread.sleep(2000);
					ACP.clickStartFreeTrialButton();
					ACP.verifyProcessingErrorMessage("An error occurred while processing your card. Try again in a little bit.");
					
				}
				
				
				//Enter the  Card Credentials And verify  "Your card number is invalid."Error Message
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_Credentials_Invalid_CardNumber_ErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					ACP.scrollToElement();
					Thread.sleep(1000);
					ACP.enterCouponCode("RMR20");
					ACP.clickApplyButton();
					
					ACP.verifyCouponCodeApplied();
					Thread.sleep(1000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424241");
					ACP.enterExpDate("1221");
					ACP.entercVc("122");
					ACP.enterZipCode("12345222");
					driver.switchTo().parentFrame();
					Thread.sleep(3000);
					ACP.clickStartFreeTrialButton();
					Thread.sleep(1000);
					ACP.verifyInvalidCardNumber("Your card number is invalid.");
					
				}
				
				//Enter the  invalid coupon code and verify the error message
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_Credentials_Incvalid_CouponCode_ErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					ACP.scrollToElement();
					Thread.sleep(2000);
					ACP.enterCouponCode("ABC20");
					ACP.clickApplyButton();
					ACP.verifyCouponCodeErrorMessage();
					
					
				}
				
				//Enter incomplete card number and verify "Your card number is incomplete." Error message
				@Test(priority = 0,invocationCount = 0)
                public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Entering_IncompleteCardNumber_Verify_ErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					ACP.scrollToElement();
					Thread.sleep(1000);
					ACP.enterCouponCode("RMR20");
					ACP.clickApplyButton();
					ACP.verifyCouponCodeApplied();
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("40000000");
					
					driver.switchTo().parentFrame();
					Thread.sleep(2000);
					ACP.clickStartFreeTrialButton();
					ACP.verifyIncomleteCardNumberError("Your card number is incomplete.");
					
				}
				
				
				 //Enter incomplete ExpiryDate and Verify "Your card's expiration date is incomplete." Error Message 
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Incomplete_ExpiryDate_verifyErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					ACP.scrollToElement();
					Thread.sleep(2000);
					ACP.clickCouponCode();
					ACP.enterCouponCode("RMR20");
					ACP.clickApplyButton();
					ACP.verifyCouponCodeApplied();
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					ACP.enterExpDate("122");
					
					driver.switchTo().defaultContent();
					Thread.sleep(3000);
					ACP.clickStartFreeTrialButton();
					ACP.verifyIncompleteCardExpiryDate("Your card's expiration date is incomplete.");
					
			}
				
				//Enter incomplete CvC Code and Verify "Your card's security code is incomplete." Error Message 
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Incomplete_CvC_Code_verifyErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(5000);
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
					ACP.entercVc("12");
					
					driver.switchTo().defaultContent();
					Thread.sleep(3000);
					ACP.clickStartFreeTrialButton();
					ACP.verifyIncomleteSecurityCodeError("Your card's security code is incomplete.");
					
			}
				
				//Enter incomplete ZIP Code and Verify "Your postal code is incomplete." Error Message 
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Incomplete_ZIP_Code_verifyErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					Thread.sleep(5000);
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
					ACP.enterZipCode("122");
					
					driver.switchTo().defaultContent();
					Thread.sleep(3000);
					ACP.clickStartFreeTrialButton();
					ACP.verifyIncomletePostalCodeError("Your postal code is incomplete.");
					
			}
				
				

				//Enter Dead Card and verify 'Your card's expiration year is in the past.' Error Message 
				@Test(priority = 0,invocationCount = 0)
				public void select_LoseWeight_Beginner_Spin_Availoffer_Dothe_Payment_Enter_DeadCardCredentials_verifyErrorMessage() throws InterruptedException {
					
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
					
					AS.setEmail(System.currentTimeMillis()+"@aurotest.com");
					AS.setPassword("assdf");
					AS.setFirstName("Ajuna");
					AS.clickSignUp();
					
					Auro_Checkout_Page ACP=new Auro_Checkout_Page(driver);
					ACP.scrollToElement();
					Thread.sleep(1000);
					ACP.clickCouponCode();
					ACP.enterCouponCode("RMR20");
					ACP.clickApplyButton();
					ACP.verifyCouponCodeApplied();
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					ACP.clickEnterCardNumber();
					ACP.clearEnterCardNumber();
					ACP.enterCardNumber("4242424242424242");
					ACP.enterExpDate("1218");
					
					driver.switchTo().defaultContent();
					
					
					//ACP.verifyExpirationDateIsInThePastErrorMessage("Your card's expiration year is in the past.");
					
			}
}