package adminscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logincase extends BasePage{

	public logincase(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\'emailGroup\']/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\'passwordGroup\']/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\'app\']/div/div/div[3]/div/form/button")
	WebElement loginbtn;
	
	
	public void loginscenario(String usname , String pass){
		username.sendKeys(usname);
		password.sendKeys(pass);
		loginbtn.click();
		
	}
	
}
