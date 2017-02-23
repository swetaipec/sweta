package Testcase_pkg;

//import java.io.IOException;
//import java.net.URL;


import org.openqa.selenium.interactions.Action;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Action_pkg.newcustomer_signup;
import Element_pkg.BaseClass;
import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import Utility.Utils;
//import org.apache.log4j.xml.DOMConfigurator;


public class framework {
	public WebDriver driver;
	private int iTestCaseRow;
	private String sTestCaseName;
	@BeforeMethod
	public void beforemethod() throws Exception
	{	
		BasicConfigurator.configure();
// URL u = getClass().getClassLoader().getResource("C:\\Users\\sweta.kumari\\workspace\\ISB\\ISB-log4j.xml");    
//		DOMConfigurator.configure(u);
		DOMConfigurator.configure("C:\\Users\\sweta.kumari\\git\\testserver\\ISB\\src\\isb-log.xml");
		//sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
        System.out.println(sTestCaseName);
		ExcelUtils.setexcelfile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		iTestCaseRow = ExcelUtils.getrowcontains(sTestCaseName,Constant.Col_TestCaseName);
		System.out.println(iTestCaseRow);
		driver = Utils.openbrowser(iTestCaseRow);
		new BaseClass(driver);  
	}
	
	 @Test		
	 public void main() throws Exception	
	 {
		try
		{
		 newcustomer_signup.report(iTestCaseRow);
		 if(BaseClass.bResult==true)
		   {
			 ExcelUtils.setdata("Pass", iTestCaseRow, Constant.Col_result);
			 
		    }
		 else
		   {
				ExcelUtils.setdata("Fail", iTestCaseRow, Constant.Col_result);	
			 throw new Exception("Test Case Failed because of Verification");
		    }
		}
		catch(Exception e)
		{
			Log.error(e.getMessage());
			//Utils.getscreenshot();
		}
	 }
 
}
