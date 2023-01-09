package org.stepdefinition;

import org.Base.BaseClass;
import org.Base.BistobitesPojo;

import cucumber.api.java.en.When;

public class S6OurStory extends BaseClass{
	
	BistobitesPojo b;
	
	@When("To click the Our story option")
	public void to_click_the_Our_story_option() {
	   b = new BistobitesPojo();
	   ClickBtn(b.getOurstoryclk());
	}

	@When("To Scroll to down")
	public void to_Scroll_to_down() {
		   b = new BistobitesPojo();
		   scrollThePage(b.getViewstory());
	}



}
