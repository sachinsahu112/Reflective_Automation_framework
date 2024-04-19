package com.Reflective.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CleartripBookFlightPage {

	@FindBy(xpath="(//*[text()='Book'])[2]")
	private WebElement bookTicketBtn;

	public WebElement getBookTicketBtn() {
		return bookTicketBtn;
	}
	
	

}
