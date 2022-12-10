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
	@And("User click on first order in list")
    public void UserClickOnFirstOrderInList() {
        click(factory.orderPage().firstOrder);
        logger.info("User click on first order in list");

    }

    @And("User click on Return Items button")
    public void UserClickOnReturnItemsButton() {
        click(factory.orderPage().returnBtn);
        logger.info("User click on Return Items button");
    }

    @And("User select the Return Reason {string}")
     public void UserSelectOnReturnItemButton(String res) {
        selectByVisibleText(factory.orderPage().returnRes, res);
        logger.info("User select the Return Reason");

 

    }

    @And("User select the drop off service {string}")
    public void UserSelectTheDropOffService(String fed) {
        selectByVisibleText(factory.orderPage().dropSer, fed);
        logger.info("User select the drop off service");

    }

    @And("User click on Return Order button")
    public void UserClickOnRetuntOrderButton() {
        click(factory.orderPage().returnOrderBtn);
        logger.info("User click on Return Order button");
    }


    @Then("Then a cancelation message should be displayed Return was successful")
    public void thenACancelationMessageShouldBeDisplayed() {
        logger.info("Then a cancelation message should be displayed 'Return was successful'");
    }
    
	}
	
