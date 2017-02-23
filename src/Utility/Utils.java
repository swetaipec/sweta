package Utility;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Utils
{
	public static WebDriver driver=null;
	public static WebDriver openbrowser(int iTestCaseRow) throws IOException, InterruptedException
	{
          System.setProperty("webdriver.ie.driver", "C:\\Users\\sweta.kumari\\Downloads\\IEDriverServer.exe");

          DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
 		 capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, false);
 		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
         capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		WebDriver driver=new InternetExplorerDriver(capabilities); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(Constant.URL);						
		Runtime.getRuntime().exec("C:\\Users\\sweta.kumari\\Desktop\\ie.exe");
		Thread.sleep(8000);
		return driver;
	}

	public static void waitforelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static String getTestCaseName(String sTestCase)throws Exception{
		 
		String value = sTestCase;
 
		try{
 
			int posi = value.indexOf("@");
 
			value = value.substring(0, posi);
 
			posi = value.lastIndexOf(".");	
 
			value = value.substring(posi + 1);
 
			return value;
 
				}catch (Exception e)
		{
 
 
			throw (e);
 
					}
 
			}
	
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("C:\\Users\\sweta.kumari\\git\\testserver\\ISB\\screenshot.png"));
    }

	
	
	
}
