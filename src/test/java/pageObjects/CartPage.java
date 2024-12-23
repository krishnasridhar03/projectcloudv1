package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
	WebDriver driver;
	public CartPage(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath="//a[@href='https://crazystylezs.com/cart']//img[@alt='Cart']")
	WebElement viewcart;
	@FindBy(xpath="//*[@id=\'main-section\']/div[2]/div/form/div/div[1]/div[1]/table/tbody/tr/td[4]/div/div/input")
	WebElement cartcount;
	@FindBy(xpath="//*[@id=\'main-section\']/div[2]/div/form/div/div[1]/div[1]/table/tbody/tr/td[4]/div/div/a[1]")
	WebElement qtydcropt;
	@FindBy(xpath="//input[@placeholder='Enter Your Coupon']")
	WebElement couponfield;
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement couponapply;
	
	public void cartactions() {
		js.executeScript("arguments[0].scrollIntoView(true);", viewcart); 
		js.executeScript("arguments[0].click();", viewcart);
	}
	public void cartpagefun() {
		WebElement ctqty=cartcount;
		int currentcartvalue;
		while(true){
			String value = ctqty.getAttribute("value");
			currentcartvalue=Integer.parseInt(value);
			if(currentcartvalue<=1) {
				break;		
			}
			
			WebElement dcropt = qtydcropt;
			js.executeScript("arguments[0].scrollIntoView(true);", dcropt); 
			js.executeScript("arguments[0].click();", dcropt);
		}
		System.out.println("cart current value is "+currentcartvalue); 	
	}
	
	public void couponfun(String cpname) throws InterruptedException {
		WebElement coupon =couponfield;
		wait.until(ExpectedConditions.visibilityOf(coupon)).sendKeys(cpname);
		Thread.sleep(2000);
		WebElement cpapply = couponapply;
		js.executeScript("arguments[0].scrollIntoView(true);", cpapply); 
		js.executeScript("arguments[0].click();", cpapply);
	}

}
