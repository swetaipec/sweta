package Element_pkg;
import org.openqa.selenium.WebDriver;
public class BaseClass 
{
	public static boolean bResult;
	public static WebDriver driver;
	public BaseClass(WebDriver driver)
	{
		BaseClass.driver=driver;
		BaseClass.bResult = true;
	}
	
	
	
}
