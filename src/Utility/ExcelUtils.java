package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.bcel.classfile.Constant;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Utility.Log;

public class ExcelUtils
{
private static XSSFSheet excelsheet;
private static XSSFRow excelrow;
private static XSSFCell excelcell;
private static XSSFWorkbook excelbook;

public static void setexcelfile(String path, String sheetname) throws IOException
{
	try{
	FileInputStream excelfile=new FileInputStream(path);
	excelbook=new XSSFWorkbook(excelfile);
	excelsheet=excelbook.getSheet(sheetname);
	}
	catch (Exception e)
	{
		Log.error(e.getMessage());
		throw (e);
		
	}
}

public static String getcelldata(int rownum, int colnum	) throws Exception
{
	try
	{
	excelcell=excelsheet.getRow(rownum).getCell(colnum);
	String celldata=excelcell.getStringCellValue();
	return celldata;
	}
	catch(Exception e )
	{
    Log.error(e.getMessage());
    throw (e);
	
	}
		
}


@SuppressWarnings("static-access")
public static void setdata(String Result, int rownum, int colnum) throws Exception
{ 
	try
{
	excelrow=excelsheet.getRow(rownum);
	excelcell=excelrow.getCell(colnum, excelrow.RETURN_BLANK_AS_NULL);
	if(excelcell==null)
	{	
	excelcell=excelrow.createCell(colnum);
	excelcell.setCellValue(Result);
	}
	
	else
	   {
		 excelcell.setCellValue(Result);
	   }
	
	FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

    excelbook.write(fileOut);

    fileOut.flush();

  fileOut.close();
	
}
catch(Exception e)
{
	Log.error(e.getMessage());
    throw (e);
}
	
	}



public static int getrowcontains(String sTestCaseName, int colNum) throws Exception
{ 
	try
	{
	int i;
	int rowcount=ExcelUtils.getRowUsed();
	for ( i=0 ; i<=rowcount; i++)
	{

		if  (ExcelUtils.getcelldata(i,colNum).equalsIgnoreCase(sTestCaseName))
		{

			break;

		}
	}
	     return i;
	}
	     catch(Exception e)
	     {Log.error(e.getMessage());
	    	 throw(e);
	     }
}

public static int getRowUsed() throws Exception {

	try{

		int RowCount = excelsheet.getLastRowNum();

				

		return RowCount;

	}catch (Exception e){
		Log.error(e.getMessage());
		System.out.println(e.getMessage());

		throw (e);

	}

}




	
}


