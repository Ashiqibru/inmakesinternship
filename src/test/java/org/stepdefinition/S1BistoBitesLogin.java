package org.stepdefinition;


import org.Base.BaseClass;
import org.Base.BistobitesPojo;

import cucumber.api.java.en.When;

public class S1BistoBitesLogin extends BaseClass{
	
	BistobitesPojo b;
	
	@When("To launch the url of the Bisto bites webpage")
	public void to_launch_the_url_of_the_Bisto_bites_webpage() {
	   launchUrl("https://bistrobitesdc.com/");
	}

	@When("To click the Account button")
	public void to_click_the_Account_button() {
	   b = new BistobitesPojo();
	   ClickBtn(b.getAccount());
	}

	@When("To scroll the page")
	public void to_scroll_the_page() throws InterruptedException {
		Thread.sleep(3000);
		b = new BistobitesPojo();
		scrollThePage(b.getLoginview());
	}

	@When("To Enter the wrong username")
	public void to_Enter_the_wrong_username() throws InterruptedException {
		Thread.sleep(3000);
		b = new BistobitesPojo();
		passText("musthaq", b.getPhonenumlog());
	}

	@When("To Enter the wrong password")
	public void to_Enter_the_wrong_password() {
		b = new BistobitesPojo();
		passText("736633", b.getPasslog());
	}

	@When("To click login button")
	public void to_click_login_button() {
		b = new BistobitesPojo();
		ClickBtn(b.getLoginbtn());
	}

	@When("check the output")
	public void check_the_output() {
	   System.out.println("invalid mobile number");
	}

}
