package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import adminscenarios.Adminhome;
import adminscenarios.Blogmenu;
import adminscenarios.logincase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Caseexecutor {
	WebDriver driver;
	String psname="Ethnic wears";
	
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
	 @Test(priority=2)
	 public void Blogpage() throws InterruptedException{
		 Blogmenu bc= new Blogmenu(driver);
		 bc.blogpage();
		 bc.createbtn();
	 }
	 @Test(priority=3)
	 public void Blogpostcreation() throws InterruptedException{
		 Blogmenu blogpost= new Blogmenu(driver);
		 blogpost.Createpost(psname, "The rise of gender-neutral fashion is altering our perceptions of clothing.");
	 }
	 @Test(priority=4)
	 public void Blogpostdashboard(){
		 Blogmenu postdsbd= new Blogmenu(driver);
		 postdsbd.postdashboard(psname);
	 }
}
