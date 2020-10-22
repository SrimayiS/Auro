package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot implements AutoConstant {

	public void capture(WebDriver driver,String Testname) {
		
		String Date = new Date().toString().replace(":", "-");
		TakesScreenshot TS=(TakesScreenshot) driver;
		File src = TS.getScreenshotAs(OutputType.FILE);
		File dst = new File(defects+Testname+Date+".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(src, dst);
		} catch (IOException e) {
			System.out.println("Failed to take screenshot");
		}
		}
	
}
