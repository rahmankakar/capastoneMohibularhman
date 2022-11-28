package tek.capstone.panthers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.panthers.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="accountLink")
	public WebElement accountBtn;
	
	@FindBy(id="nameInput")
	public WebElement nameOpt;
	
	@FindBy(xpath ="/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div/div[2]/div/div[1]/form/div[2]/input")
	public WebElement phoneOpt;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updateBtn;
	
	
	@FindBy(id="previousPasswordInput")
	public WebElement previousPassInput;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassword;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePassBtn;
	
	@FindBy(xpath ="/html/body/div/div[2]/div/div/div[1]/div[2]")
    public WebElement successfullyUpdate;
	
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPayMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInput;
    
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id= "expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id= "expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(id= "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[1]/img")
	public WebElement azdil;
		
//	@FindBy(xpath="//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
//	public WebElement paymentAddedText;
	
	
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement disCoverCard;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editBtn;

	@FindBy(xpath= "//button[text()='remove']")
	public WebElement removBtn;
	
	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddress;
	
	@FindBy(id ="countryDropdown")
	public WebElement counrty;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(xpath= "/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
	public WebElement phoneNumberInput;
	
	@FindBy(id="streetInput")
	public WebElement streetInput;
	
	@FindBy(id= "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id ="cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath="/html/body/div/div[3]/div[2]/div/div/form/div[5]/div[2]/div/div/select")
	public WebElement stateInput;
		
	@FindBy(xpath= "/html/body/div/div[3]/div[2]/div/div/form/div[5]/div[3]/div/input")
	public WebElement zipCodeInput;
	
	@FindBy(id= "addressBtn")
	public WebElement addressBtn;
	
	@FindBy(xpath ="//button[text()='Edit']")
	public WebElement addEditBtn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addUpdSuccessfully;
	
}



