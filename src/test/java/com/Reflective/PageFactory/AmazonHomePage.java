package com.Reflective.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchBtn;
	
	@FindBy(xpath="(//*[text()='A Brief History of Everyone Who Ever Lived'])[1]")
	private WebElement bookName;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement buyNowBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getBookName() {
		return bookName;
	}

	public WebElement getBuyNowBtn() {
		return buyNowBtn;
	}
	
	

}

