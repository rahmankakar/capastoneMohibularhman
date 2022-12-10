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

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

//	22222222222222222222222222222222222222222222222222222222222222222222222222222222222

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountBtn);
		logger.info("User clicked on Account option");

	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().nameOpt);
		sendText(factory.accountPage().nameOpt, name);
		clearTextUsingSendKeys(factory.accountPage().phoneOpt);
		sendText(factory.accountPage().phoneOpt, phone);
		logger.info("user updated the Name and Phone");

	}

	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateBtn);
		logger.info("user clicked on update button");

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdMsg));
		String actualMessage = factory.accountPage().personalInfoUpdMsg.getText();
		String expectedMessage = "Personal Information Updated Succcessfully";
		Assert.assertEquals(expectedMessage,actualMessage);
		logger.info("user profile information should be updated");

	}

	// ###########################################################################################

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> updatePassword = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassInput, updatePassword.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, updatePassword.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassword, updatePassword.get(0).get("confirmPassword"));
		logger.info("user entered the information");

	}

	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePassBtn);
		logger.info("User clicked on change password button");

	}

	@Then("Then a message should be displayed Password Updated Successfully")
	public void aMassageShoulBeDisplayed() {
		waitTillPresence(factory.accountPage().successfullyUpdate);
		String message = "Password Updated Successfully";
		String result = getElementText(factory.accountPage().successfullyUpdate);
		Assert.assertEquals(message, result);
		logger.info("password updated successfully");
	}

	// ####################################################################################

	@And("User click on Add a payment method link")
	public void userClickOnAddAPayementMethodLink() {
		click(factory.accountPage().addPayMethod);
		logger.info("user clicked in payment method link");
	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> addPayment = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, addPayment.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, addPayment.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, addPayment.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearInput, addPayment.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput, addPayment.get(0).get("securityCode"));
		logger.info("user filled Debit or credit card information");

	}

	@And("User click on Add your card button")
	public void userClickonAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User click on Add your card button");

	}

	@Then("paymenet method should be successfully added")
	public void paymentMethodShouldBeSuccessfullyAdded() {
		logger.info("payment method has sucessfully updated");
	}

	@And("User click on card section")
	public void userClickOncartSection() {
		click(factory.accountPage().disCoverCard);
		logger.info("User clicked on card section");

	}

	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().azdil);
		click(factory.accountPage().editBtn);
		logger.info("user clicked on edit option of card section");
	}

	@And("user edit information with below data")
	public void usereditedInformationWithBelowData(DataTable data) {
		List<Map<String, String>> editPayment = data.asMaps(String.class, String.class);
		clearText(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, editPayment.get(0).get("cardNumber"));
		clearText(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, editPayment.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonthInput, editPayment.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYearInput, editPayment.get(0).get("expirationyear"));
		clearText(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, editPayment.get(0).get("securityCode"));
		logger.info("user edited Debit or credit card information");
	}

	@And("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user clicked on update your card button");

	}

	@Then("a message should be displayed Payment Method updated Successfully")
	public void amessgeShouldBeDisplyad() {
		logger.info("pyament method successflly edited");
	}

	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().azdil);
		click(factory.accountPage().removBtn);
		logger.info("user clicked on remove option");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("payment details removed");
	}

	@And("User click on Add address option")
	public void userClickonAddAdressOption() {
		click(factory.accountPage().addAddress);
		logger.info("user clicked on add address button");
	}

	@And("user fill new address form with below information")
	public void userFillNewAddresFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> addAddress = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().counrty, addAddress.get(0).get("country"));
		sendText(factory.accountPage().fullNameInput, addAddress.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberInput, addAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput, addAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentInput, addAddress.get(0).get("apt"));
		sendText(factory.accountPage().cityInput, addAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateInput, addAddress.get(0).get("state"));
		sendText(factory.accountPage().zipCodeInput, addAddress.get(0).get("zipCode"));
		logger.info("user filled new address form");

	}

	@And("User click  on Add Your Address button")
	public void userClickOnAddYourAddressButtun() {
		click(factory.accountPage().addressBtn);
		logger.info("user clicked on add your address button");
	}

	@Then("a message should be displayed Address Added Successfully")
	public void addressShouldBeAddesIntoAccount() {
		logger.info("Adress added successfully");
	}

	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addEditBtn);
		logger.info("user click on edit address option");
	}

	@And("User fill new address form with below information")
	public void userFillnewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> editAddress = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().counrty, editAddress.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, editAddress.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, editAddress.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, editAddress.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, editAddress.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, editAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateInput, editAddress.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, editAddress.get(0).get("zipCode"));
		logger.info("user filled the address form with the information");

	}

	@And("User click update Your Address button")
	public void userClickUpadteYourAdreessButton() {
		click(factory.accountPage().addressBtn);
		logger.info("user clicked on update your address button");

	}

	@Then("a message should be displayed Address Updated Successfully")
	public void aMessageShouldBeDisplayed() {
		logger.info("a massege printed successfully");
	}

}