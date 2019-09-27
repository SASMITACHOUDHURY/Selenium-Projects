package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
public static String readData(String sheetName,int rowNum,int cellNum)
{
	try{
		FileInputStream fis=new FileInputStream("D:\\testdata/userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String s=w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return s;
	}
	catch(Exception rv)
	{
		return "invalid";
	}
}
 public static void writeData(String sheetName,int rowNum,int cellNum,String data)
 {
	 try{
		 FileInputStream fis=new FileInputStream("D:\\testdata/userdata.xlsx");
		 Workbook w1=WorkbookFactory.create(fis);
		 w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
		 FileOutputStream fos=new FileOutputStream("D:\\testdata/userdata.xlsx");
		 w1.write(fos);
	 }
	 catch(Exception rv)
	 {
		 
	 }
 }
 public static long readNumberData(String sheetName,int rowNum,int cellNum)
 {
	try{
		FileInputStream fis=new FileInputStream("D:\\testdata/userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		long i=(long)w1.getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
		return i;
	}
	catch(Exception rv)
	{
		return 0;
	}
 }
}
