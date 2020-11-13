package qa.com.test;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.page.Loginpage;
import com.qa.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class LoginPagetest extends TestBase {
	Loginpage LoginPage;
	TestUtil testUtil;
	public LoginPagetest() {
		super();
	}
	
	
	@Test(priority=1)
	public void clickOnSignUp()
	{
		String ParentWindowId=driver.getWindowHandle();
		LoginPage.clickOnSignUp();
		testUtil.switchtowindow(ParentWindowId);
		LoginPage.validateTitle();
		driver.close();
		//driver.getWindowHandle();
		//testUtil.navigateBack();
		//driver.navigate().back();
	}
	@Test(priority=2)
	public void clickOnPricing()
	{
		LoginPage.clickOnPricing();
		driver.getWindowHandle();
		//testUtil.navigateBack();
		//driver.navigate().back();
	}
	@Test(priority=3)
	public void clickOnFeatures()
	{
		LoginPage.clickOnFeatures();
		driver.getWindowHandle();
		//testUtil.navigateBack();
		//driver.navigate().back();
	}
	@BeforeClass
	public void setUp() {
		intialization();
		LoginPage=new Loginpage();
		testUtil= new TestUtil();
		//windowHandle = new WindowHandle();
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}


}
