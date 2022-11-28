package tek.capstone.panthers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.panthers.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "signinLink")
	public WebElement signIn;

	@FindBy(id = "hamburgerBtn")
	public WebElement allSection;

	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;

	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;

	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHome;

	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sports;

	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automative;

	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement tvAndVideo;

	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGames;

	@FindBy(id = "submenuBtn")
	public WebElement backMainMenu;

	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement accessories;

	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement networking;

	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLighting;

	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlets;

	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement athleticColthing;

	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement exerciseAndFitness;

	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement automativeParts;

	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement motorCycle;

	@FindBy(id = "email")
	public WebElement emailFeild;

	@FindBy(id = "password")
	public WebElement passwordFeild;

	@FindBy(id = "loginBtn")
	public WebElement loginBtn;

	@FindBy(xpath = "//select[@id='search']")
	public WebElement changeCata;

	@FindBy(xpath = "//input[@class='search__input']")
	public WebElement SearchFeild;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutdoor;

	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select")
	public WebElement productQty;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBtn;

//	 @FindBy(id ="cartQuantity")
//	 public WebElement cartQty;

	@FindBy(xpath = "//span[text()='2']")
	public WebElement cartQtytwo;

	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cartOption;

	@FindBy(id = "proceedBtn")
	public WebElement proceedBtn;

	@FindBy(id = "addAddressBtn")
	public WebElement addNewAddress;

	@FindBy(id = "countryDropdown")
	public WebElement counrty;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;

	@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
	public WebElement phoneNumberInput;

	@FindBy(id = "streetInput")
	public WebElement streetInput;

	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/form/div[5]/div[2]/div/div/select")
	public WebElement stateInput;

	@FindBy(xpath = "/html/body/div/div[3]/div[2]/div/div/form/div[5]/div[3]/div/input")
	public WebElement zipCodeInput;

	@FindBy(id = "addressBtn")
	public WebElement addressBtn;
	
	@FindBy(xpath="//button[@class='checkout__payment-btn']")
	public WebElement addPaymentBtm;
	
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
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div/div[2]/div/button")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedText;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[1]/div[3]/div/div/img")
	public WebElement apexLegend;
	
	@FindBy(xpath = "//select[text()='5']")
	public WebElement cartQtyfive;
	
	//@FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div[1]/div[3]/div/div/select/option[5]")
	//public WebElement proQty;
	

}