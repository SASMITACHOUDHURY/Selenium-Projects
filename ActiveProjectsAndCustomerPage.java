package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomerPage {
	@FindBy(xpath="//input[@value='Add New Project']")
private WebElement addNewProjectButton;
	@FindBy(className="successmsg")
private WebElement successMessage;
	public ActiveProjectsAndCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
public void clickOnAddNewProjectButton()
{
	addNewProjectButton.click();
}
public String retriveSuccessMessage()
{
	String s=successMessage.getText();
	return s;
}
}
