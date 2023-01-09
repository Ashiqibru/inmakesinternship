package org.stepdefinition;

import org.Base.BaseClass;
import org.Base.BistobitesPojo;

import cucumber.api.java.en.When;

public class S3RegisterBisto extends BaseClass{
	
	BistobitesPojo b;
	
	@When("To Click the account button")
	public void to_Click_the_account_button() {
	    b = new BistobitesPojo();
	    ClickBtn(b.getAccount());
	}

	@When("To Scroll the page down")
	public void to_Scroll_the_page_down() {
		   b = new BistobitesPojo();
		   scrollThePage(b.getLoginview());
	}

	@When("To enter the name")
	public void to_enter_the_name() {
		   b = new BistobitesPojo();
		   passText("ashiq  ibru", b.getNamereg());
	}

	@When("To enter the phone number")
	public void to_enter_the_phone_number() {
		   b = new BistobitesPojo();
		   passText("9635462786", b.getPhonereg());
	}

	@When("To enter the email id")
	public void to_enter_the_email_id() {
		   b = new BistobitesPojo();
		   passText("ashiq@gmail.com", b.getEmailreg());
	}

	@When("To enter the password")
	public void to_enter_the_password() {
		   b = new BistobitesPojo();
		   passText("73763566", b.getPassreg());
	}
	
	@When("To Scroll the page downn")
	public void to_Scroll_the_page_downn() {
		   b = new BistobitesPojo();
		   scrollThePage(b.getPassview());
	}

	@When("To click the register button")
	public void to_click_the_register_button() {
		   b = new BistobitesPojo();
		   ClickBtn(b.getRegisterbtn());
	}

	@When("To check the pop up")
	public void to_check_the_pop_up() {
	  System.out.println("Please fill  out the  field");
	}



}
