package com.Reflective.AssignmentTest;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Reflective.AssignmentLib.ReflectiveBusinessLib;
import com.Reflective.GenricUtils.Driver;
import com.Reflective.GenricUtils.ReflectiveGenricUtils;
import com.Reflective.PageFactory.AmazonHomePage;
import com.Reflective.PageFactory.CleartripBookFlightPage;
import com.Reflective.PageFactory.CleartripHomePage;
import com.Reflective.PageFactory.CleartripItineraryPage;


public class AssigementTest {
	
	ReflectiveGenricUtils dm= new ReflectiveGenricUtils();
    Select sel;
	String departDate=dm.futureDate(15);
    String returnDate=dm.futureDate(16);
	String fromPlace="Bangalore, IN - Kempegowda International Airport (BLR)";
	String ToPlace="New Delhi, IN - Indira Gandhi Airport (DEL)";
	ReflectiveBusinessLib expenses=new ReflectiveBusinessLib();
	
	//readmi- 
	//In this testNG file you will find all 3 scenario.
	// right click and run as testNG suite.
	
	//For 4th scenario please find emailable report in test-output folder.
	

	@Test(priority = 0)
	public void seanarioFirst() throws IOException {
		CleartripHomePage homePage=PageFactory.initElements(Driver.driver, CleartripHomePage.class);
		CleartripBookFlightPage bookFlight=PageFactory.initElements(Driver.driver, CleartripBookFlightPage.class);
		CleartripItineraryPage itineary=PageFactory.initElements(Driver.driver, CleartripItineraryPage.class);
		ReflectiveGenricUtils dm= new ReflectiveGenricUtils();
		String departDate=dm.futureDate(15);
	    String returnDate=dm.futureDate(16);
	    String emailID="karan.sinha@gmail.com";
	    String FirstName="Karan";
	    String LastName="Mehra";
	    String childFName="Angle";
	    String aTitle="Mr";
	    String cTitle="Miss";
	    String mobileno="9826648737";
	    System.setProperty("webdriver.chrome.driver", "/Reflektive_Assignment/chromedriver.exe");
		Driver.driver=new ChromeDriver();
		Driver.driver.get(dm.readProperties("url_cleartrip"));
		Driver.driver.manage().window().maximize();
		
		    dm.impliciteWait();
	    	homePage.getRoundTripBtn().click();
	    	homePage.getFromWhereEdit().sendKeys(fromPlace);
	    	homePage.getToWhereEdit().sendKeys(ToPlace);
	    	homePage.getDepartDate().click();
	    	homePage.getDepartDate().sendKeys(departDate);
	    	homePage.getReturnDate().click();
	    	homePage.getReturnDate().sendKeys(returnDate);
		    homePage.getReturnDate().sendKeys(Keys.TAB);
		    sel=new Select(homePage.getAdultDropdown());
		    sel.selectByVisibleText("1");
		    sel=new Select(homePage.getChildrenDropdown());
		    sel.selectByVisibleText("1");
		    homePage.getSearchFlightBtn().click();
		    dm.impliciteWait();
		    bookFlight.getBookTicketBtn().click();
		    dm.impliciteWait();
		    itineary.getConfirmcheckBox().click();
		    itineary.getItineraryBtn().click();
		    dm.impliciteWait();
		    itineary.getEmailtxtBox().sendKeys(emailID);
		    itineary.getContinueBtn().click();
		    dm.impliciteWait();
		    sel=new Select(itineary.getAdultTitle());
		    sel.selectByVisibleText(aTitle);
		    itineary.getaFName().sendKeys(FirstName);
		    itineary.getaLname().sendKeys(LastName);
		    sel=new Select(itineary.getChildTitle());
		    sel.selectByVisibleText(cTitle);
		    itineary.getChildFname().sendKeys(childFName);
		    itineary.getChildLName().sendKeys(LastName);
		    sel=new Select(itineary.getChildday());
		    sel.deselectByVisibleText("5");
		    sel=new Select(itineary.getChildMonth());
		    sel.deselectByVisibleText("Mar");
		    sel=new Select(itineary.getChildyear());
		    sel.deselectByVisibleText("2007");
		    itineary.getMobileNumber().sendKeys(mobileno);
		    itineary.getTravelBtn().click();
		    dm.impliciteWait();
		    itineary.getUpitab().click();	    
		    
	}
	
	@Test(priority = 1)
	public void Secondseanario() throws IOException {
		
		AmazonHomePage amazon=PageFactory.initElements(Driver.driver, AmazonHomePage.class);
		ReflectiveGenricUtils dm= new ReflectiveGenricUtils();
		String bookName="A Brief History of Everyone Who Ever Lived";
		System.setProperty("webdriver.chrome.driver", "/Reflektive_Assignment/chromedriver.exe");
		Driver.driver=new ChromeDriver();
		Driver.driver.get(dm.readProperties("url_amazon"));
		Driver.driver.manage().window().maximize();
		amazon.getSearchBox().click();
		amazon.getSearchBox().sendKeys(bookName);
		amazon.getSearchBtn().click();
		dm.impliciteWait();
		amazon.getBookName().click();
		amazon.getBuyNowBtn().click();
		
	}
	
	@Test(priority = 2)
	public void karanExpensesInTheSheet() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
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
	     expenses.writeExpensesAmountIntoExcel("Expenses",6,1,total_expenses);
		
		
	}
	
	
	/*@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Reflektive_Assignment/chromedriver.exe");
		Driver.driver=new ChromeDriver();
	}*/
	
	@AfterMethod
	public void driverQuit() {
		Driver.driver.quit();
		
	}
	
	
	

}
