package Merhaba.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homeclass {
	public static WebDriver driver=null;
	@FindBy(id="tab-flight-tab-hp")
	WebElement Flight;
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")
	WebElement From;
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")
	WebElement To;
	
	//this is github
	

	
		
	
}
