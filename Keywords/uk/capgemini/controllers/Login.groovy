package uk.capgemini.controllers
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

/*import MobileBuiltInKeywords as Mobile
 import WSBuiltInKeywords as WS
 import WebUiBuiltInKeywords as WebUI*/

//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

class Login {

	Date today = new Date()
	String todaysDate1 = today.format('MM_dd_yy')
	String nowTime1 = today.format('hhmmss')


	@Keyword
	def navigateToLCPRurl(String url, String TC_Name){
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(url)
		//
		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('openBrowser', null)
		//
	}

	@Keyword
	def loginwithCredentials(String userName, String passWord, String TC_Name){

		WebUI.setText(findTestObject('Object Repository/PageLogIn/input_Username_username'), userName)

		WebUI.setText(findTestObject('Object Repository/PageLogIn/input_Password_pw'), passWord)

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('Credentials', null)



		WebUI.delay(3)

		//WebUI.click(findTestObject('Object Repository/PageLogIn/input_Password_Login'))

		WebUI.click(findTestObject('Object Repository/PageLogIn/input_Password_Login'), FailureHandling.OPTIONAL)

		WebUI.delay(3)
		WebUI.takeScreenshot(FailureHandling.OPTIONAL)

		WebUI.takeScreenshotAsCheckpoint('Login', null)

	}


	@Keyword
	def secondLoginwithLcprUser(String LoginwithSecondUser, String TC_Name){


		if(WebUI.verifyElementPresent(findTestObject('Object Repository/PageDoubleLogIn/LightningIcon'), 10, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/SalesforceUIImage'))

			WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/SwitchtoSalesforceClassic'), FailureHandling.OPTIONAL)

			WebUI.delay(2)
		}

		WebUI.setText(findTestObject('Object Repository/PageDoubleLogIn/input_Logout_str'), LoginwithSecondUser)

		WebUI.delay(5)

		WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/div_Logout_searchButtonContainer'))

		WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/a_LCPR USER DO NOT INACTIVATE Test 01'))

		WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/b_Service Requests_zen-selectArrow'))

		WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/span_User Detail'))


		WebUI.delay(2)
		//
		WebUI.takeFullPageScreenshot()
		WebUI.takeScreenshotAsCheckpoint('User Detail', null)
		//
		WebUI.verifyElementPresent(findTestObject('Object Repository/PageDoubleLogIn/validateLCPRStandardUser'), 30)

		WebUI.verifyElementPresent(findTestObject('Object Repository/PageDoubleLogIn/validateBussinessUnit'), 30)

		WebUI.click(findTestObject('Object Repository/PageDoubleLogIn/input_User Detail_login'))

		WebUI.delay(4)

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('User Detail_login', null)


	}
}