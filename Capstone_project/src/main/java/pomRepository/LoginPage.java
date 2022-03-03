package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import genericLibrary.ExcelUtil;


public class LoginPage {
	public ExcelUtil eutil = new ExcelUtil();
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id="username") private WebElement usernameTextField;
	
	@FindBy(name="pwd") private WebElement passwordTextField;
	
	@FindBy(id="loginButton") private WebElement loginButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business Logic or Action methods or Behavior
	public HomePage login(String username, String password) {
		
		Reporter.log("Login Page is displayed");
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		 String expectedHomePageTitle = eutil.readStringDataFromExcel("Sheet1", 0, 1);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));
	     String actualHomePageTitle = driver.getTitle();
	    
	     
	    
	     Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "HomePage is not displayed");
	     Reporter.log("Homepage is displayed",true);
		
		
		//landing Page Object
		return new HomePage(driver);
	}
	public void login1(String username, String password) {
		
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
		
	}
}
