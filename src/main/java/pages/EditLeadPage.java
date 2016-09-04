package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle(" opentaps CRM")){
			reportStep("This is not Create Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	
	public EditLeadPage selectMarketingCampaign(String id ,String data){
		selectVisibileTextById(prop.getProperty("Select.MarkCampaign.Id"),data);//addMarketingCampaignForm_marketingCampaignId
		return this;
	}
	
	public EditLeadPage clickaddMark(String add){
		clickByXpath("clickadd.Market.xpath");//(//input[@class="smallSubmit"])[3]
		return this;
	}
	
	public EditLeadPage selectSource(String id ,String data){
		selectVisibileTextById(prop.getProperty("Select.Source.Id"),data); //addDataSourceForm_dataSourceId
		return this;
	}
	
	public EditLeadPage clickaddSource(String add){
		clickByXpath("clickadd.Source.xpath");//(//input[@class="smallSubmit"])[2]
		return this;
	}
	public ViewLeadPage clickupdate(String update){
		clickByXpath("click.Update.xpath");//(//input[@class="smallSubmit"])[1]
		return new ViewLeadPage(driver,test);
	}
	
	























}
