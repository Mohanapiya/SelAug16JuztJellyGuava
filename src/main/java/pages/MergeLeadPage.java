package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers {
	
	public MergeLeadPage(RemoteWebDriver driver , ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead Page", "FAIL");
		}
	}
	
	public FindMergeLeadsPage clickFromLead(){
		clickByXpath(prop.getProperty("MergeLead.FromLead.Xpath"));
		switchToLastWindow();
		return new FindMergeLeadsPage(driver,test);
	}
	
	public FindMergeLeadsPage clickToLead(){
		clickByXpath(prop.getProperty("MergeLead.ToLead.Xpath"));
		switchToLastWindow();
		return new FindMergeLeadsPage(driver,test);
	}
	public MergeLeadPage mergeLead(){
		clickByLink(prop.getProperty("MergeLead.MergeButton.Link"));
		return this;
	}
	public ViewLeadPage confirmMerge(){
		acceptAlert();
		verifyTitle("View Lead | opentaps CRM");
		return new ViewLeadPage(driver, test);
	}
}
