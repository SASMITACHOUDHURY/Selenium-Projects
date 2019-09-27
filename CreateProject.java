package framework;

import org.testng.annotations.Test;

public class CreateProject extends BaseClass {
@Test
public void testCreateProject()
{
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickOnProjectAndCustomerLink();
	
	ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
	apcp.clickOnAddNewProjectButton();
	
	AddNewProjectPage anpp=new AddNewProjectPage();
	anpp.selectCustomerNameFromDropdown(4);
	anpp.enterProjectNameinProjectNameTextField("Automation");
	anpp.clickOnCreateProjectButton();
	String s=apcp.retriveSuccessMessage();
	System.out.println(s);
}
}
