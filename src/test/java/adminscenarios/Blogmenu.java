package adminscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	@FindBy(xpath="//*[@data-id='2951']")
	WebElement image;
	@FindBy(xpath="//*[@id=\'rv_media_body\']/div[1]/div[1]/div[1]/footer/button")
	WebElement insertimage;
	@FindBy(xpath="//label[normalize-space()='Metal Accesories']")
	WebElement categorycheckbox;
	@FindBy(xpath="//a[@class='btn_gallery']")
	WebElement addimage;
	@FindBy(xpath="//*[@data-id='2951']")
	WebElement postimgsel;
	@FindBy(xpath="//span[@role='textbox']")
	WebElement tagname;
	@FindBy(xpath="//*[@role='option']")
	WebElement tagsugname;
	@FindBy(xpath="//*[@id=\'botble-blog-forms-post-form\']/div[2]/div[2]/div[3]/div/button[1]")
	WebElement savebtn;
	
	

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

	public void Createpost(String name,String desc,String tname) throws InterruptedException {
		postnamefield.sendKeys(name);
		postdescfield.sendKeys(desc);
		postslider.click();
		contentimage.click();
//		image.click();
		Actions actions = new Actions(driver);
		actions.doubleClick(image);
//		js.executeScript("arguments[0].scrollIntoView(true);",insertimage);
		js.executeScript("arguments[0].click();",insertimage);
		Thread.sleep(2000);
		
		WebElement category=  wait.until(ExpectedConditions.visibilityOf(categorycheckbox));
		js.executeScript("arguments[0].scrollIntoView(true);",category);
		js.executeScript("arguments[0].click();",category);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",addimage);
		js.executeScript("arguments[0].click();",postimgsel);
		Thread.sleep(2000);
		insertimage.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",tagname);
		js.executeScript("arguments[0].click();",tagname);
		tagname.sendKeys(tname);
		js.executeScript("arguments[0].scrollIntoView(true);",tagsugname);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",tagsugname);
		js.executeScript("arguments[0].click();",savebtn);
				
	} 

	
}
