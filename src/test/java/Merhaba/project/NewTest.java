package Merhaba.project;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class NewTest {
	 public static WebDriver driver=null;
	
  @Test
  public void f() {
	  
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-type-roundtrip-label-flp")).click();
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]")).sendKeys("Omaha, NE (OMA-All Airports");
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).sendKeys("Dallas (DFW-All Airports)");
		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("07/18/2019");
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("07/20/2019");
	WebElement travelersdropdown= driver.findElement(By.xpath("//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized'][1]")
			);
		Select travel =new  Select (travelersdropdown);
		travel.selectByVisibleText("Adult");
		driver.findElement(By.xpath("(//button[@type='submit'])[11]")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-text flex-link'])[1]")).click();
		driver.findElement(By.xpath("(//a[@data-air-provider-id='2'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='btn-secondary btn-action t-select-btn'])[1]")).click();
		driver.findElement(By.id("forcedChoiceNoThanks")).click();
		driver.findElement(By.id("bookButton")).click();
		driver.findElement(By.id("firstname[0]")).sendKeys("mila");
		driver.findElement(By.id("lastname[0]")).sendKeys("David");
		driver.findElement(By.id("phone-number[0]")).sendKeys("5715056009");
		driver.findElement(By.id("gender_female[0]")).click();
	WebElement month_dropdown= driver.findElement(By.id("date_of_birth_month0"));
	Select month_dd=new Select(month_dropdown);
	month_dd.selectByVisibleText("May");
	WebElement date_dropdown=driver.findElement(By.id("date_of_birth_day[0]"));
	Select date =new Select(date_dropdown);
	date.selectByIndex(8);
	WebElement Year_dropdown= driver.findElement(By.id("date_of_birth_year[0]"));
	Select year=new Select(Year_dropdown);
	year.selectByIndex(1986);
    driver.findElement(By.id("no_insurance")).click();
    driver.findElement(By.name("creditCards[0].cardholder_name")).sendKeys("mila David");
   driver.findElement(By.id("creditCardInput")).sendKeys("5712485968554");
   WebElement monthe_dropdown = driver.findElement(By.name("creditCards[0].expiration_month"));
   Select monthe=new Select (monthe_dropdown);
   monthe.selectByVisibleText("Feb");
    WebElement Datee_dropdown=driver.findElement(By.name("creditCards[0].expiration_year"));
    Select datee= new Select(Datee_dropdown);
    datee.selectByIndex(2023);
    driver.findElement(By.id("new_cc_security_code")).sendKeys("356");
   driver.findElement(By.name("creditCards[0].street")).sendKeys("225 oak street");
   driver.findElement(By.name("creditCards[0].city")).sendKeys("Fairfax");
   WebElement State_dropdown=driver.findElement(By.className("billing-state-dropdown cko-field billing-state-select gb-whitelist"));
   Select state=new Select(State_dropdown);
   state.selectByVisibleText("VA");
   driver.findElement(By.className("text billing-zip-code cko-field gb-whitelist")).sendKeys("22031");
   driver.findElement(By.name("email")).sendKeys("haab@gmail.com");
   driver.findElement(By.name("password")).sendKeys("123454");
    driver.findElement(By.name("repeat_password")).sendKeys("123454");
    driver.findElement(By.id("complete-booking")).click();
  
  }
		
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.Expedia.com");
		
  }

}
