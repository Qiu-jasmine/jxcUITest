package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnitSetPage {
	private WebDriver driver;
	
	@FindBy(xpath ="//li[text()='单位设置']")
	private WebElement unit;
	
	@FindBy(xpath ="//span[text()='新建']")
	private WebElement newUnit;
	
	@FindBy(xpath ="//span[text()='修改']")
	private WebElement modifyUnit;
	
	@FindBy(xpath ="//span[text()='删除']")
	private WebElement Unit;
	
	public UnitSetPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void newUnit(){
		newUnit.click();
	}
	public void navigateToNewUnit(String url){
		driver.get(url);
	}
//	public void testArchivesManage(){
//		//进入单位设置
//		WebElement Unit = ffwb.findElement(By.xpath(locator.getValue("Unit")));
//		Unit.click();
//		WebDriverWait wait2 = new WebDriverWait(ffwb,3);
//		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator.getValue("newUnit"))));
//		//新增单位
//		ffwb.findElement(By.xpath(locator.getValue("newUnit"))).click();
//		WebDriverWait wait1 = new WebDriverWait(ffwb,5);
//		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator.getValue("unitInfo"))));
//		
		//新增角色
		//driver.findElement(By.xpath("//*[@id='contentArea']/section/div[1]/div[1]/span")).click();
		//}
}
