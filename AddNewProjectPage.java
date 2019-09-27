package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage {
	@FindBy(name="customerId")
	private WebElement customerDropdown;
@FindBy(name="name")
private WebElement projectNameTextField;
@FindBy(name="createProjectSubmit")
private WebElement createProjectSubmit;
public AddNewProjectPage()
{
	PageFactory.initElements(BaseClass.driver, this);
}
public void selectCustomerNameFromDropdown(int customerName)
{
	Select s1=new Select(customerDropdown);
	s1.selectByIndex(customerName);
}
public void enterProjectNameinProjectNameTextField(String projectName)
{
	projectNameTextField.sendKeys(projectName);
}
public void clickOnCreateProjectButton()
{
	createProjectSubmit.click();
}
}
