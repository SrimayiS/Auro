package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Precondition implements AutoConstant  {

	public WebDriver driver;
	
	
	@BeforeMethod

	public void openApplication() {
		System.setProperty(chrome_key, chrome_value);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://stage-web.auro.fit/everlast");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void closeApplication(ITestResult res) {
		String TestName = res.getName();
		System.out.println("Testcase name is "+TestName);
		System.out.println("test case status is "+res.getStatus());
		if (ITestResult.FAILURE==res.getStatus()) {
			Screenshot sc = new Screenshot();
			sc.capture(driver, TestName);
		}
		driver.quit();
	}
}
