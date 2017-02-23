package Action_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Element_pkg.BaseClass;
import Element_pkg.Newcustomer;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import Utility.Utils;


public class newcustomer_signup  
{
	public static WebDriver driver=null;
  @Test
  public static void report(int iTestCaseRow ) throws Exception 
  {
	  System.out.println("click on order report button ");
	  Newcustomer.order.order_report_btn().click();
	  Thread.sleep(2000);
	  System.out.println("wait");
	  Log.info("First log test message ");
	 // Utils.waitforelement(Newcustomer.order.select_report_type()); //wait untill element appear 
	  
      System.out.println(" report type Selection  ");
//	  boolean b=Newcustomer.order.select_report_type().isSelected();
//	  System.out.println(b);
//	  Actions action = new Actions(driver).contextClick(Newcustomer.order.select_report_type());
//      action.build().perform();
      Newcustomer.order.select_report_type().click();
	  //Thread.sleep(2000);
	  System.out.println("Now It's time to Enter the name of the person you would like us to research");
	  
	  Thread.sleep(2000);
	  String sbusiness=ExcelUtils.getcelldata(1,1);
	  System.out.println(sbusiness);
	  Thread.sleep(2000);	
	  Newcustomer.order.businessquestion().click();
	  Newcustomer.order.businessquestion().sendKeys(sbusiness);
	  Newcustomer.order.business_cntue_btn().click();
	  System.out.println("click on continue button from business question ");
	 
	  Thread.sleep(2000);	
	   System.out.println("test");
	  
	  	 // Utils.waitforelement(Newcustomer.order.levelofdetial());
	   
	  Newcustomer.order.levelofdetial().click();
	  System.out.println("Wh have selected the level of detail of reports ");
	  //Utils.waitforelement( Newcustomer.order.levelofdetail_cntue_btn());
	  
	  Thread.sleep(2000);	
	 if(Newcustomer.order.levelofdetail_cntue_btn().isDisplayed()==true)
	 {
	  Newcustomer.order.levelofdetail_cntue_btn().click();
	  System.out.println("button  displayed ");
	 }
	 else
	 {
		  System.out.println("button not displayed ");
	 }
	// String stellusmore= ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_TellUsMore);
	 String stellusmore= ExcelUtils.getcelldata(1,Constant.Col_TellUsMore);
	 System.out.println(stellusmore);
	  
	//  Utils.waitforelement(Newcustomer.order.tellusmore());
	  Newcustomer.order.tellusmore().sendKeys(stellusmore);
	  
	//  Utils.waitforelement(Newcustomer.order.tellusmore_cntue_btn());
	  Newcustomer.order.tellusmore_cntue_btn().click();
	 
	 // Utils.waitforelement(Newcustomer.order.report_word_format());
	  Newcustomer.order.report_word_format().click();
	 // String sfirstname= ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_Firstname);
	  
	 // Utils.waitforelement(Newcustomer.signup.firstname());
	  Newcustomer.signup.firstname().sendKeys("sfirstname");
	  String semail=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_email);
	  Newcustomer.signup.Email().sendKeys(semail);
	  String sconfirmemail= ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_confirmemail);
	  Newcustomer.signup.confirm_email().sendKeys(sconfirmemail);
	  String sphn=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_phone);
	  Newcustomer.signup.phn().sendKeys(sphn);
	  String spwd=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_pwd);
	  Newcustomer.signup.pwd().sendKeys(spwd);
	  String sconfirnpwd=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_confirmpwd);
	  Newcustomer.signup.pwd_confirm().sendKeys(sconfirnpwd);
	  String scountry=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_country);
	  Newcustomer.signup.country().sendKeys(scountry);
	  String snameoncard=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_nameoncard);
	  Newcustomer.payment_carddetial.name_on_card().sendKeys(snameoncard);
	  String screditnumber=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_credit);
	  Newcustomer.payment_carddetial.CardNumber().sendKeys(screditnumber);
	  Newcustomer.payment_carddetial.Expiry_month().click();
	  Newcustomer.payment_carddetial.Expiry_year().click();
	  String scvc=ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_cvc);
	  Newcustomer.payment_carddetial.CVC().sendKeys(scvc);
	  Newcustomer.payment_carddetial.TermsnCondition().click();
	  
	  
  }
}
