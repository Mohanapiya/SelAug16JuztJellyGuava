package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindMergeLeadPage extends OpentapsWrappers{
	
	public FindMergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Lead Page. Look at the SnapShot", "FAIL");
		}			
	}
	
	public FindMergeLeadPage enterFistname(String data) {
		enterByName(prop.getProperty("FindMergeLead.Firstname.Name"), data);
		return this;
	}
	public FindMergeLeadPage ClickFindLeadButton() {
		clickByXpath(prop.getProperty("FindMergeLead.FindLeadButton.Xpath"));
		return this;
	}
	public FindMergeLeadPage ClickFirstResultingLead() {
		clickByXpath(prop.getProperty("FindMergeLead.FirstResultingLead.Xpath"));
		switchToParentWindow();
		return new MergeLeadPage(driver,test);
	}
	
	

	
	
	
	
}
