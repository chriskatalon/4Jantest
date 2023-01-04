package uk.capgemini.controllers

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Path
import java.nio.file.Paths


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.util.regex.Matcher
import java.util.regex.Pattern
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable


public class Quote {

	Date today = new Date()
	String todaysDate1 = today.format('MM_dd_yy')
	String nowTime1 = today.format('hhmmss')

	@Keyword
	def gotoQuote(String TC_Name){

		WebUI.switchToFrame(findTestObject('PageQuote/iframe_gotoQuote'), 30, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('Object Repository/PageQuote/button_Go To Quote'), FailureHandling.OPTIONAL)

		//WebUI.verifyElementPresent(findTestObject('Object Repository/PageQuote/validateQuoteStatus'), 30)
		//WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

		WebUI.delay(10)

		//WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

		WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

		WebUI.takeScreenshotAsCheckpoint('gotoQuote', null)

	}

	@Keyword
	def gotoOpportunity(String TC_Name){

		WebUI.click(findTestObject('Object Repository/PageQuote/input_Quote Detail_go_to_opportunity'))
		WebUI.delay(45)

		WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

		WebUI.takeScreenshotAsCheckpoint('gotoOpportunity', null)

		WebUI.waitForPageLoad(120, FailureHandling.OPTIONAL)

		String OpportunityUrl= WebUI.getUrl()
		String OpportunityId=null

		WebUI.comment(OpportunityUrl)

		Pattern pattern1 = Pattern.compile("Opportunity/(.*)/view");
		Matcher matcher = pattern1.matcher(OpportunityUrl);
		if (matcher.find()) {
			OpportunityId = matcher.group(1);
		}

		WebUI.comment(OpportunityId)



		String ContactroleUrl=null

		if(GlobalVariable.url.equals('https://cwc--uat.my.salesforce.com/')) {

			ContactroleUrl= "https://cwc--uat.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--uatsfdc.sandbox.my.salesforce.com/')) {

			ContactroleUrl= "https://cwc--uatsfdc.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}

		else if(GlobalVariable.url.equals('https://cwc--qa.my.salesforce.com/')) {

			ContactroleUrl= "https://cwc--qa.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--prep.my.salesforce.com/') ) {

			ContactroleUrl= "https://cwc--prep.my.salesforce.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qasales.sandbox.my.salesforce.com/') ) {

			ContactroleUrl= "https://cwc--qasales.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qaadmin.sandbox.my.salesforce.com/') ) {

			ContactroleUrl= "https://cwc--qaadmin.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qaom.sandbox.my.salesforce.com/') ) {

			ContactroleUrl= "https://cwc--qaom.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qacare.sandbox.my.salesforce.com/') ) {

			ContactroleUrl= "https://cwc--qacare.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}

		else if(GlobalVariable.url.equals('https://cwc--qapeac.sandbox.my.salesforce.com/') ) {

			ContactroleUrl= "https://cwc--qapeac.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/OpportunityContactRoles/view";
		}

		WebUI.navigateToUrl(ContactroleUrl)
	}


	@Keyword
	def createContactroles(String Primary_contact1, String Page_ContactRoles1, String Primary_contact2 , String Page_ContactRoles2, String TC_Name){

		WebUI.delay(20)


		/*
		 //WebUI.scrollToElement(findTestObject('PageContactRoles/Btn_ContactRoles_L'), 30, FailureHandling.OPTIONAL)
		 WebUI.scrollToPosition(870, 1070, FailureHandling.OPTIONAL)
		 WebUI.delay(30)
		 //WebUI.waitForElementVisible(findTestObject('PageContactRoles/Btn_ContactRoles_L'), 30)
		 WebUI.click(findTestObject('PageContactRoles/Btn_ContactRoles_L'))
		 */



		WebUI.waitForElementVisible(findTestObject('PageContactRoles/Btn_EditContactRoles_L'), 10)

		WebUI.click(findTestObject('PageContactRoles/Btn_EditContactRoles_L'))


		WebUI.click(findTestObject('PageContactRoles/PrimaryContact1'))

		WebUI.click(findTestObject('PageContactRoles/input_SearchContacts'))

		//WebUI.setText(findTestObject('PageContactRoles/input_SearchContacts'), Primary_contact1)

		WebUI.click(findTestObject('PageContactRoles/Select_Contact_L'))



		WebUI.click(findTestObject('PageContactRoles/PrimaryRole1'))

		WebUI.click(findTestObject('PageContactRoles/Select_Role'))

		WebUI.click(findTestObject('PageContactRoles/Select_DecisionMaker_L'))


		WebUI.click(findTestObject('PageContactRoles/PrimaryContact2'))

		WebUI.click(findTestObject('PageContactRoles/input_SearchContacts'))

		//WebUI.setText(findTestObject('PageContactRoles/input_SearchContacts'), Primary_contact2)

		WebUI.click(findTestObject('PageContactRoles/Select_Contact_L'))



		WebUI.click(findTestObject('PageContactRoles/PrimaryRole2'))

		WebUI.click(findTestObject('PageContactRoles/Select_Role'))

		WebUI.click(findTestObject('PageContactRoles/Select_Evalutor_L'))



		//Validations
		WebUI.verifyTextPresent(Page_ContactRoles1, true)
		WebUI.verifyTextPresent(Page_ContactRoles2, true)
		WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)


		WebUI.click(findTestObject('PageContactRoles/btn_Contact_save'))

		WebUI.waitForElementVisible(findTestObject('PageContactRoles/link_GoToOpportunity'), 30)

		WebUI.click(findTestObject('PageContactRoles/link_GoToOpportunity'))

		WebUI.delay(20)

		WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

		WebUI.takeScreenshotAsCheckpoint('createContactroles', null)

	}


	@Keyword
	def uploadFile(String ChooseFileupload, String TC_Name){

		String OpportunityUrl= WebUI.getUrl()
		String OpportunityId=null

		WebUI.comment(OpportunityUrl)

		Pattern pattern1 = Pattern.compile("Opportunity/(.*)/view");
		Matcher matcher = pattern1.matcher(OpportunityUrl);
		if (matcher.find()) {
			OpportunityId = matcher.group(1);
		}

		WebUI.comment(OpportunityId)

		String AttachmentsUrl=null

		if(GlobalVariable.url.equals('https://cwc--uat.my.salesforce.com/')) {

			AttachmentsUrl= "https://cwc--uat.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--uatsfdc.sandbox.my.salesforce.com/')) {

			AttachmentsUrl= "https://cwc--uatsfdc.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qa.my.salesforce.com/')) {

			AttachmentsUrl= "https://cwc--qa.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--prep.my.salesforce.com/') ) {

			AttachmentsUrl= "https://cwc--prep.my.salesforce.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qasales.sandbox.my.salesforce.com/') ) {

			AttachmentsUrl= "https://cwc--qasales.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qaadmin.sandbox.my.salesforce.com/') ) {

			AttachmentsUrl= "https://cwc--qaadmin.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qaom.sandbox.my.salesforce.com/') ) {

			AttachmentsUrl= "https://cwc--qaom.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}
		else if(GlobalVariable.url.equals('https://cwc--qacare.sandbox.my.salesforce.com/') ) {

			AttachmentsUrl= "https://cwc--qacare.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}

		else if(GlobalVariable.url.equals('https://cwc--qapeac.sandbox.my.salesforce.com/') ) {

			AttachmentsUrl= "https://cwc--qapeac.sandbox.lightning.force.com/lightning/r/Opportunity/"+OpportunityId+"/related/CombinedAttachments/view";
		}

		WebUI.navigateToUrl(AttachmentsUrl)

		//WebUI.click(findTestObject('PageAttchFile/Btn_UploadFiles'))

		Path absolutePath = Paths.get(RunConfiguration.getProjectDir(), "Data Source", ChooseFileupload);

		String absolutePathStr = absolutePath.toString()

		String replaceString=absolutePathStr.replace("\\","\\\\")



		WebUI.comment(absolutePathStr)

		WebUI.comment(replaceString)

		WebUI.uploadFile(findTestObject('PageAttchFile/Btn_UploadFiles'), absolutePathStr, FailureHandling.OPTIONAL)

		WebUI.waitForElementVisible(findTestObject('PageAttchFile/Btn_Done_Fileupload'), 300, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('PageAttchFile/Btn_Done_Fileupload'), FailureHandling.OPTIONAL)

		WebUI.delay(3)

		WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)

		WebUI.takeScreenshotAsCheckpoint('Fileupload', null)

		WebUI.click(findTestObject('PageContactRoles/link_GoToOpportunity'))

		//WebUI.delay(10)


	}

	@Keyword
	def changeStage(String Stage_ProposalAcceptance, String TC_Name){

		WebUI.waitForElementVisible(findTestObject('Object Repository/PageOpportunity/Btn_OppDetails_L'), 10)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/Btn_OppDetails_L'))

		WebUI.delay(5)



		WebUI.scrollToElement(findTestObject('Object Repository/PageOpportunity/Btn_OppDetails_L'), 20, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('PageOpprtunityManage/Btn_EditStage'))

		WebUI.click(findTestObject('PageOpprtunityManage/Btn_Stage_dropdown'))

		WebUI.click(findTestObject('PageOpprtunityManage/Btn_PraposalAcceptance'))

		WebUI.click(findTestObject('PageOpprtunityManage/Btn_Save'))

		WebUI.takeScreenshotAsCheckpoint('changeStage', null)

		/*
		 WebUI.click(findTestObject('PageOpprtunityManage/Btn_PraposalAcceptance'))
		 WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)
		 WebUI.delay(20)
		 /*
		 WebUI.waitForElementVisible(findTestObject('PageOpprtunityManage/Tab_PraposalAcceptance'), 20)
		 WebUI.click(findTestObject('PageOpprtunityManage/Tab_PraposalAcceptance'))
		 WebUI.delay(5)
		 WebUI.click(findTestObject('PageOpprtunityManage/Tab_MarkasCurrentStage'))
		 WebUI.delay(5)
		 */

		/*
		 WebUI.doubleClick(findTestObject('Object Repository/PageOpprtunityManage/td_Prospecting  Qualification'))
		 WebUI.selectOptionByValue(findTestObject('Object Repository/PageOpprtunityManage/select_Prospecting  QualificationSolution D_ff871b'),
		 Stage_ProposalAcceptance, true)
		 WebUI.click(findTestObject('Object Repository/PageOpprtunityManage/input_Probability ()_zen-btn'))
		 WebUI.takeFullPageScreenshot(FailureHandling.OPTIONAL)
		 WebUI.click(findTestObject('Object Repository/PageOpprtunityManage/input_Opportunity Detail_inlineEditSave'))
		 WebUI.verifyTextPresent(Stage_ProposalAcceptance, true)
		 */
	}
}
