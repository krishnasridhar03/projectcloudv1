package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testScenarios.Mousehoverscenario;
import testScenarios.TestDataProvider;

public class Caseexecutor {
	WebDriver driver;

	 @BeforeClass
		public void setup() {
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://crazystylezs.com");	
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
	 
	 @Test(dataProvider="menuData",dataProviderClass=TestDataProvider.class)
	 
	 public void testMenuNavigation(String mainMenu,String subMenu,String subSubMenu) throws InterruptedException {
		    Thread.sleep(2000);
		    WebElement mainMenuElement = driver.findElement(By.xpath("//a[normalize-space()='" + mainMenu + "']"));
	        WebElement subMenuElement = driver.findElement(By.xpath("//a[normalize-space()='" + subMenu + "']"));
	        WebElement subSubMenuElement = driver.findElement(By.xpath("//a[normalize-space()='" + subSubMenu + "']"));
	        
	        Actions action = new Actions(driver);
	        action.moveToElement(mainMenuElement).perform();
	        Thread.sleep(2000);
	        action.moveToElement(subMenuElement).perform();
	        Thread.sleep(2000);
	        subSubMenuElement.click();
	 }
}
