package pages;

import base.BasePage;

public class HomePage extends BasePage {
	
	
	
	
	public void mouseOverNewCars() {
		
		mouseHover("newCarsMenu_XPATH");
		
	}
	
	
	public void clickFindNewCars() {
		
		click("findNewCars_XPATH");
		
	}

}
