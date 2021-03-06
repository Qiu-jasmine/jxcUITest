package archivesManageModule;

import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagebuilder.Browsers;
import pagebuilder.BrowsersType;
import pagebuilder.Do;
import pagebuilder.ParseProperties;
import pages.LoginHomepage3;

public class TestLoginProperties {
	private WebDriver driver;
	//private Do du;
	private ParseProperties td;
	@BeforeClass
	public void inialize() throws IOException{
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver=browser.driver;
		td = new ParseProperties(System.getProperty("user.dir")+"/data/test.properties");
		//du =new Do(driver);
		driver.manage().window().maximize();
	}
	@Test
	public void login(){
		LoginHomepage3 loginpage = new LoginHomepage3(driver); 
		loginpage.navigateToJxc(td.getValue("baseUrl"));
		loginpage.setMerchantId(td.getValue("ZMchid"));
		loginpage.setLoginName(td.getValue("ZUser"));
		loginpage.setpasswd(td.getValue("passwd"));
		loginpage.submitLogin();
		Assert.assertEquals(loginpage.getloginname().isDisplayed(), true);
	}
	/*@AfterClass
	public void releaseBrowser(){
		driver.quit();
	}*/
	
}
