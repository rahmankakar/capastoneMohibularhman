package tek.capstone.panthers.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.panthers.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="orderLink")
	public WebElement orderLink;
	
	@FindBy(id="cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div/div/div[2]/form/div/div[1]/div/div/select")
	public WebElement cancelNote;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement orderCancelBtn;
	
	@FindBy(id="orderLink")
    public WebElement orderbtn;

    @FindBy(xpath="/html/body/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div[1]/div[2]/div[1]/p[1]")
    public WebElement firstOrder;

    @FindBy(id="returnBtn")
    public WebElement returnBtn;

    @FindBy(id="reasonInput")
    public WebElement returnRes;

    @FindBy(id="dropOffInput")
    public WebElement dropSer;

    @FindBy(id="orderSubmitBtn")
    public WebElement returnOrderBtn;
	
	
}
