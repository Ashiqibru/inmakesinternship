package org.stepdefinition;

import org.Base.BaseClass;
import org.Base.BistobitesPojo;

import cucumber.api.java.en.When;

public class S2AddDosa extends BaseClass{
	
	BistobitesPojo b;

	@When("To scroll down the page")
	public void to_scroll_down_the_page() {
	   b = new BistobitesPojo();
	   scrollThePage(b.getViewpopitem());
	}

	@When("To click the Dosa button")
	public void to_click_the_Dosa_button() {
		 b = new BistobitesPojo();
		 ClickBtn(b.getClkDosa());
	}

	@When("To click masala Dosa")
	public void to_click_masala_Dosa() throws InterruptedException {
		Thread.sleep(3000);
		 b = new BistobitesPojo();
		 ClickBtn(b.getClkmasaDosa());
	}

	@When("To scroll the page and check available time")
	public void to_scroll_the_page_and_check_available_time() {
		 b = new BistobitesPojo();
		 scrollThePage(b.getViewextratopp());
	}

}
