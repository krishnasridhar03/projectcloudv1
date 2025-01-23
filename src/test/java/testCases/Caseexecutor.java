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
import adminscenarios.logincase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Caseexecutor {
	WebDriver driver;
	String psname="Ethnic wears";
	String psupdtname="indian ethnic wears";
	String cname="Metal Accesories";
	
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
	 @Test(priority=3)
	 public void Blogpage() throws InterruptedException{
		 Blogmenu bc= new Blogmenu(driver);
		 bc.blogpage();
		 bc.createbtn();
	 }
	 @Test(priority=4)
	 public void Blogpostcreation() throws InterruptedException{
		 Blogmenu blogpost= new Blogmenu(driver);
		 blogpost.Createpost(psname, "The rise of gender-neutral fashion is altering our perceptions of clothing.");
	 }
	 @Test(priority=5)
	 public void Blogpostdashboard() throws InterruptedException{
		 Blogdashboard postdsbd= new Blogdashboard(driver);
		 postdsbd.postdashboard(psname);
		 postdsbd.exportpost();
		 postdsbd.Bulkfilterpost(psupdtname);
		 postdsbd.Filterpost(psupdtname);
		 
	 }
	 @Test(priority=6)
	 public void Blogpostedit() {
		 Editpost edpost= new Editpost(driver);
		 edpost.Editexstpost();
	 }
	 @Test(priority=2)
	 public void Categoriespage() {
		 Categoriesmenu cm= new Categoriesmenu(driver);
		 cm.Categorypage(cname,"Metal accesories are the high selling product in website with exclusive offer");
	 }
	 
}
