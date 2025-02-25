package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adminscenarios.Adminhome;
import adminscenarios.Blogdashboard;
import adminscenarios.Blogmenu;
import adminscenarios.Categoriesmenu;
import adminscenarios.Editpost;
import adminscenarios.Tagsmenu;
import adminscenarios.logincase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Caseexecutor {
	WebDriver driver;
	String psname="Ethnic wears";
	String psupdtname="indian ethnic wears";
	String cname="Metal Accesories";
	String tname="Trendy";
	
	 @BeforeClass
		public void setup() {
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://crazystylezs.com/admin");	
			driver.manage().window().maximize();
		}
//	 @Test
//	 public void menusection() throws InterruptedException {
//		 Mousehoverscenario menusec = new Mousehoverscenario(driver);
//		 menusec.womenmenusectiona();
//		 menusec.bottomwearmenusectiona();
//		 menusec.westernwearmenusectiona();
//		 menusec.maternitywearmenusectiona();
//		 menusec.womeninnerwearmenusectiona();
//		 menusec.menmenusectiona();
//		 menusec.mentradwearmenusectiona();
//		 menusec.menwestwearmenusectiona();
//		 menusec.meninnerwearmenusectiona();
//		 menusec.womenaccmenusectiona();
//		 menusec.menaccmenusectiona();
//		 menusec.ecaccmenusectiona();
//	 }
	
	 
	 @Test(priority=0)
	 public void Loginpage(){
		 logincase lc= new logincase(driver);
		 lc.loginscenario("botble","159357");
	 }
	 @Test(priority=1)
	 public void Popclose() throws InterruptedException{
		 Adminhome pc= new Adminhome(driver);
		 pc.popupbtn();
	 }
	 @Test(priority=4)//(enabled = false)
	 public void Blogpage() throws InterruptedException{
		 Blogmenu bc= new Blogmenu(driver);
		 bc.blogpage();
		 bc.createbtn();
	 }
	 @Test(priority=5)//(enabled = false)
	 public void Blogpostcreation() throws InterruptedException{
		 Blogmenu blogpost= new Blogmenu(driver);
		 blogpost.Createpost(psname, "The rise of gender-neutral fashion is altering our perceptions of clothing.",tname);
	 }
	 @Test(priority=6)//(enabled = false)
	 public void Blogpostdashboard() throws InterruptedException{
		 Blogdashboard postdsbd= new Blogdashboard(driver);
		 postdsbd.postdashboard(psname);
		 postdsbd.exportpost();
		 postdsbd.Bulkfilterpost(psupdtname);
		 postdsbd.Filterpost(psupdtname);
		 
	 }
	 @Test(priority=7)//(enabled = false)
	 public void Blogpostedit() {
		 Editpost edpost= new Editpost(driver);
		 edpost.Editexstpost();
	 }
	 @Test(priority=2)//(enabled = false)
	 public void Categoriespage() {
		 Categoriesmenu cm= new Categoriesmenu(driver);
		 cm.Categorypage(cname,"Metal accesories are the high selling product in website with exclusive offer");
	 }
	 @Test(priority=3)
	 public void Tagspage() {
		 Tagsmenu Tm= new Tagsmenu(driver);
		 Tm.createtag(tname,"New trendy tag for brand new products..");
		 
	 }
	 
}
