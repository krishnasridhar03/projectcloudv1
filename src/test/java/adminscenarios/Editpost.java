package adminscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Editpost extends BasePage{
  public Editpost(WebDriver driver) {
	  super(driver);
  }

  @FindBy(xpath="//*[@id=\'botble-blog-tables-post-table\']/tbody/tr[1]/td[10]/div/a[1]")
  WebElement editbtn;
  @FindBy(xpath="//*[@id=\"seo_wrap\"]/div[2]/a")
  WebElement seobtn;
  @FindBy(id="seo_title")
  WebElement seotitle;
  @FindBy(xpath="//*[@id=\'botble-blog-forms-post-form\']/div[2]/div[2]/div[3]/div/button[1]")
  WebElement savebtn;
  
  public void Editexstpost() {
	  editbtn.click();
	  js.executeScript("arguments[0].scrollIntoView(true);", seobtn); 
	  js.executeScript("arguments[0].click();", seobtn);
	  seotitle.sendKeys("Indian ethnic women wear");
	  wait.until(ExpectedConditions.visibilityOf(savebtn)).click();
  }
}
