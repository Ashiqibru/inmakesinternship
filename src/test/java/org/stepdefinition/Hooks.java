package org.stepdefinition;

import org.Base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before
	public void precondition1() {
         launchBrowser();
         System.out.println("launched");
	}
	
	@Before
	public void precondition2() {
         windowMaximize();
	}
	
	@After
	public void postcondition() {
		 closeEntireBrowser();
		 System.out.println("closed");

	}
	
	

}
