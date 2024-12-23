package testScenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Mousehoverscenario extends BasePage{
	public Mousehoverscenario(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath="//div[contains(@class,'main-menu main-menu-padding-1 main-menu-lh-2 d-none d-lg-block font-heading')]//a[normalize-space()='Product']")
	WebElement Productmenu;
	
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[5]/a")
	WebElement Accessoriesmenu;
	
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[6]/a")
	WebElement EAccessoriesmenu;
	
// women category menu section
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Women']")
	WebElement womensubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Traditional Wear']")
	WebElement womensub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Lehanga Choli']")
	WebElement womensub1amenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Maxi Dress']")
	WebElement womensub1bmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sarees']")
	WebElement womensub1cmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Ethnic Wear']")
	WebElement womensub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Kurtas And Salwar']")
	WebElement womensub2amenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Dress Materials']")
	WebElement womensub2bmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Tops and Tunics']")
	WebElement womensub2cmenu;
	
	//Bottomwear 
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Bottom Wear']")
	WebElement bottomwearsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Leggins']")
	WebElement bottomwearsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Jeans']")
	WebElement bottomwearsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Skirts']")
	WebElement bottomwearsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Track Pants']")
	WebElement bottomwearsub4menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Palazzo']")
	WebElement bottomwearsub5menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Shorts']")
	WebElement bottomwearsub6menu;
	
	//westernwear
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Western Wear']")
	WebElement westernwearsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Jumpsuits']")
	WebElement westernwearsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Shrugs and Jackets']")
	WebElement westernwearsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Dress - One Piece']")
	WebElement westernwearsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='T-shirts and Tops']")
	WebElement westernwearsub4menu;
	
	//maternitywear
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Maternity Wear']")
	WebElement maternitywearsubmenu;
	
	//womeninnerwear
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[4]/ul/li[5]/a")
	WebElement womeninnerwearsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Bra']")
	WebElement womeninnerwearsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sleepwear']")
	WebElement womeninnerwearsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Thermals and Camisoles']")
	WebElement womeninnerwearsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Briefs']")
	WebElement womeninnerwearsub4menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sports Wear']")
	WebElement womeninnerwearsub5menu;
	
	//mens wear
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[4]/ul/li[6]/a")
	WebElement menswearsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Top Wear']")
	WebElement mensub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Formal & Casual shirt']")
	WebElement mensub1amenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men T-shirt']")
	WebElement mensub1bmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Suits']")
	WebElement mensub1cmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Trendywear']")
	WebElement mensub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Blazzers and Coats']")
	WebElement mensub2amenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Hoodies']")
	WebElement mensub2bmenu;
	
	//menstraditionawear
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Men Traditional Wear']")
	WebElement mentwsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Kurtas and Sherwanis']")
	WebElement mentwsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Vesti and Dhotis']")
	WebElement mentwsub2menu;
	
	//menswesternwear
	
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Men Western Wear']")
	WebElement menwwsubmenu;
	
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[4]/ul/li[8]/ul/li[1]/a")
	WebElement menwwsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Jeans']")
	WebElement menwwsub1amenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Trousers']")
	WebElement menwwsub1bmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Sport Wear']")
	WebElement menwwsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Shorts']")
	WebElement menwwsub2amenu;
	
	//mensinnerwear
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Men Inners']")
	WebElement meniwsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Vest']")
	WebElement meniwsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Sleepwear']")
	WebElement meniwsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Briefs']")
	WebElement meniwsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Swimwear']")
	WebElement meniwsub4menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Sportswear']")
	WebElement meniwsub5menu;
	
	//accessories
	@FindBy(xpath="//ul[@class='sub-menu']//a[normalize-space()='Women Accessories']")
	WebElement womacsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Footwear']")
	WebElement womacsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sports Accessories']")
	WebElement womacsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Makeup']")
	WebElement womacsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Skincare']")
	WebElement womacsub4menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Lipsticks and Lip Gloss']")
	WebElement womacsub5menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Frangances']")
	WebElement womacsub6menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Gadgets']")
	WebElement womacsub7menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Travel and Casual Bags']")
	WebElement womacsub8menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Handbags and Wallets']")
	WebElement womacsub9menu;
	
	//menaccesories
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[5]/ul/li[2]/a")
	WebElement menacsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Wallets']")
	WebElement menacsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Belts']")
	WebElement menacsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Ties, Cufflinks & Pocket Squares']")
	WebElement menacsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Caps & Hats']")
	WebElement menacsub4menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Mufflers, Scarves & Gloves']")
	WebElement menacsub5menu;
	
	@FindBy(xpath="/html/body/header/div[4]/div/div/div[2]/div[2]/nav/ul/li[5]/ul/li[2]/ul/li[6]/a")
	WebElement menacsub6menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Perfumes & Body Mists']")
	WebElement menacsub7menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Men Skincare']")
	WebElement menacsub8menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Rings & Wristwear']")
	WebElement menacsub9menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Sunglasses']")
	WebElement menacsub10menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Watches']")
	WebElement menacsub11menu;
	
	//electronicaccessories
	@FindBy(xpath="//ul[contains(@class,'sub-menu')]//a[normalize-space()='Electric and Appliances']")
	WebElement eacsubmenu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Electronics']")
	WebElement eacsub1menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Computer Accessories']")
	WebElement eacsub2menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Home Decor and Appliances']")
	WebElement eacsub3menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Cellphones and Tabs']")
	WebElement eacsub4menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Home and Kitchen']")
	WebElement eacsub5menu;
	
	@FindBy(xpath="//ul[@class='level-menu level-menu-modify']//a[normalize-space()='Cameras']")
	WebElement eacsub6menu;
	
	
	  public void hoverAndClick(WebElement main1, WebElement main2, WebElement main3, WebElement main4) {   
	        Actions action = new Actions(driver);
	        action.moveToElement(wait.until(ExpectedConditions.visibilityOf(main1))).perform();
	        action.moveToElement(wait.until(ExpectedConditions.visibilityOf(main2))).perform();
	        action.moveToElement(wait.until(ExpectedConditions.visibilityOf(main3))).perform();
	        wait.until(ExpectedConditions.visibilityOf(main4)).click();
	    }
	  
	  public void hoverAndClicksub(WebElement Productmenu, WebElement womensubmenu, WebElement womensub1menu) {   
	        Actions action = new Actions(driver);
	        action.moveToElement(wait.until(ExpectedConditions.visibilityOf(Productmenu))).perform();
	        action.moveToElement(wait.until(ExpectedConditions.visibilityOf(womensubmenu))).perform();
	        wait.until(ExpectedConditions.visibilityOf(womensub1menu)).click();
	    }
	
	public void womenmenusectiona() {
   
		 hoverAndClick(Productmenu, womensubmenu, womensub1menu, womensub1amenu);
		
	}
	
	public void bottomwearmenusectiona() {
  
		hoverAndClicksub(Productmenu, bottomwearsubmenu, bottomwearsub4menu);
	}
	
	public void westernwearmenusectiona() {
		   
		hoverAndClicksub(Productmenu, westernwearsubmenu, westernwearsub2menu);
	}
	
	public void maternitywearmenusectiona() {
		   
		Actions action = new Actions(driver);
		WebElement prdmenu = wait.until(ExpectedConditions.visibilityOf(Productmenu));
		action.moveToElement(prdmenu).perform();
		
		WebElement prdmsubsubamenu = wait.until(ExpectedConditions.visibilityOf(maternitywearsubmenu));
		prdmsubsubamenu.click();
		
	}
	
	public void womeninnerwearmenusectiona() {
		   
		hoverAndClicksub(Productmenu, womeninnerwearsubmenu, womeninnerwearsub2menu);
	}
	
	public void menmenusectiona() {
		   
		 hoverAndClick(Productmenu, menswearsubmenu, mensub1menu, mensub1cmenu);	
	}
	
	public void mentradwearmenusectiona() {
		   
		hoverAndClicksub(Productmenu, mentwsubmenu, mentwsub1menu);
	}
	public void menwestwearmenusectiona() {
		   
		hoverAndClick(Productmenu, menwwsubmenu, menwwsub1menu, menwwsub1bmenu);
	}
	
	public void meninnerwearmenusectiona() {
		   
		hoverAndClicksub(Productmenu, meniwsubmenu, meniwsub1menu);
	}
	
	public void womenaccmenusectiona() {
		   
		hoverAndClicksub(Accessoriesmenu, womacsubmenu, womacsub3menu);
	}
	
	public void menaccmenusectiona() {
		   
		hoverAndClicksub(Accessoriesmenu, menacsubmenu, menacsub6menu);
	}
	
	public void ecaccmenusectiona() {
		   
		hoverAndClicksub(EAccessoriesmenu, eacsubmenu, eacsub4menu);
	}
	
}
	





