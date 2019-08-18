package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
@FindBy(id="searchDropdownBox")
WebElement searchdropdown;


@FindBy(xpath ="//span[@class ='nav-text' and text()='Books']")
WebElement selectBooks;


@FindBy(id="twotabsearchtextbox")
WebElement searchtextbox;

@FindBy(xpath="//input[@class='nav-input' and @type='submit']")
WebElement Searchbutton;

WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	public Homepage openinMozilla(String Url) {
		
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);	
		return new Homepage(driver);
	}
	
	public Homepage openinIE(String Url) {
		
		System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		
		return new Homepage(driver);
	}
	
	
	public Homepage openinChrome(String Url) {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);		
		
		return new Homepage(driver);
	}
	
	
	public Homepage chooseCategorybyVisibleText(String cat) {
	
			
		Select s  = new Select(searchdropdown);
		
		s.selectByVisibleText(cat);
		
		
		
		//Actions action = new Actions(driver);
		
		//action.pause(100).moveToElement(searchdropdown).moveToElement(selectBooks).click(selectBooks).build().perform();
		
	
		return new Homepage(driver);
	}
	
	public Category QueryParameter(String data) {

		searchtextbox.clear();

		searchtextbox.sendKeys(data);

		Searchbutton.click();
		
		Select s  = new Select(searchdropdown);
		
		String cat= s.getFirstSelectedOption().getText() ;
		
		System.out.println("DropdownSelected -->"+ cat);

		
		return new Category(driver);

	}
	

}
