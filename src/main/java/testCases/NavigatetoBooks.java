package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;

public class NavigatetoBooks {
	
	WebDriver driver ;
	
	@Test
	public void PaperbackBooks() {
		
		
		Homepage hp = new Homepage(driver);
		
		hp.openinChrome("https://www.amazon.com/")
		  .chooseCategorybyVisibleText("Books")
		  .QueryParameter("data")
		  .BooksSearchResult(1)
		  .getBookAuthorName()
		  .BuyBook("Used")
		  .getBookShippingDetails()
		  .getBookUsedPrice()
		  .getBookUsedStockStatus()
		  .BuyBook("New")
		  .getNewBookPrice()
		  .getNewBookStockStatus()
		  .CloseBrowser();
	}
	
	//@Test
	public void Kindle() {
		
		Homepage k  = new Homepage(driver);
		
		k.openinChrome("https://www.amazon.com/")
		  .chooseCategorybyVisibleText("Books")
		  .QueryParameter("data")
		  .BooksSearchResult(1)
		  .getBookAuthorName()
		  .ChooseKindleBook()
		  .getKindlePrice()
		  .CloseBrowser();
		
		
		
	}

}
