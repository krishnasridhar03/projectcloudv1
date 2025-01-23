package adminscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categoriesmenu extends BasePage{
  public Categoriesmenu(WebDriver driver){
	  super(driver);
  }
  
  @FindBy(xpath="//*[@id=\'cms-plugins-blog-categories\']/a")
  WebElement categories;
  @FindBy(xpath="//*[@id=\'name\']")
  WebElement categoryname;
  @FindBy(id="description")
  WebElement categorydesc;
  @FindBy(xpath="//*[@id=\'botble-blog-forms-category-form\']/div[6]/div/label")
  WebElement defaultslider;
  @FindBy(id="order")
  WebElement orderno;
  @FindBy(xpath="//*[@id=\'botble-blog-forms-category-form\']/div[9]/div/label/span[2]")
  WebElement featuredslider;
  @FindBy(xpath="//*[@id=\'botble-blog-forms-category-form\']/div[13]/div[2]/div/button[1]")
  WebElement savebtn;
  
  public void Categorypage(String cname,String cdesc) {
		js.executeScript("arguments[0].click();", categories);
		categoryname.sendKeys(cname);
		categorydesc.sendKeys(cdesc);
//		defaultslider.click();
		orderno.clear();
		orderno.sendKeys("3");
		js.executeScript("arguments[0].scrollIntoView(true);",featuredslider);
		js.executeScript("arguments[0].click();",featuredslider);
		js.executeScript("arguments[0].scrollIntoView(true);",savebtn);
		js.executeScript("arguments[0].click();",savebtn);
	}
  
}
