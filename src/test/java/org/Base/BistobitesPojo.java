package org.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BistobitesPojo extends BaseClass{
	
	public BistobitesPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='fa fa fa-user']")
	private WebElement Account;
	
	@FindBy(xpath = "//h2[text()='Login']")
	private WebElement loginview;
	
	@FindBy(id = "phone")
	private WebElement phonenumlog;
	
	@FindBy(name = "password")
	private WebElement passlog;
	
	@FindBy(name = "login")
	private WebElement loginbtn ;
	
	@FindBy(name = "name")
	private WebElement namereg;
	
	@FindBy(name = "email")
	private WebElement emailreg ;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement phonereg;
	
	@FindBy(xpath = "(//label[@for='password'])[2]")
	private WebElement passview;
	
	@FindBy(id = "password_reg")
	private WebElement passreg;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement registerbtn;
	
	@FindBy(xpath = "//h3[text()='Popular Items']")
	private WebElement viewpopitem;
	
	@FindBy(xpath = "//span[text()='Dosa']")
	private WebElement clkDosa;
	
	@FindBy(xpath = "//h2[text()='Masala Dosa']")
	private WebElement clkmasaDosa;
	
	@FindBy(xpath = "//h2[text()='extra topping']")
	private WebElement viewextratopp;
	
	@FindBy(xpath = "//*[@id=\"menu-item-3557\"]/a")
	private WebElement ourstoryclk;
	
	@FindBy(xpath = "//h4[text()='Every day help for our customers']")
	private WebElement viewstory;
	
	@FindBy(id = "lte-top-search-ico")
	private WebElement Searchbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement searchbox;
	
	@FindBy(xpath = "//h2[text()='Coke Can 12oz']")
	private WebElement viewcoke;
	
	@FindBy(xpath = "//h2[text()='Spanish omelet']")
	private WebElement viewomelet;
	
	@FindBy(xpath = "//h2[text()='Spanish omelet']")
	private WebElement clkomelet;
	
	@FindBy(xpath = "//h4[text()='Spanish omelet']")
	private WebElement viewomeprice;

	public WebElement getAccount() {
		return Account;
	}

	public WebElement getLoginview() {
		return loginview;
	}

	public WebElement getPhonenumlog() {
		return phonenumlog;
	}

	public WebElement getPasslog() {
		return passlog;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getNamereg() {
		return namereg;
	}

	public WebElement getEmailreg() {
		return emailreg;
	}

	public WebElement getPhonereg() {
		return phonereg;
	}

	public WebElement getPassview() {
		return passview;
	}

	public WebElement getPassreg() {
		return passreg;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}

	public WebElement getViewpopitem() {
		return viewpopitem;
	}

	public WebElement getClkDosa() {
		return clkDosa;
	}

	public WebElement getClkmasaDosa() {
		return clkmasaDosa;
	}

	public WebElement getViewextratopp() {
		return viewextratopp;
	}

	public WebElement getOurstoryclk() {
		return ourstoryclk;
	}

	public WebElement getViewstory() {
		return viewstory;
	}

	public WebElement getSearchbtn() {
		return Searchbtn;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getViewcoke() {
		return viewcoke;
	}

	public WebElement getViewomelet() {
		return viewomelet;
	}

	public WebElement getClkomelet() {
		return clkomelet;
	}

	public WebElement getViewomeprice() {
		return viewomeprice;
	}
	
	

}
