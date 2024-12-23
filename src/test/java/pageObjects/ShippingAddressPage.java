package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage extends BasePage{
	public ShippingAddressPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//button[normalize-space()='Proceed To Checkout']")
	WebElement checkoutbtn;
	@FindBy(xpath="//select[@name='address[address_id]']")
	WebElement addressbtn;
	@FindBy(id="address_name")
	WebElement fullname;
	@FindBy(id="address_phone")
	WebElement phonenumber;
	@FindBy(id="address_country")
	WebElement country;
	@FindBy(id="address_state")
	WebElement state;
	@FindBy(id="address_city")
	WebElement city;
	@FindBy(name="address[address]")
	WebElement addres;
	@FindBy(id="address_zip_code")
	WebElement zipcode;
    @FindBy(xpath="//button[normalize-space()='Checkout']")
    WebElement paybtn;
    @FindBy(xpath="//input[@name='success']")
    WebElement sucbtn;
    @FindBy(xpath="/html/body/div/div/div/div[2]/div[2]/a")
    WebElement succlose;
    


	public void checkoutpage() {
		WebElement checkbtn = checkoutbtn;
		js.executeScript("arguments[0].scrollIntoView(true);", checkbtn); 
		js.executeScript("arguments[0].click();", checkbtn);
	}

	public void addresspage(String fname ,String pnum,String usstt,String uscty,String usadd,String uszip) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(addressbtn));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true);", addressbtn); 
		js.executeScript("arguments[0].click();", addressbtn);
		
		Thread.sleep(2000);
		Select select = new Select(addressbtn);
		select.selectByVisibleText("Add new address...");
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(fullname)).clear();
		fullname.sendKeys(fname);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(phonenumber)).clear();
		phonenumber.sendKeys(pnum);
		
		Thread.sleep(1000);
		Select select1 = new Select(country);
		select1.selectByValue("IN");
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(state)).clear();
		state.sendKeys(usstt);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(city)).clear();
		city.sendKeys(uscty);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(addres)).clear();
		addres.sendKeys(usadd);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(zipcode)).clear();
		zipcode.sendKeys(uszip);

	}
	public void payout() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(paybtn));
		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView(true);", paybtn); 
		js.executeScript("arguments[0].click();", paybtn);
		
		wait.until(ExpectedConditions.visibilityOf(sucbtn));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", sucbtn);
		
		wait.until(ExpectedConditions.visibilityOf(succlose));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", succlose);
	}

}
