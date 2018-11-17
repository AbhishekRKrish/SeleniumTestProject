package utility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven{
	
	
	@Test
	public ArrayList<String> dataReader(String testcasename) throws IOException{
		
		ArrayList<String>a=new ArrayList<String>();
		
	FileInputStream fs = new FileInputStream("C://Users//Abhi//Desktop//software development engineer in TEST//datadriven.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	int count = wb.getNumberOfSheets();
	
	
	for(int i=0;i<count;i++) {
		if(wb.getSheetName(i).equalsIgnoreCase("sheet1")) {
		 XSSFSheet sheet = wb.getSheetAt(i);
		Iterator<Row> r= sheet.iterator();
		
		//row is the collection of cells
		Row firstrow = r.next();
		
		Iterator<Cell> ce = firstrow.cellIterator();
		int k=0;
		//k is to increment over the row
		int coloumn = 0;
		while(ce.hasNext())
		{
			Cell value = ce.next();
			if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
				
				
				coloumn =k;
			}
			k++;
		}
		
		System.out.println(coloumn);
		
		while(r.hasNext()) {
			Row row =r.next();
			if(row.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcasename)) {
				
				Iterator<Cell>cv = row.cellIterator();
				while(cv.hasNext()) {
					
					a.add(cv.next().getStringCellValue());
					System.out.println(cv.next().getStringCellValue());
				}
				
		}
		
			
		}
		
	}
		
		
	
	}
	return a;
	
	}
}

