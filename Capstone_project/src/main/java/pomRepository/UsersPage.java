package pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericLibrary.ExcelUtil;

public class UsersPage {
   public WebDriver driver;	
   ExcelUtil eutil = new ExcelUtil();

	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='New User']") private WebElement newUserButton;
	@FindBy(id="createUserPanel_firstNameField") private WebElement firstNameTextfield;
	@FindBy(id="createUserPanel_middleNameField") private WebElement middleNameTextfield;
	@FindBy(id="createUserPanel_lastNameField") private WebElement lastNameTextfield;
	@FindBy(id="createUserPanel_emailField") private WebElement emailTextfield;
	@FindBy(xpath="(//div[text()='-- department not assigned --'])[1]") private WebElement departmentDropdown;
	@FindBy(xpath="//div[text()='       Department     ']/../..//div[text()='Production']") private WebElement productionOption;
	@FindBy(xpath="//div[text()='Save & Send Invitation']") private WebElement saveAndSendInvitation;
	@FindBy(xpath="//div[contains(text(),'Account for ')]") private WebElement accountCreatedGetText;
	@FindBy(xpath="//span[text()='Close']") private WebElement closeButton;
	@FindBy(xpath="//div[text()='Bulk Invitations']") private WebElement bulkInvitation;
	@FindBy(xpath="(//div[contains(text(),'Please enter user')]/../..//input[@placeholder='First Name'])[1]")
	private WebElement firstFirstNameTextFieldInBulkInvitationPage;
	@FindBy(xpath="(//div[contains(text(),'Please enter user')]/../..//input[@placeholder='Last Name'])[1]") private WebElement firstlastNameTextFieldInBulkInvitationPage;
	@FindBy(xpath="(//div[contains(text(),'Please enter user')]/../..//input[@placeholder='Email'])[1]") private WebElement firstemailTextFieldInBulkInvitation;
	@FindBy(xpath="(//div[contains(text(),'Please enter user')]/../..//input[@placeholder='First Name'])[2]")
	private WebElement secondFirstNameTextFieldInBulkInvitationPage;
	@FindBy(xpath="(//div[contains(text(),'Please enter user')]/../..//input[@placeholder='Last Name'])[2]") private WebElement secondlastNameTextFieldInBulkInvitationPage;
	@FindBy(xpath="(//div[contains(text(),'Please enter user')]/../..//input[@placeholder='Email'])[2]") private WebElement secondemailTextFieldInBulkInvitation;
	@FindBy(xpath="//span[text()='Send Invitations']") private WebElement sendBulkInvitationButton;
	@FindBy(xpath="//span[text()='Invite more users']/../..//span[text()='Close']") private WebElement closeButtonInBulkInvitation;
	

	public WebElement getCloseButtonInBulkInvitation() {
		return closeButtonInBulkInvitation;
	}

	public void setCloseButtonInBulkInvitation(WebElement closeButtonInBulkInvitation) {
		this.closeButtonInBulkInvitation = closeButtonInBulkInvitation;
	}

	public WebElement getBulkInvitation() {
		return bulkInvitation;
	}

	public WebElement getFirstFirstNameTextFieldInBulkInvitationPage() {
		return firstFirstNameTextFieldInBulkInvitationPage;
	}

	public WebElement getFirstlastNameTextFieldInBulkInvitationPage() {
		return firstlastNameTextFieldInBulkInvitationPage;
	}

	public WebElement getFirstemailTextFieldInBulkInvitation() {
		return firstemailTextFieldInBulkInvitation;
	}

	public WebElement getSecondFirstNameTextFieldInBulkInvitationPage() {
		return secondFirstNameTextFieldInBulkInvitationPage;
	}

	public WebElement getSecondlastNameTextFieldInBulkInvitationPage() {
		return secondlastNameTextFieldInBulkInvitationPage;
	}

	public WebElement getSecondemailTextFieldInBulkInvitation() {
		return secondemailTextFieldInBulkInvitation;
	}

	public WebElement getSendBulkInvitationButton() {
		return sendBulkInvitationButton;
	}

	public WebElement getNewUserButton() {
		return newUserButton;
	}
	
	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}



	public WebElement getMiddleNameTextfield() {
		return middleNameTextfield;
	}



	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}



	public WebElement getEmailTextfield() {
		return emailTextfield;
	}



	public WebElement getDepartmentDropdown() {
		return departmentDropdown;
	}



	public WebElement getProductionOption() {
		return productionOption;
	}



	public WebElement getSaveAndSendInvitation() {
		return saveAndSendInvitation;
	}

	public WebElement getAccountCreatedGetText() {
		return accountCreatedGetText;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}
	
	public void clickOnNewUserButton() {
		newUserButton.click();
	}
	
	public void fillTheForm(WebDriver driver) {
		   WebDriverWait waitFirstName = new WebDriverWait(driver, 10);
	        waitFirstName.until(ExpectedConditions.elementToBeClickable(firstNameTextfield));
	        firstNameTextfield.sendKeys(eutil.readStringDataFromExcel("Sheet1", 2, 0));
	        
	        WebDriverWait waitLastName = new WebDriverWait(driver, 10);
	        waitLastName.until(ExpectedConditions.elementToBeClickable(middleNameTextfield));
	        middleNameTextfield.sendKeys(eutil.readStringDataFromExcel("Sheet1", 2, 1));
	        
	        WebDriverWait waitMiddleName = new WebDriverWait(driver, 10);
	        waitMiddleName.until(ExpectedConditions.elementToBeClickable(lastNameTextfield));
	        lastNameTextfield.sendKeys(eutil.readStringDataFromExcel("Sheet1", 2, 2));
	        
	        WebDriverWait waitEmail = new WebDriverWait(driver, 10);
	       
	        waitEmail.until(ExpectedConditions.elementToBeClickable(emailTextfield));
	        emailTextfield.sendKeys(eutil.readStringDataFromExcel("Sheet1", 2, 3));
	        
	       
	        WebElement department = driver.findElement(By.xpath("(//div[text()='-- department not assigned --'])[1]"));
            departmentDropdown.click();
	        productionOption.click();
	        driver.findElement(By.xpath("//div[text()='       Department     ']/../..//div[text()='Production']")).click();
	        driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	        saveAndSendInvitation.click();
	}
	
	public void fillTheBulkInvitationForm() {
		firstFirstNameTextFieldInBulkInvitationPage.sendKeys(eutil.readStringDataFromExcel("Sheet1", 1, 0));
		firstlastNameTextFieldInBulkInvitationPage.sendKeys(eutil.readStringDataFromExcel("Sheet1", 1, 1));
		firstemailTextFieldInBulkInvitation.sendKeys(eutil.readStringDataFromExcel("Sheet1", 1, 2));
		secondFirstNameTextFieldInBulkInvitationPage.sendKeys(eutil.readStringDataFromExcel("Sheet1", 1, 3));
		secondlastNameTextFieldInBulkInvitationPage.sendKeys(eutil.readStringDataFromExcel("Sheet1", 1, 4));
		secondemailTextFieldInBulkInvitation.sendKeys(eutil.readStringDataFromExcel("Sheet1", 1, 5));
		sendBulkInvitationButton.click();
	}



	


	
	
}	
	