package element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\SK\\Downloads\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	  driver.navigate().to("http://demo:ISB53314@test.insightbee.com");
	  System.out.println("test pass");
	  System.out.println("sweta");
  }
}
