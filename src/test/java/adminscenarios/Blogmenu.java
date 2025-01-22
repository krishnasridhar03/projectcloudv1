package adminscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Blogmenu extends BasePage {
	public Blogmenu(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\'cms-plugins-blog\']/a")
	WebElement blog;
	@FindBy(xpath = "//*[@id=\'botble-blog-tables-post-table_wrapper\']/div[2]/button[1]/span/span")
	WebElement createpostbtn;
	@FindBy(xpath = "//*[@id=\'botble-blog-tables-post-table_filter\']/label/input")
	WebElement searchblog;
	@FindBy(xpath = "//*[@id=\'name\']")
	WebElement postnamefield;
	@FindBy(xpath ="//*[@id=\'description\']")
	WebElement postdescfield;
	@FindBy(xpath="//*[@id=\'tab_detail\']/div[4]/div/label/span[2]")
	WebElement postslider;
	@FindBy(xpath="//*[@id=\'tab_detail\']/div[5]/div[1]/div[2]/a")
	WebElement contentimage;
	@FindBy(xpath="//div[@title='1']")
	WebElement image;
	@FindBy(xpath="//*[@id=\'rv_media_body\']/div[1]/div[1]/div[1]/footer/button")
	WebElement insertimage;
	@FindBy(xpath="//*[@id=\'mCSB_1_container\']/ul/li[1]/label/input")
	WebElement ecommcategory;
	@FindBy(xpath="//a[@class='btn_gallery']")
	WebElement postimage;
	@FindBy(xpath="//div[@title='baby']//div[@class='rv-media-thumbnail']")
	WebElement postimgsel;
	@FindBy(xpath="//*[@id=\'botble-blog-forms-post-form\']/div[2]/div[2]/div[3]/div/button[1]")
	WebElement savebtn;
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement searchopt;
	@FindBy(linkText ="Ethnic wears")
	WebElement searchdata;

	public void blogpage() {
		js.executeScript("arguments[0].click();", blog);
		WebElement listcontainer = driver.findElement(By.id("cms-plugins-blog"));
		List<WebElement> listitems = listcontainer.findElements(By.tagName("li"));
		for (WebElement items : listitems) {
			if (items.getText().equals("Posts")) {
				items.click();
			}
			break;
		}

	}

	public void createbtn() {
		createpostbtn.click();

	}

	public void Createpost(String name,String desc) {
		postnamefield.sendKeys(name);
		postdescfield.sendKeys(desc);
		postslider.click();
		contentimage.click();
		image.click();
		wait.until(ExpectedConditions.visibilityOf(insertimage)).click();
		WebElement category=  wait.until(ExpectedConditions.visibilityOf(ecommcategory));
		js.executeScript("arguments[0].scrollIntoView(true);",category);
		js.executeScript("arguments[0].click();",category);
		js.executeScript("arguments[0].click();",postimage);
		js.executeScript("arguments[0].click();",postimgsel);
		wait.until(ExpectedConditions.visibilityOf(insertimage)).click();
		js.executeScript("arguments[0].click();",savebtn);
	} 

	public void postdashboard(String psname) {
       searchopt.sendKeys(psname);
       searchdata.equals(psname);
	}
}
