package com.Reflective.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CleartripHomePage {

	@FindBy(id="RoundTrip")
	private WebElement roundTripBtn;
	
	@FindBy(id="FromTag")
	private WebElement fromWhereEdit;
	
	@FindBy(id="ToTag")
	private WebElement toWhereEdit;
	
	@FindBy(id="DepartDate")
	private WebElement departDate;
	
	@FindBy(id="ReturnDate")
	private WebElement returnDate;
	
	@FindBy(id="Adults")
	private WebElement adultDropdown;
	
	@FindBy(id="Childrens")
	private WebElement childrenDropdown;
	
	@FindBy(id="SearchBtn")
	private WebElement SearchFlightBtn;

	public WebElement getRoundTripBtn() {
		return roundTripBtn;
	}

	public WebElement getFromWhereEdit() {
		return fromWhereEdit;
	}

	public WebElement getToWhereEdit() {
		return toWhereEdit;
	}

	public WebElement getDepartDate() {
		return departDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getAdultDropdown() {
		return adultDropdown;
	}

	public WebElement getChildrenDropdown() {
		return childrenDropdown;
	}

	public WebElement getSearchFlightBtn() {
		return SearchFlightBtn;
	}

	public void setRoundTripBtn(WebElement roundTripBtn) {
		this.roundTripBtn = roundTripBtn;
	}

	public void setFromWhereEdit(WebElement fromWhereEdit) {
		this.fromWhereEdit = fromWhereEdit;
	}

	public void setToWhereEdit(WebElement toWhereEdit) {
		this.toWhereEdit = toWhereEdit;
	}

	public void setDepartDate(WebElement departDate) {
		this.departDate = departDate;
	}

	public void setReturnDate(WebElement returnDate) {
		this.returnDate = returnDate;
	}

	public void setAdultDropdown(WebElement adultDropdown) {
		this.adultDropdown = adultDropdown;
	}

	public void setChildrenDropdown(WebElement childrenDropdown) {
		this.childrenDropdown = childrenDropdown;
	}

	public void setSearchFlightBtn(WebElement searchFlightBtn) {
		SearchFlightBtn = searchFlightBtn;
	}
	
	
}
