package testCases;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Category;
import pages.Homepage;

public class StepDefinitions {

	WebDriver driver;

	Homepage hp = new Homepage(driver);
	String search = null;
	String depart = null;
	int result = 1;
	String url=null;

	@Given("^I want to navigate to website \"(.*?)\"$")
	public void i_want_to_navigate_to_website(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		url="https://" + arg1 + "/";

	}

	@When("^I Search for \"(.*?)\" under \"(.*?)\" in Departments$")
	public void i_Search_for_under_in_Departments(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		search = arg1;
		depart = arg2;

	}

	@When("^I need to view the result number (\\d+)$")
	public void i_need_to_view_the_result_number(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		result = arg1;

	}

	@Then("^I need to see some of the details for \"(.*?)\" Books$")
	public void i_need_to_see_some_of_the_details_for_Books(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if(arg1=="Used") {
			
			hp.openinChrome(url).chooseCategorybyVisibleText(depart)
			  .QueryParameter(search)
			  .BooksSearchResult(result)
			  .BuyBook(arg1)
			  .getBookAuthorName()
			  .getBookShippingDetails()
			  .getBookUsedPrice()
			  .getBookUsedStockStatus()
			  .CloseBrowser();
			
		}else {
			hp.openinChrome(url).chooseCategorybyVisibleText(depart)
			  .QueryParameter(search)
			  .BooksSearchResult(result)
			  .BuyBook(arg1)
			  .getNewBookPrice()
			  .getNewBookStockStatus()
			  .CloseBrowser();
			
		}
	}

}