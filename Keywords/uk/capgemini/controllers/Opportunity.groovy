package uk.capgemini.controllers

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.Date

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable


public class Opportunity {

	Date today = new Date()
	String todaysDate1 = today.format('MM/dd/yyyy')
	String todaysDate2 = today.format('MMddyyyy')
	String nowTime1 = today.format('hhmmss')





	@Keyword
	def createNewOpportunity(String TC_Name){

		String gotoOpportunity= GlobalVariable.url+"lightning/o/Opportunity/list?filterName=Recent";

		WebUI.navigateToUrl(gotoOpportunity, FailureHandling.STOP_ON_FAILURE)

		WebUI.takeScreenshotAsCheckpoint('gotoOpportunity', null)



		/*
		 if(GlobalVariable.url.equals('https://cwc--uat.my.salesforce.com/')) {
		 WebUI.navigateToUrl("https://cwc--uat.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent")
		 }
		 else if(GlobalVariable.url.equals('https://cwc--qa.my.salesforce.com/')) {
		 WebUI.navigateToUrl("https://cwc--qa.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent")
		 }
		 else{
		 WebUI.navigateToUrl("https://cwc--prep.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent")
		 }
		 */





		//WebUI.click(findTestObject('Object Repository/PageOpportunity/Btn_Opportunities_L'))

		WebUI.click(findTestObject('Object Repository/PageOpportunity/btn_NewOpportunity_L'))

		WebUI.click(findTestObject('Object Repository/PageOpportunity/btn_Next_L'))

		//WebUI.click(findTestObject('Object Repository/PageOpportunity/img__lookupIconOn'))

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('NewOpportunity', null)
	}


