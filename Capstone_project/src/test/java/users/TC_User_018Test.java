package users;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.UsersPage;
/***
 * 
 * @author Rahul
 *
 */
public class TC_User_018Test extends Base_Class {
    @Test
	public void bulkInvitation() {
    	homePage.getUsersModuleLink().click();
    	UsersPage userPage = new UsersPage(driver);
    	userPage.getBulkInvitation().click();
    	userPage.fillTheBulkInvitationForm();
    	userPage.getSendBulkInvitationButton().click();
    	userPage.getCloseButtonInBulkInvitation().click();
    	
		
		
		
		
		
	}
}
