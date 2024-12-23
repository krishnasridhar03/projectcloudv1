package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MenuSelection extends BasePage {
	public MenuSelection(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[contains(@class,'main-menu main-menu-padding-1 main-menu-lh-2 d-none d-lg-block font-heading')]//a[normalize-space()='Product']")
	WebElement productmenulink;
	@FindBy(xpath="//ul[contains(@class,'sub-menu')]//a[normalize-space()='Bottom Wear']")
	WebElement productmnct;
	@FindBy(xpath="//ul[contains(@class,'level-menu level-menu-modify')]//a[normalize-space()='Jeans']")
	WebElement productsubct;
	@FindBy(xpath="//div[@class='sort-by-cover mr-10 products_sortby']//div[@class='sort-by-product-wrap']")
	WebElement prddisplay;
	@FindBy(xpath="//a[normalize-space()='24']")
	WebElement count;
	@FindBy(xpath ="//div[@class='sort-by-cover products_sortby']//div[@class='sort-by']")
	WebElement sort1;
	@FindBy(xpath="//a[normalize-space()='Newest']")
	WebElement sort2;
	@FindBy(xpath="//a[normalize-space()='Women Solid Blue Flared Jeans']")
	WebElement prdselecting;

	public void prdmenusection() {
		Actions action = new Actions(driver);
		WebElement prdmenu = wait.until(ExpectedConditions.visibilityOf(productmenulink));
		action.moveToElement(prdmenu).perform();

		WebElement prdsubmenu = wait.until(ExpectedConditions.visibilityOf(productmnct));
		action.moveToElement(prdsubmenu).perform();

		WebElement prdmainmenu = wait.until(ExpectedConditions.visibilityOf(productsubct));
		prdmainmenu.click();

	}
	public void prdlisting() {
		WebElement prdcount =wait.until(ExpectedConditions.visibilityOf(prddisplay));
		prdcount.click();
		WebElement countnum =wait.until(ExpectedConditions.visibilityOf(count));
		countnum.click();
		
	}
	public void prdsorting() {
		
		WebElement prddsort = wait.until(ExpectedConditions.visibilityOf(sort1));
		js.executeScript("arguments[0].scrollIntoView(true);", prddsort); 
		js.executeScript("arguments[0].click();", prddsort);
		WebElement prdoptdsort = wait.until(ExpectedConditions.visibilityOf(sort2));
		js.executeScript("arguments[0].scrollIntoView(true);", prdoptdsort); 
		js.executeScript("arguments[0].click();", prdoptdsort);
	}
	public void productselecting() {
		WebElement prdlink=wait.until(ExpectedConditions.visibilityOf(prdselecting));
		js.executeScript("arguments[0].scrollIntoView(true);", prdlink);
		js.executeScript("arguments[0].click();", prdlink);
	}
}
