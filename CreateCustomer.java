
	package framework;

	import org.testng.annotations.Test;

	public class CreateCustomer{
	@Test
	public void testCreateCustomer()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectAndCustomerLink();
		
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
	    //apcp.clickOnAddNewCustomerButton();
		
		AddNewCustomerPage ancp=new AddNewCustomerPage();
		ancp.enterCustomerNameInCustomerNameTextField("qsphydjandp");
		ancp.clickOnCreateCustomerButton();
		
		String s=apcp.retriveSuccessMessage();
		System.out.println(s);
	}
	}



