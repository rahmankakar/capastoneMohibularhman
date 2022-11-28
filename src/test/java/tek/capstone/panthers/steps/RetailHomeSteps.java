package tek.capstone.panthers.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.panthers.pages.POMFactory;
import tek.capstone.panthers.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("User click on All section");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDePartementSidebar(DataTable data) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
		logger.info("above options are present in shop departement sidebar");

	}

	@When("User click on All Section")
	public void userClickOnallSection() {
		click(factory.homePage().allSection);
		logger.info("User click on All section");
	}

	@And("User on {string}")
	public void userOnDepartement(String departement) {
		click(factory.homePage().electronics);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tvAndVideo));
		Assert.assertTrue(isElementDisplayed(factory.homePage().videoGames));
		click(factory.homePage().backMainMenu);
		click(factory.homePage().computers);
		Assert.assertTrue(isElementDisplayed(factory.homePage().accessories));
		Assert.assertTrue(isElementDisplayed(factory.homePage().networking));
		click(factory.homePage().backMainMenu);
		click(factory.homePage().smartHome);
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeLighting));
		Assert.assertTrue(isElementDisplayed(factory.homePage().plugsAndOutlets));
		click(factory.homePage().backMainMenu);
		click(factory.homePage().sports);
		Assert.assertTrue(isElementDisplayed(factory.homePage().athleticColthing));
		Assert.assertTrue(isElementDisplayed(factory.homePage().exerciseAndFitness));
		click(factory.homePage().backMainMenu);
		click(factory.homePage().automative);
		Assert.assertTrue(isElementDisplayed(factory.homePage().automativeParts));
		Assert.assertTrue(isElementDisplayed(factory.homePage().motorCycle));
		click(factory.homePage().backMainMenu);
		logger.info("userOnDepartement");
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartement(DataTable data) {
		logger.info("belowOptionsArePresentInDepartement");

	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("User click on Sign in option");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.homePage().emailFeild, email);
		sendText(factory.homePage().passwordFeild, password);
		logger.info("user enterd email and password");	
	}
	
	
	@And("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
			logger.info("User should be logged in into Account");
		}
	
	@And("User change the category to {string}")
	public void userCanegeTheCatagory(String catagory) {
		selectByVisibleText(factory.homePage().changeCata, catagory);
		logger.info("User change the category");
		
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnitem(String item) {
		sendText(factory.homePage().SearchFeild, item);
		logger.info("User search for an item");
	}
	
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("User click on Search icon");
	}
	
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().kasaOutdoor);
		logger.info("User click on item");
	}
	
	
	@And("User select quantity {string}")
	public void userSelectQuantity(String qty) {
		selectByVisibleText(factory.homePage().productQty, qty);
		logger.info("User select quantity");
	}
	
	@And("User click add to Cart button")
	public void userClickOnCartButton() {
		click(factory.homePage().addToCartBtn);
		logger.info("User click add to Cart button");
	}
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChange(String icon) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartQtytwo));
		logger.info("theCartIconQuantityShouldChange");
	}
	 
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartOption);
		logger.info("User click on Cart option");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedBtn);
		logger.info("User click on Proceed to Checkout button");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClikAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addNewAddress);
		logger.info("User click Add a new address link for shipping address");
	}
	
	@And("User fill New Address Form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> addNewAddress = data.asMaps(String.class,String.class);
		   selectByVisibleText(factory.homePage().counrty, addNewAddress.get(0).get("country"));
		   sendText(factory.homePage().fullNameInput, addNewAddress.get(0).get("fullName"));
		   sendText(factory.homePage().phoneNumberInput, addNewAddress.get(0).get("phoneNumber"));
		   sendText(factory.homePage().streetInput, addNewAddress.get(0).get("streetAddress"));
		   sendText(factory.homePage().apartmentInput, addNewAddress.get(0).get("apt"));
		   sendText(factory.homePage().cityInput,addNewAddress.get(0).get("city"));
		   selectByVisibleText(factory.homePage().stateInput, addNewAddress.get(0).get("state"));
		   sendText(factory.homePage().zipCodeInput, addNewAddress.get(0).get("zipCode"));
		   logger.info("user filled new address form");
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.homePage().addressBtn);
		logger.info("User click Add Your Address button");
	}
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addPaymentBtm);
		logger.info("User click Add a credit card or Debit Card for Payment method");
	}
	
	@And("User fill debit or credit card Information")
	public void userFillDebitOrCridetCardInformation(DataTable data) {
		List<Map<String, String>> addNewPayment = data.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberInput, addNewPayment.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInput, addNewPayment.get(0).get("nameOnCard"));
		selectByVisibleText(factory.homePage().expirationMonthInput, addNewPayment.get(0).get("expirationMonth"));
		selectByVisibleText(factory.homePage().expirationYearInput, addNewPayment.get(0).get("expirationYear"));
		sendText(factory.homePage().securityCodeInput, addNewPayment.get(0).get("securityCode"));
		logger.info("user filled Debit or credit card information");
	}
	
	@And("User Click On Add Your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.homePage().paymentSubmitBtn);
		logger.info("User click on Add your card button");
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderBtn);
		logger.info("User click on Place Your Order");
	}
  
	@Then("a message should be displayed Order Placed Thanks")
	public void messageShouldBeDisplayed() {
		logger.info("a message should be displayed Order Placed Thanks");
	}

	
	@And("User change the Category to {string}")
	public void userChangeTheCataGoryTo(String catagory) {
		selectByVisibleText(factory.homePage().changeCata, catagory);
		logger.info("User change the category to electronics");
	}
	
	@And("User search for item {string}")
	public void userSearchForItem(String item) {
		sendText(factory.homePage().SearchFeild, item);
		logger.info("User search for an item");
		
	}
	
	@And("User click item")
	public void userClickItem() {
		click(factory.homePage().apexLegend);
		logger.info("User clicked on item");
	
	}

	@And("User select the quantity {string}")
	public void userSelectQuantityTo(String qty) {
		selectByVisibleText(factory.homePage().cartQtyfive, qty);
		logger.info("User select quantity");
	
	}
	
	
	}