	@Keyword
	def manageOpportunity(String AccountName, String OpportunityName, String todayDate, String Stage, String ContractTerm, String HIUnumber, String todayDateTime, String CloseDate, String OrderSignedDate , String TC_Name){

		String OpportunitywithTimestamp= OpportunityName +"_"+todaysDate2+"_"+nowTime1

		if(!(AccountName.equals('Null'))){

			//WebUI.click(findTestObject('Object Repository/PageOpportunity/SelectAccountonNewWindow'))
			WebUI.setText(findTestObject('Object Repository/PageOpportunity/input_AccountName_L'), AccountName)

			//WebUI.click(findTestObject('Object Repository/PageOpportunity/Select_Account_L(Dynamic)'))

			WebUI.click(findTestObject('Object Repository/PageOpportunity/Select_Account_L(Dynamic)'))
		}


		if(!(OpportunityName.equals('Null'))){
			WebUI.setText(findTestObject('Object Repository/PageOpportunity/input_OpportunityName_L'), OpportunitywithTimestamp)
		}

		if(!(CloseDate.equals('Null'))){

			//WebUI.click(findTestObject('Object Repository/PageOpportunity/a_172021'))
			WebUI.setText(findTestObject('Object Repository/PageOpportunity/input_ClosedDate_L'), todaysDate1)
		}

		if(!(Stage.equals('Null'))){
			//WebUI.selectOptionByValue(findTestObject('Object Repository/PageOpportunity/Select_Stage_L'),Stage, true)

			WebUI.click(findTestObject('Object Repository/PageOpportunity/Select_Stage_L'))

			WebUI.click(findTestObject('Object Repository/PageOpportunity/Select_Stage_PQ_L'))
		}

		//WebUI.selectOptionByValue(findTestObject('Object Repository/PageOpportunity/Select_ContractTerm_L'),ContractTerm, true)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/Select_ContractTerm_L'))

		WebUI.click(findTestObject('Object Repository/PageOpportunity/Selct_Term_L'))


		WebUI.click(findTestObject('Object Repository/PageOpportunity/Select_CWBMarketSegment'))



		WebUI.click(findTestObject('Object Repository/PageOpportunity/Option_Segment'), FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/Option_Segment_SOHO'), FailureHandling.OPTIONAL)

		WebUI.takeFullPageScreenshot()



		if(!(HIUnumber.equals('Null'))){
			WebUI.setText(findTestObject('Object Repository/PageOpportunity/input_HIUNumber_L'),HIUnumber)
		}


		if(!(OrderSignedDate.equals('Null'))){
			//WebUI.click(findTestObject('Object Repository/PageOpportunity/input_OrderSignedDate_L'))
			WebUI.setText(findTestObject('Object Repository/PageOpportunity/input_OrderSignedDate_L'),todaysDate1)
		}


		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('manageOpportunity', null)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/btn_Save_L'))

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('SaveOpportunity', null)

		if((AccountName.equals('Null'))){
			//WebUI.verifyTextPresent(AccountName, true)
			return
		}

		if((OpportunityName.equals('Null'))){
			//	WebUI.verifyTextPresent(OpportunityName, true)
			return
		}

		if((Stage.equals('Null'))){
			//WebUI.verifyTextPresent(Stage, true)
			return
		}

		if((CloseDate.equals('Null'))){
			//WebUI.verifyTextPresent(Stage, true)
			return
		}

		//WebUI.waitForElementVisible(findTestObject('Object Repository/PageOpportunity/btn_Save_L'), 10)

		//	WebUI.click(findTestObject('Object Repository/PageOpportunity/btn_Save_L'))

		//Object Repository/PageOpportunity/Btn_Closethiswindow

		WebUI.waitForElementVisible(findTestObject('Object Repository/PageOpportunity/Btn_Closethiswindow'), 20, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/btn_Save_L'), FailureHandling.OPTIONAL)

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/Btn_Closethiswindow'), FailureHandling.OPTIONAL)


		WebUI.waitForElementVisible(findTestObject('Object Repository/PageOpportunity/Btn_OppDetails_L'), 10)

		WebUI.click(findTestObject('Object Repository/PageOpportunity/Btn_OppDetails_L'))

		WebUI.delay(5)

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('OpportunityDetail', null)

		WebUI.delay(3)

		//return

		WebUI.click(findTestObject('PageAddService/Btn_ProductMenu_L'))

		WebUI.waitForElementVisible(findTestObject('PageAddService/Btn_AddNewServices_L'), 10)

		WebUI.click(findTestObject('PageAddService/Btn_AddNewServices_L'))

		WebUI.delay(30)


	}

	//Libreria Educativa Inc, Libreria Educativa Inc, SOHO Triple Pack


	@Keyword
	def ExistingServices_Disconnection(){


		WebUI.click(findTestObject('PageExistingServices/dd_ChangeRecordType'))

		WebUI.click(findTestObject('PageExistingServices/Btn_SetupExistingServices'))


		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('SetupExistingServices', null)


		WebUI.setText(findTestObject('PageExistingServices/Input_choosetheAsset'),"Libreria Educativa Inc")

		WebUI.click(findTestObject('PageExistingServices/Rdo_btn_Disconnection'))


		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('btn_Disconnection', null)

		WebUI.click(findTestObject('PageExistingServices/Btn_Next'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Btn_ViewAllProducts'))

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('ViewAllProducts', null)

		WebUI.click(findTestObject('PageExistingServices/Select_SOHOTriplePack'))



		WebUI.verifyElementText(findTestObject('PageExistingServices/Txt_TransactionType'), "Disconnection", FailureHandling.OPTIONAL)


		WebUI.takeFullPageScreenshot()

	}


	@Keyword
	def ExistingServices_Replacement(){


		WebUI.click(findTestObject('PageExistingServices/dd_ChangeRecordType'))

		WebUI.click(findTestObject('PageExistingServices/Btn_SetupExistingServices'))


		WebUI.takeFullPageScreenshot()


		WebUI.setText(findTestObject('PageExistingServices/Input_choosetheAsset'),"Libreria Educativa Inc")

		WebUI.click(findTestObject('PageExistingServices/Rdo_btn_Replacement'))


		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Btn_Next'))

		WebUI.takeFullPageScreenshot()


		WebUI.selectOptionByLabel(findTestObject('PageExistingServices/Select_OfferPicklist'), "FTTx Telefonia", false, FailureHandling.STOP_ON_FAILURE)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Btn_Next'))


		WebUI.selectOptionByLabel(findTestObject('PageExistingServices/Select_ChooseProduct'), "SOHO Hunting", false, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PageExistingServices/Btn_Next'))



		WebUI.click(findTestObject('PageExistingServices/Btn_ViewAllProducts'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Select_SOHOHunting'))



		WebUI.verifyElementText(findTestObject('PageExistingServices/Txt_TransactionType'), "Replacement", FailureHandling.OPTIONAL)


		WebUI.takeFullPageScreenshot()

	}

	@Keyword
	def ExistingServices_Upgrade_Downgrade_Renewal(){


		WebUI.click(findTestObject('PageExistingServices/dd_ChangeRecordType'))

		WebUI.click(findTestObject('PageExistingServices/Btn_SetupExistingServices'))


		WebUI.takeFullPageScreenshot()


		WebUI.setText(findTestObject('PageExistingServices/Input_choosetheAsset'),"Libreria Educativa Inc")

		WebUI.click(findTestObject('PageExistingServices/Rdo_btn_UpgradeDowngrade'))


		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Btn_Next'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Btn_ViewAllProducts'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('PageExistingServices/Select_SOHOTriplePack'))



		WebUI.verifyElementText(findTestObject('PageExistingServices/Txt_TransactionType'), "Disconnection", FailureHandling.OPTIONAL)


		WebUI.takeFullPageScreenshot()

	}



}
























