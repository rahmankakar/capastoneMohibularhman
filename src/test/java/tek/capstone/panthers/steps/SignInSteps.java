package tek.capstone.panthers.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.panthers.pages.POMFactory;
import tek.capstone.panthers.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userISOnRetailWebsite() {
		logger.info("User is on retail website");
	}
	
	@When("User click on sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("User clicked on sign in option");
	}
	
    @And("User enter email{string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
    	sendText(factory.signInPage().emailFeild, email);
    	sendText(factory.signInPage().passwordFeild, password);
    	logger.info("User entered email" + email + "and password" + password);
    }
    @And("User click on login button")
    public void userClickOnLoginButton() {
    	click(factory.signInPage().loginBtn);
    	logger.info("User clicked on login button");
   		
    }
    @Then("User should be logged in into account")
    public void userShouldBeLoggedInIntoAccount() {
    	logger.info("User should be logged in into account");
    	
    }
    @And("User click on create new account button")
    public void userClickOnNewAccountButton() {
    	click(factory.signInPage().createNewAccountBtn);
    	logger.info("User clicked on create new account button");
    	
    }
    
    @And("User fill the signup information with below data")
    public void userFillTheSignUpInformationWithBelowData(DataTable data) {
    	List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
    	sendText(factory.signInPage().nameInput, signUpData.get(0).get("name"));
    	sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
    	sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
    	sendText(factory.signInPage().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
    	logger.info("User entered required data into signup form");
    	
    	
    }
    @And("User click on signup button")
    public void userClickOnSignUpButton() {
    	click(factory.signInPage().sighnUpBtn);
    	logger.info("user clicked on sign up button");
    	
    }
    @Then("User should be logged into account page")
    public void userShouldBeLoggedIntoAccountPage() {
    	logger.info("User is signed in into accuntpage");
    	
    }
   
}
