package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage{
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//form[@method='POST']//div//div//a[@aria-label='Add To Wishlist']")
	WebElement wishlist;
	@FindBy(xpath="//div[contains(@class,'has-buy-now-button')]//a[contains(@aria-label,'Add To Compare')]")
	WebElement compare;
	@FindBy(xpath="//a[@class='qty-up']")
	WebElement qtyincropt;
	@FindBy(xpath="//input[@name='qty']")  
	WebElement qtycount;
	@FindBy(xpath="//button[normalize-space()='Add to cart']")
	WebElement addtocart;

	public void productpageopt() throws InterruptedException {
		WebElement wishopt =wishlist;
		js.executeScript("arguments[0].scrollIntoView(true);", wishopt); 
		js.executeScript("arguments[0].click();", wishopt);
		Thread.sleep(1000);
		WebElement compareopt =compare;
		js.executeScript("arguments[0].click();", compareopt);
	}
	public void quantityopt() {
		WebElement qty=qtycount;
		int currentvalue;
		while(true){
			String value = qty.getAttribute("value");
		    currentvalue=Integer.parseInt(value);
			if(currentvalue>=3) {
				break;		
			}
			
			WebElement incropt = qtyincropt;
			js.executeScript("arguments[0].scrollIntoView(true);", incropt); 
			js.executeScript("arguments[0].click();", incropt);
		}
		System.out.println("current value is "+currentvalue); 	
	
	}
	public void addtocartfun() {
		WebElement addtocartbtn=addtocart;
		js.executeScript("arguments[0].click();", addtocartbtn);
	}
}
