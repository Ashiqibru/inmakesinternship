package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClass;
import org.Base.BistobitesPojo;

import cucumber.api.java.en.When;

public class S5searchOmelet extends BaseClass {
	
	BistobitesPojo b;
	
	@When("To click the search buttonn")
	public void to_click_the_search_button() {
		b = new BistobitesPojo();
		ClickBtn(b.getSearchbtn());
	}

	@When("To enter the item namee")
	public void to_enter_the_item_name() {
		b = new BistobitesPojo();
		passText("spanish omelet", b.getSearchbox());
	}

	@When("To click the enter buttonn")
	public void to_click_the_enter_button() throws AWTException {
		 Robot r = new Robot();
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@When("To scrolll the page")
	public void to_scrolll_the_page() {
		b = new BistobitesPojo();
		scrollThePage(b.getViewomelet());
	}
    
	@When("To click the item")
	public void to_click_the_item() {
		b = new BistobitesPojo();
		ClickBtn(b.getViewomelet());
	}

	@When("To scrol the pagee")
	public void to_scrol_the_pagee() {
		b = new BistobitesPojo();
		scrollThePage(b.getViewomeprice());
	}

	@When("To check the pricee")
	public void to_check_the_pricee() {
		System.out.println("the omelet price is $12.5");
		
	}


}
