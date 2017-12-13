package archivesManageModule;

import java.io.IOException;
import pages.LoginHomepage4;
import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagebuilder.Browsers;
import pagebuilder.BrowsersType;
import pagebuilder.Do;
import pagebuilder.ParseProperties;

public class TestLoginforpage4 {
	private WebDriver driver;
//	private Do du;
	private LoginHomepage4 loginpage;
	//private ParseProperties td;
	@BeforeClass
	public void inialize() throws IOException{
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver=browser.driver;
		//td = new ParseProperties(System.getProperty("user.dir")+"/data/test.properties");
		//du =new Do(driver);
		driver.manage().window().maximize();
		loginpage = new LoginHomepage4(driver);
	}
	@Test
	public void login(){
		loginpage.navigateToJxc("http://test2.diandianwaimai.com:6030");
		loginpage.setMerchantId("10086");
		loginpage.setLoginName("admin");;
		loginpage.setpasswd("admin");
		loginpage.submitLogin();
		Assert.assertEquals(loginpage.getloginname().isDisplayed(), true);
	}
	/*@Test
	public void login(){
		LoginHomepage4 loginpage = new LoginHomepage4(driver); 
		loginpage.navigateToJxc(td.getValue("baseUrl"));
		loginpage.setMerchantId(td.getValue("ZMchid"));
		loginpage.setLoginName(td.getValue("ZUser"));
		loginpage.setpasswd(td.getValue("passwd"));
		loginpage.submitLogin();
		Assert.assertEquals(loginpage.getloginname().isDisplayed(), true);
	}*/
	/*@AfterClass
	public void releaseBrowser(){
		driver.quit();
	}*/
	
}
