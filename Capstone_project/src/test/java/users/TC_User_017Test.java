package users;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;
import pomRepository.UsersPage;
 /***
  * 
  * @author Rahul
  *
  */
public class TC_User_017Test extends Base_Class{
	
	
	@Test
	public void AddNewUser() throws InterruptedException { 

	homePage.getUsersModuleLink().click();
	UsersPage userPage = new UsersPage(driver);
	userPage.clickOnNewUserButton();
	userPage.fillTheForm(driver);
	String accountCreatedText = userPage.getAccountCreatedGetText().getText();
	System.out.println(accountCreatedText);
    userPage.getCloseButton().click();
   
    


	}
	
}