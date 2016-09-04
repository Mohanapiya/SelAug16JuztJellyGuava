package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {
	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Find Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	
	
	
	public FindLeadsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FindLeads.FirstName.Xpath"), data);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() {
		clickByXpath(prop.getProperty("FindLeads.FindLeads.Xpath"));
		return this; 
	}
	
	public FindLeadsPage clickPhoneTab() {
		clickByXpath(prop.getProperty("FindLeads.PhoneTab.Xpath"));
		return this; 
	}
	public FindLeadsPage enterPhoneNumber(String data) {
		enterByName(prop.getProperty("FindLeads.PhoneNumber.Name"), data);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLead() {
		clickByXpath(prop.getProperty("FindLeads.FirstResultingLead.Xpath"));
		return new ViewLeadPage(driver,test); 
	}
	public FindLeadsPage verifyNoRecords(String data) {		
		verifyTextContainsByClass(prop.getProperty("Login.Error.Class"), data);		
		return this;		
	}


	
	
	
}
