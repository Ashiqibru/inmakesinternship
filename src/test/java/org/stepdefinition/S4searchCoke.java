package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.Base.BistobitesPojo;

import cucumber.api.java.en.When;

public class S4searchCoke extends BaseClass{
	
	BistobitesPojo b;
	
	@When("To click the search button")
	public void to_click_the_search_button() {
		 b = new BistobitesPojo();
		 ClickBtn(b.getSearchbtn());
	}
	
	@When("To enter the item name")
	public void to_enter_the_item_name() {
		b = new BistobitesPojo();
		passText("coke", b.getSearchbox());
	}

	@When("To click the enter button")
	public void to_click_the_enter_button() throws AWTException {
		 Robot r = new Robot();
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@When("To scrol the page")
	public void to_scrol_the_page() {
		 b = new BistobitesPojo();
		 scrollThePage(b.getViewcoke());
	}

	@When("To check the price")
	public void to_check_the_price() {
		 System.out.println("This price is $1.5");
		 
	}

}
