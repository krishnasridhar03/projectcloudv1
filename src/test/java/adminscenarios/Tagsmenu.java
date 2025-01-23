package adminscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tagsmenu extends BasePage{
  public Tagsmenu(WebDriver driver) {
	  super(driver);
  }
  @FindBy(xpath="//*[@id=\'cms-plugins-blog-tags\']/a")
  WebElement Tags;
  @FindBy(xpath="//*[@id=\'botble-blog-tables-tag-table_wrapper\']/div[2]/button[1]")
  WebElement createtag;
  @FindBy(xpath="//input[@id='name']")
  WebElement Tagnamefield;
  @FindBy(id="description")
  WebElement Tagdescfield;
  @FindBy(xpath="//*[@id=\'botble-blog-forms-tag-form\']/div[2]/div[2]/div[1]/div[2]/div/button[1]")
  WebElement savebtn;
  
  public void createtag(String tname,String tdesc) {
	  js.executeScript("arguments[0].click();", Tags);
	  createtag.click();
	  Tagnamefield.sendKeys(tname);
	  Tagdescfield.sendKeys(tdesc);
	  savebtn.click();
  }
}
