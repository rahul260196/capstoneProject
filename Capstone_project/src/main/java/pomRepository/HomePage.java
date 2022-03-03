package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="logoutLink") private WebElement logoutButton;
	
	@FindBy(id="container_users") private WebElement usersModuleLink;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getUsersModuleLink() {
		return usersModuleLink;
	}

	// Business Logic or Action methods or Behavior
	public void logout() {
		logoutButton.click();
	}
}
