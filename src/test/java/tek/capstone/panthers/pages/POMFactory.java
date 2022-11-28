package tek.capstone.panthers.pages;

import tek.capstone.panthers.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage singInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	
	public POMFactory(){
		this.homePage = new RetailHomePage();
		this.singInPage = new RetailSignInPage();
		this.accountPage = new RetailAccountPage();
		this.orderPage = new RetailOrderPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.singInPage;
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
		
	}
	
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
}
