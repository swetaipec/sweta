package Element_pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Newcustomer extends BaseClass
{ 
	public static WebElement element=null;
		public Newcustomer() 
		{
		super(driver);
		
	     }

	public static class order
	{       
			public static WebElement order_report_btn()
		     {
			   element=driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/ul/li[1]/a"));
			   return element;
		    }
	       
			public static WebElement select_report_type()
			{
	        	 System.out.println("wait for report type ");
	        	// driver.navigate().to("https://test.insightbee.com/selectreporttype");
                 element=driver.findElement(By.id("company-report"));
	        	 System.out.println(" report type  selected  ");
                return element;
			}
	       
	        public static WebElement businessquestion()
	        {
	        	element=driver.findElement(By.xpath("html//body//div[3]//div//div[3]//div[2]//div[1]//div//div[1]//form//fieldset//div//div[1]//input"));
	        	//System.out.println(" Business Question form found   ");
	        	return element;
	        }
	        
	        public static WebElement business_cntue_btn()
	        {
	        	element=driver.findElement(By.xpath("html//body//div[3]//div//div[3]//div[2]//div[1]//div//div[1]//form//fieldset//div//div[2]//input"));
	        	return element;
	        }
	       
	        public static WebElement change_currency()
	        {
	        	element=driver.findElement(By.className("change-cur-btn"));
	        	return element;
	        }
	        
	        public static WebElement levelofdetial()
	        {
	        	element=driver.findElement(By.xpath("html//body//div[3]//div//div//div[3]//div[2]//div[1]//div[1]//p[2]//a"));
	        	return element;
	    
	        }
	        
	        public static WebElement levelofdetail_cntue_btn()
	        {
	        	element=driver.findElement(By.xpath("html//body//div[3]//div//div//div[4]//div//div//div//input"));
	        	return element;
	        }
			
	        public static WebElement tellusmore()
	        {
	        	element=driver.findElement(By.xpath("html//body//div[3]//div//div//div[3]//div//form[1]//fieldset//textarea"));
	        	return element;
	        }
	        public static WebElement report_word_format()
	        {
	        	element=driver.findElement(By.xpath("html//body//div[3]//div//div//div[4]//div//fieldset//div//form//label[1]"));
	        	return element;
	        }
	        
	        public static WebElement tellusmore_cntue_btn()
	        {
	        
	        element=driver.findElement(By.xpath("html//body//div[3]//div//div//div[5]//div//div//div//input"));
	        	return element;
	        }
	}
	        public static class signup
	        {
	        	public static WebElement firstname()
	        	{
	        		element =driver.findElement(By.id("firstName"));
	        		return element;
	        		
	        	}
	        	
	        	public static WebElement lastname()
	        	{
	        		element=driver.findElement(By.id("lastName"));
	        		return element;
	        	}
	        	
	        	public static WebElement Email()
	        	{
	        		element=driver.findElement(By.id("email"));
	        		return element;
	        	}
	        	public static WebElement confirm_email()
	        	{
	        		element=driver.findElement(By.id("formPhone"));
	        		return element;
	        	}
	        	public static WebElement phn()
	        	{
	        		element=driver.findElement(By.id("formPhone"));
	        		return element;
	        	}
	        	
	        	public static WebElement pwd()
	        	{
	        		element=driver.findElement(By.id("formPassword"));
	        		return element;
	        	}
	        	
	        	public static WebElement pwd_confirm()
	        	{
	        		element=driver.findElement(By.id("passwordConfirm"));
	        		return element;
	        	}
	        	
	        	
	        	public static WebElement country()
	        	{
	        		element=driver.findElement(By.id("formCountry_value"));
	        		return element;
	        	}
	        	public static WebElement PromoCode()
	        	{
	        		element=driver.findElement(By.id("formVoucher"));
	        		return element;
	        	}
	        	
	        	public static WebElement Apply_btn_promocode()
	        	{
	        		element=driver.findElement(By.xpath("html//body//div[2]//div//div//div[2]//div//div//div[4]//div[2]//div[1]//form//fieldset//div//input[2]"));
	        		return element;
	        	}
	        	
	        		        	
	        }
	
	         public static class payment_carddetial
	         {
	        	 public static WebElement name_on_card()
	        	 {
	        		 element=driver.findElement(By.id("formNameOnCard"));
	        		 return element;
	        	 }
	        	 
	        	 public static WebElement CardNumber()
	        	 {
	        	 element=driver.findElement(By.id("formCardNumber"));
	        	 return element;
	        	 }
	        	 
	        	 public static WebElement Expiry_month()
	        	 {
	        		 element=driver.findElement(By.xpath("html//body//div[2]//div//div//form//div[4]//div//fieldset//div//div[2]//fieldset//div[1]//div[3]//div//div[1]//div//ul//li[1]//a"));
	        		 return element;
	        	 }
	        	 
	        	 public static WebElement Expiry_year()
	        	 {
	        		 element=driver.findElement(By.xpath("html//body//div[2]//div//div//form//div[4]//div//fieldset//div//div[2]//fieldset//div[1]//div[3]//div//div[2]//div//ul//li[1]//a"));
	        		 return element;
	        	 }
	        	 public static WebElement CVC()
	        	 {
	        		 element=driver.findElement(By.id("formCVC"));
	        		 return element;
	        	 }
	        	 public static WebElement TermsnCondition()
	        	 {
	        		 element=driver.findElement(By.id("formAgreeTaC"));
	        		 return element;
	        	 }
	        	 public static WebElement PlaceOrder()
	        	 {
	        		 element=driver.findElement(By.xpath("html//body//div[2]//div//div//form//div[6]//div//div//div//input"));
	        		 return element;
	        	 }
	        	 
	        	 
	         }
	
	
}
