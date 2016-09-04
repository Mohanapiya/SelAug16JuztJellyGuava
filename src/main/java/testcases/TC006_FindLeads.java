package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC006_FindLeads extends OpentapsWrappers {
	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName=browser;
		testCaseName="TC006_FindLeads";
		testDescription="Find Leads by entering Phone Number";
		category=" ";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void findLead(String firstName,String phoneNumber,String className,String textToVerify){
		new LoginPage(driver, test)
		.clickLogin();
		new HomePage(driver,test)
		.clickCRMSFA()
		.clickLeads();
		new FindLeadsPage(driver,test)
		.enterFirstName(firstName)
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNumber)
		.clickFirstResultingLead()
		.verifyTextContainsByClass(className, textToVerify);
	}

	
	
	
}
