package adminscenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Blogdashboard extends BasePage{

	public Blogdashboard(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement searchopt;
	@FindBy(linkText ="Ethnic wears")
	WebElement searchdata;
	@FindBy(xpath="//button[@class='btn btn-secondary buttons-collection dropdown-toggle buttons-export']")
	WebElement exportopt;
	@FindBy(xpath="//a[@class='dt-button dropdown-item buttons-csv']")
	WebElement csvexportopt;
	@FindBy(xpath="//a[@class='dt-button dropdown-item buttons-excel']")
	WebElement excelexportopt;
	@FindBy(xpath="//*[@id=\'botble-blog-tables-post-table_wrapper\']/div[2]/div/div[1]")
	WebElement afterexport;
	@FindBy(xpath="//*[@id=\'botble-blog-tables-post-table\']/tbody/tr[1]/td[1]/div/div/input")
	WebElement tablecheckbox1;
	@FindBy(xpath="//*[@id=\'main\']/div[1]/div[2]/div[1]/div/div/div/a")
	WebElement bulkactbtn;
	@FindBy(xpath="//a[normalize-space()='Bulk changes']")
	WebElement bulkchangebtn;
	@FindBy(xpath="//a[normalize-space()='Name']")
	WebElement namechangeopt;
	@FindBy(xpath="//input[@name='value']")
	WebElement namechangefield;
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement changesubbtn;
	@FindBy(xpath="//button[normalize-space()='Filters']")
	WebElement filterbtn;
	@FindBy(xpath="//*[@id=\'main\']/div[1]/div[1]/div/form/div[1]/div/div[1]/select")
	WebElement selectflterbtn;
	@FindBy(xpath="//*[@id=\'main\']/div[1]/div[1]/div/form/div[1]/div/span[1]/input")
	WebElement selectvalue;
	@FindBy(xpath="//*[@id=\'main\']/div[1]/div[1]/div/form/div[2]/button")
	WebElement applybtn;
	@FindBy(xpath="//*[@id=\'main\']/div[1]/div[1]/div/form/div[2]/a[2]")
	WebElement resetbtn;
	
	public void postdashboard(String psname) {
	       searchopt.sendKeys(psname);
	       if(searchdata.getText().equals(psname)) {
	    	   System.out.println("Text matches: "+psname);
	       }
	       else {
	    	   System.out.println("Text does not match. Expected: " + psname + ", Found: " + searchdata.getText());
	       }
		}
	public void exportpost() {
		exportopt.click();
		csvexportopt.click();
		excelexportopt.click();
		afterexport.click();
	}
	public void Bulkfilterpost(String updname) throws InterruptedException {
		tablecheckbox1.click();
		bulkactbtn.click();
		Actions action = new Actions(driver);
		WebElement bulkchngbtn = wait.until(ExpectedConditions.visibilityOf(bulkchangebtn));
		action.moveToElement(bulkchngbtn).perform();
		namechangeopt.click();
		namechangefield.sendKeys(updname);
		Thread.sleep(2000);
		changesubbtn.click();
	}
	public void Filterpost(String updname) throws InterruptedException {
		filterbtn.click();
		selectflterbtn.click();
		Select select = new Select(selectflterbtn);
		select.selectByValue("name");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(selectvalue)).clear();
		wait.until(ExpectedConditions.visibilityOf(selectvalue)).sendKeys(updname);     
		Thread.sleep(2000);
		applybtn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(resetbtn)).click();
		searchopt.click();
		searchopt.clear();
		searchopt.click();
	}

}
