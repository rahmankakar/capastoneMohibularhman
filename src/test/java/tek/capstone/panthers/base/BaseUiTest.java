package tek.capstone.panthers.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.panthers.utilities.CommonUtility;

public class BaseUiTest extends CommonUtility {

	@Before
	public void setupTests() {
		super.setupBrowser();
	}

	@After
	public void closeTests(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenShot = takeScreenShotAsBytes();
			scenario.attach(screenShot, "iamge/png", scenario.getName() + " scenario Failed");
		}
		//super.quitBrowser();
	}

}
