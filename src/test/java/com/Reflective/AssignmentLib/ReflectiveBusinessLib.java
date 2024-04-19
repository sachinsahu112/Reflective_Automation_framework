package com.Reflective.AssignmentLib;

import org.openqa.selenium.support.PageFactory;

import com.Reflective.GenricUtils.Driver;
import com.Reflective.PageFactory.CleartripHomePage;
		
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;

		import org.apache.poi.EncryptedDocumentException;
		import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
		import org.apache.poi.ss.usermodel.Workbook;


		public class ReflectiveBusinessLib {
			String sheetpath="/Reflektive_Assignment/Reflective_assignment.xlsx";
			
			public void writeExpensesIntoExcel(String sheetname,int rownum,int cellnum,String expensesName) throws EncryptedDocumentException, InvalidFormatException, IOException {
				FileInputStream fis=new FileInputStream(sheetpath);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetname);
				Row row=sh.getRow(rownum);
				Cell cell=row.createCell(cellnum);
				cell.setCellType(cell.CELL_TYPE_STRING);
				cell.setCellValue(expensesName);
				FileOutputStream fos=new FileOutputStream(sheetpath);
				wb.write(fos);
				wb.close();
			}
			
			public void writeExpensesAmountIntoExcel(String sheetname,int rownum,int cellnum,int expensesAmount) throws EncryptedDocumentException, InvalidFormatException, IOException {
				FileInputStream fis=new FileInputStream(sheetpath);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetname);
				Row row=sh.getRow(rownum);
				Cell cell=row.createCell(cellnum);
				cell.setCellType(cell.CELL_TYPE_STRING);
				cell.setCellValue(expensesAmount);
				
				FileOutputStream fos=new FileOutputStream(sheetpath);
				wb.write(fos);
				wb.close();
			}
			
			public int getDataFromExeclSheet(String sheetname,int rowcount,int cellcount) throws InvalidFormatException, IOException{
				FileInputStream fis=new FileInputStream(sheetpath);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetname);
				Row row=sh.getRow(rowcount);
		String data=row.getCell(cellcount).getStringCellValue();
				int data1=Integer.parseInt(data);
				return data1;		
				
			}	
			
			public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
				ReflectiveBusinessLib expenses=new ReflectiveBusinessLib();
				expenses.writeExpensesIntoExcel("Expenses", 0, 0,"Trip to Delhi");
				expenses.writeExpensesIntoExcel("Expenses", 1, 0,"Cab fares for the trip");
				expenses.writeExpensesIntoExcel("Expenses", 2, 0,"Gift for Sandhya");
				expenses.writeExpensesIntoExcel("Expenses", 3, 0,"Food expenses in Delhi");
				expenses.writeExpensesIntoExcel("Expenses", 4, 0,"Buffer");
				expenses.writeExpensesIntoExcel("Expenses", 6, 0,"Total Expenses");
				
				expenses.writeExpensesIntoExcel("Expenses", 0, 1,"16000");
				expenses.writeExpensesIntoExcel("Expenses", 1, 1,"2000");
				expenses.writeExpensesIntoExcel("Expenses", 2, 1,"400");
				expenses.writeExpensesIntoExcel("Expenses", 3, 1,"2000");
				expenses.writeExpensesIntoExcel("Expenses", 4, 1,"3000");
				
				
				int value1=expenses.getDataFromExeclSheet("Expenses", 0, 1);
				int value2=expenses.getDataFromExeclSheet("Expenses", 1, 1);
				int value3=expenses.getDataFromExeclSheet("Expenses", 2, 1);
				int value4=expenses.getDataFromExeclSheet("Expenses", 3, 1);
				int value5=expenses.getDataFromExeclSheet("Expenses", 4, 1);
				
				int total_expenses=value1+value2+value3+value4+value5;
				/*
				 * int total_expenses=0;
				 * 
				 * for (int i = 0; i < args.length; i++) { int
				 * b=expenses.getDataFromExeclSheet("Expenses", i, 1);
				 * total_expenses=total_expenses+b; }
				 */
				
				
				expenses.writeExpensesAmountIntoExcel("Expenses",6,1,total_expenses);
				
				
		
				
				
				
				
				
				
			}

		

		}

	


