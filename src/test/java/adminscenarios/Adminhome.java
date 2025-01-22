package adminscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminhome extends BasePage {
	public Adminhome(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="/html/body/div[5]/div/div/button")
	WebElement popup1;
	@FindBy(xpath="/html/body/div[9]/div/div/button")
	WebElement popup2;

	public void popupbtn() throws InterruptedException {
		Thread.sleep(2000);
		popup1.click();
		Thread.sleep(2000);
		popup2.click();
	}
}
