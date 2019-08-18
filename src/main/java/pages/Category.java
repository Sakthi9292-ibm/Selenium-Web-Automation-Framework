package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category {

	@FindBy(xpath = "//a[contains(@class,'contributorNameID')]")
	WebElement AuthorName;

	@FindBy(xpath = "(//img[@class='s-image'])")
	WebElement selectFirstResult;

	@FindBy(xpath = "(//i[contains(@class,'radio')])[1]")
	WebElement ChooseBuyUsed;

	@FindBy(xpath = "(//i[contains(@class,'radio')])[2]")
	WebElement ChooseBuyNew;

	@FindBy(xpath = "//span[contains(@class,'a-size-medium header-price')]")
	WebElement UsedPrice;
	
	@FindBy(xpath = "(//span[contains(@class,'a-size-medium header-price')])[2]")
	WebElement NewPrice;

	@FindBy(xpath = "(//span[contains(@class,'a-color-success')])[1]")
	WebElement UsedStock;
	
	@FindBy(xpath = "(//span[contains(@class,'a-color-success')])[2]")
	WebElement NewStock;

	@FindBy(xpath = "//a[@target='AmazonHelp']")
	WebElement usedShipping;
	
	@FindBy(id="mediaTab_heading_0")
	WebElement ChooseKindle;

	@FindBy(id="mediaTab_heading_2")
	WebElement ChooseOtherSeller;

	@FindBy(xpath="//span[contains(@class,'a-color-price header-price')]")
	WebElement KindlePrice;
	
	WebDriver driver;

	public Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public Category BooksSearchResult(int result) {

		WebElement element = driver.findElement(By.xpath("(//img[@class='s-image'])[" + result + "]"));

		WebElement title = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[" + result + "]"));

		System.out.println("Selected the Result No. " + result + " with the title " + title.getText());

		element.click();

		return new Category(driver);
	}

	public Category getBookAuthorName() {

		System.out.println("Author Name -->" + AuthorName.getText());

		return new Category(driver);
	}

	public Category BuyBook(String UsedOrNew) {

		try {
			if (UsedOrNew == "Used") {

				ChooseBuyUsed.click();
			} else {

				ChooseBuyNew.click();
			}
		} catch (Exception e) {

			System.out.println("unhandled format type");

			//e.printStackTrace();
		}

		return new Category(driver);
	}

	public Category getBookUsedPrice() {

		try {
			System.out.println("Used Price -->" + UsedPrice.getText());
		} catch (Exception e) {
			
			System.out.println("unhandled format type");
		}

		return new Category(driver);
	}

	public Category getNewBookPrice() {

		try {
			System.out.println("New Price -->" + NewPrice.getText());
		} catch (Exception e) {
			
			System.out.println("unhandled format type");
		}

		return new Category(driver);
	}

	public Category getBookUsedStockStatus() {

		try {
			System.out.println("Used Stock Status -->" + UsedStock.getText());
		} catch (Exception e) {
			
			System.out.println("unhandled format type");
		}

		return new Category(driver);
	}

	public Category getNewBookStockStatus() {

		try {
			System.out.println("New Stock Status -->" + NewStock.getText());
		} catch (Exception e) {
			
			System.out.println("unhandled format type");
		}

		return new Category(driver);
	}

	public Category getBookShippingDetails() {

		try {
			System.out.println("Used Shipping Charges -->" + usedShipping.getText());
		} catch (Exception e) {
			
			System.out.println("unhandled format type");
		}

		return new Category(driver);
	}
	
	
	public Category ChooseKindleBook() {
		
		ChooseKindle.click();
			
		
		return new Category(driver);
		
	}
	
	
	public Category getKindlePrice() {
		
		System.out.println(KindlePrice.getText());
		
		return new Category(driver);
	
	
	}

	public void CloseBrowser() {

		try {
			driver.close();
		} catch (Exception e) {

			System.out.println("unhandled format type");
		}

	}
}
