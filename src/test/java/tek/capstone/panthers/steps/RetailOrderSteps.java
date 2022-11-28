package tek.capstone.panthers.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.capstone.panthers.pages.POMFactory;
import tek.capstone.panthers.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
  
	POMFactory factory = new POMFactory();
	
	
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
		logger.info("User click on Orders section");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("User click on Cancel The Order button");
		
	}
	 
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderPage().cancelNote, reason);
		logger.info("User select the cancelation Reason");
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().orderCancelBtn);
		logger.info("User click on Cancel Order button");
	}
	
	
	@Then("a cancelation message should be displayed Your Order Has Been Cancelled")
	public void aCancelationMessageDisplyed() {
		logger.info("a cancelation message has been displayed");
			
		
	}
	
	}
	
