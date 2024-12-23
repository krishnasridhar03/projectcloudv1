package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.MenuSelection;
import pageObjects.ProductPage;
import pageObjects.ShippingAddressPage;

public class TC_LoginTest{
	 public WebDriver driver;
	 
    @BeforeClass
	public void setup() {
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://crazystylezs.com");	
		driver.manage().window().maximize();
	}
    @AfterClass
	public void teardown() {
		driver.quit();
	} 
    @Test(priority=0)
	public void logintesttc() {
		HomePage hp = new HomePage(driver);
		hp.login("crikrish@mailinator.com", "123456");
	}
    @Test(priority=1)
    public void menusecttc() {
    	MenuSelection ms=new MenuSelection(driver);
    	ms.prdmenusection();
    	ms.prdlisting();
    	ms.prdsorting();
    	ms.productselecting();
    }
    @Test(priority=2)
    public void productpagetc() throws InterruptedException {
    	ProductPage pp=new ProductPage(driver);
    	pp.productpageopt();
    	pp.quantityopt();
    	pp.addtocartfun();
    }
    @Test(priority=3)
    public void cartpagetc() throws InterruptedException {
    	CartPage cp=new CartPage(driver);
    	cp.cartactions();
    	cp.cartpagefun();
    	cp.couponfun("abcdef");
    }
    @Test(priority=4)
    public void shipaddpage() throws InterruptedException {
    	ShippingAddressPage shpadpg = new ShippingAddressPage(driver);
    	shpadpg.checkoutpage();
    	shpadpg.addresspage("Thanos","9876543210","Tamilnadu","Ambur","Mbt","600222");
    	shpadpg.payout();
	}
    
}
