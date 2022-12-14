package tek.capstone.panthers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.panthers.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
  
	@FindBy(id= "email")
    public WebElement emailFeild;
    
    @FindBy(id = "password")
    public WebElement passwordFeild;
    
    @FindBy(id ="loginBtn")
    public WebElement loginBtn;
    
    @FindBy(id ="newAccountBtn")
    public WebElement createNewAccountBtn;
    
    @FindBy(id="nameInput")
    public WebElement nameInput;
    
    @FindBy(id = "emailInput")
    public WebElement emailInput;
    
	@FindBy(id="passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id="signupBtn")
	public WebElement sighnUpBtn;
	
	
	
	
}
