package com.Reflective.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CleartripItineraryPage {

	@FindBy(id="insurance_confirm")
	private WebElement confirmcheckBox;
	
	@FindBy(id="itineraryBtn")
	private WebElement itineraryBtn;
	
	@FindBy(id="username")
	private WebElement emailtxtBox;
	
	@FindBy(id="LoginContinueBtn_1")
	private WebElement continueBtn;
	
	@FindBy(id="AdultTitle1")
	private WebElement adultTitle;;
	
	@FindBy(xpath="(//*[@id=\"AdultFname1\"])[1]")
	private WebElement aFName;
	
	@FindBy(xpath="(//*[@id=\"AdultLname1\"])[1]")
	private WebElement aLname;
	
	
	@FindBy(id="ChildTitle1")
	private WebElement childTitle;
	
	@FindBy(id="ChildFname1")
	private WebElement childFname;
	
	@FindBy(id="ChildLname1")
	private WebElement childLName;
	
	@FindBy(id="ChildDobDay1")
	private WebElement childday;
	
	@FindBy(id="ChildDobMonth1")
	private WebElement childMonth;
	
	@FindBy(id="ChildDobYear1")
	private WebElement childyear;
	
	@FindBy(id="(//*[@id=\"mobileNumber\"])[1]")
	private WebElement mobileNumber;
	
	@FindBy(id="travellerBtn")
	private WebElement travelBtn;
	
	@FindBy(id="UPTab")
	private WebElement upitab;
	

	public WebElement getUpitab() {
		return upitab;
	}

	public WebElement getConfirmcheckBox() {
		return confirmcheckBox;
	}

	public WebElement getItineraryBtn() {
		return itineraryBtn;
	}

	public WebElement getEmailtxtBox() {
		return emailtxtBox;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getAdultTitle() {
		return adultTitle;
	}

	public WebElement getaFName() {
		return aFName;
	}

	public WebElement getaLname() {
		return aLname;
	}

	public WebElement getChildTitle() {
		return childTitle;
	}

	public WebElement getChildFname() {
		return childFname;
	}

	public WebElement getChildLName() {
		return childLName;
	}

	public WebElement getChildday() {
		return childday;
	}

	public WebElement getChildMonth() {
		return childMonth;
	}

	public WebElement getChildyear() {
		return childyear;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getTravelBtn() {
		return travelBtn;
	}
	
	
	
}
