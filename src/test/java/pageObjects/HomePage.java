package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="/html/body/header/div[3]/div/div/div[2]/div[2]/div/div[4]/a[2]/span")
	WebElement myacnt;

	@FindBy(id="txt-email")
	WebElement username;

	@FindBy(id="txt-password")
	WebElement password;

	@FindBy(xpath="//button[contains(@class, 'btn-heading') and text()='Login']")
	WebElement loginbtn;

	public void login(String usname , String pswd) {
		myacnt.click();
		username.sendKeys(usname);
		password.sendKeys(pswd);
		WebElement lgnbtn = wait.until(ExpectedConditions.visibilityOf(loginbtn));
		if (lgnbtn.isDisplayed() && lgnbtn.isEnabled()) {
			js.executeScript("arguments[0].scrollIntoView(true);", lgnbtn); 
			js.executeScript("arguments[0].click();", lgnbtn);

		}
	}
}
