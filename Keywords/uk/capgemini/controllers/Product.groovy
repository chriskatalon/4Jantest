package uk.capgemini.controllers

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

public class Product {

	Date today = new Date()
	String todaysDate1 = today.format('MM_dd_yy')
	String nowTime1 = today.format('hhmmss')

	@Keyword
	def newService(String TC_Name, String Product){

		/*		
		 WebUI.delay(3)
		 WebUI.click(findTestObject('PageAddService/Btn_ProductMenu_L'))
		 WebUI.waitForElementVisible(findTestObject('PageAddService/Btn_AddNewServices_L'), 10)
		 WebUI.click(findTestObject('PageAddService/Btn_AddNewServices_L'))
		 WebUI.delay(30)
		 */

		WebUI.switchToFrame(findTestObject('PageAddService/iframe_Products'), 30, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('Object Repository/PageAddService/lightning-primitive-icon'))

		if (Product.equals('SOHO Triple Pack')) {

			WebUI.click(findTestObject('Object Repository/PageAddService/span_SOHO Triple pack'))
			WebUI.takeFullPageScreenshot()

			WebUI.click(findTestObject('PageAddService/Configure_SOHO Triple pack'))
		}else if(Product.equals('SOHO Double Video')) {

			WebUI.click(findTestObject('Object Repository/PageAddService/span_SOHO Double video'))
			WebUI.takeFullPageScreenshot()

			WebUI.click(findTestObject('PageAddService/Configure_SOHO Double video'))
		}else if(Product.equals('SOHO Double Voice')) {

			WebUI.click(findTestObject('Object Repository/PageAddService/span_SOHO Double Voice'))
			WebUI.takeFullPageScreenshot()

			WebUI.click(findTestObject('PageAddService/Configure_SOHO Double Voice'))
		}else if(Product.equals('SOHO Telefonia')) {

			WebUI.click(findTestObject('Object Repository/PageAddService/span_SOHO Telefonia'))
			WebUI.takeFullPageScreenshot()

			WebUI.click(findTestObject('PageAddService/Configure_SOHO Telefonia'))
		}else if(Product.equals('SOHO Video')) {

			WebUI.click(findTestObject('Object Repository/PageAddService/span_SOHO Video'))
			WebUI.takeFullPageScreenshot()

			WebUI.click(findTestObject('PageAddService/Configure_SOHO Video'))
		}else if(Product.equals('SOHO Internet')) {

			WebUI.click(findTestObject('Object Repository/PageAddService/span_SOHO Internet'))
			WebUI.takeFullPageScreenshot()

			WebUI.click(findTestObject('PageAddService/Configure_SOHO Internet'))
		}
	}

	@Keyword
	def addOfferAttributes(String TermFrequency, String TemporaryTransaction, String Quantity, String Term, String TC_Name){


		if(!(TermFrequency.equals('Null'))){
			WebUI.selectOptionByValue(findTestObject('PageOfferAtrributes/TermFrequency'), TermFrequency, true)
		}

		WebUI.click(findTestObject('Object Repository/PageOfferAtrributes/svg_Location_slds-icon slds-icon_small'))
		WebUI.click(findTestObject('Object Repository/PageOfferAtrributes/span_EnterpriseEnterprise'))

		if(!(TemporaryTransaction.equals('Null'))){
			WebUI.selectOptionByValue(findTestObject('PageOfferAtrributes/TemporaryTransaction'), TemporaryTransaction, true)
		}

		/*	WebUI.setText(findTestObject('PageOfferAtrributes/Quantity'), Quantity)
		 WebUI.selectOptionByValue(findTestObject('PageOfferAtrributes/Term'), Term, true)
		 //	WebUI.selectOptionByValue(findTestObject('PageOfferAtrributes/Quantity'), Quantity, true)
		 WebUI.delay(1)*/

		WebUI.click(findTestObject('Object Repository/PageOfferAtrributes/svg_Contact_slds-icon slds-icon_small'))
		WebUI.click(findTestObject('Object Repository/PageOfferAtrributes/span_Test lcpr leadTest lcpr lead'))
		//WebUI.click(findTestObject('Object Repository/PageOfferAtrributes/span_EnterpriseEnterprise'))

		//validations
		if(!(TermFrequency.equals('Null'))){
			WebUI.verifyTextPresent(TermFrequency, true)
		}

		if(!(TemporaryTransaction.equals('Null'))){
			WebUI.verifyTextPresent(TemporaryTransaction, true)
		}

		WebUI.takeFullPageScreenshot()
		
		WebUI.takeScreenshotAsCheckpoint('Product_addOfferAttributes', null)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/PageComponents/a_Components'))
	}

	@Keyword
	def addcomponents(String Product, String Discountproduct, String TypeVideo, String Bandwidth, String LineNumbers, String TypeDeco, String TC_Name){

		//WebUI.click(findTestObject('Object Repository/PageComponents/a_Components'))

		WebUI.click(findTestObject('Object Repository/PageComponents/lightning-primitive-icon_1'))

		WebUI.click(findTestObject('Object Repository/PageComponents/span_SOHO Double Pack 1_slds-checkbox_faux'))

		WebUI.click(findTestObject('Object Repository/PageComponents/lightning-primitive-icon_1_2'))


		if (Product.equals('SOHO Triple Pack')) {

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Discount product'), Discountproduct, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Type video'), TypeVideo, true)

			//	WebUI.selectOptionByLabel(findTestObject('PageComponents/Bandwidth (Mbps)'), Bandwidth, true)

			WebUI.selectOptionByValue(findTestObject('PageComponents/Bandwidth (Mbps)'), Bandwidth, true, FailureHandling.OPTIONAL)

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Line numbers'), LineNumbers, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Type deco'), TypeDeco, true)



		}else if(Product.equals('SOHO Double Video')) {

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Discount product'), Discountproduct, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Type video'), TypeVideo, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Bandwidth (Mbps)'), Bandwidth, true, FailureHandling.OPTIONAL)

		}else if(Product.equals('SOHO Double Voice')) {

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Discount product'), Discountproduct, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Bandwidth (Mbps)'), Bandwidth, true, FailureHandling.OPTIONAL)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Line numbers'), LineNumbers, true)


		}else if(Product.equals('SOHO Telefonia')) {

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Discount product'), Discountproduct, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Line numbers'), LineNumbers, true)


		}else if(Product.equals('SOHO Video')) {

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Discount product'), Discountproduct, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Type video'), TypeVideo, true)

		}else if(Product.equals('SOHO Internet')) {

			WebUI.selectOptionByLabel(findTestObject('PageComponents/Discount product'), Discountproduct, true)
			WebUI.selectOptionByLabel(findTestObject('PageComponents/Bandwidth (Mbps)'),Bandwidth, true, FailureHandling.OPTIONAL)

		}


		//Validations
		//WebUI.verifyTextPresent(Discountproduct, true)

		WebUI.takeFullPageScreenshot()
		
		WebUI.takeScreenshotAsCheckpoint('Product_addComponents', null)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/PageComponents/button_Save'))


	}

	@Keyword
	def calculatePrice(String TC_Name){

		WebUI.click(findTestObject('Object Repository/PageComponents/button_Calculate Price'))
		WebUI.takeFullPageScreenshot()
		
		WebUI.takeScreenshotAsCheckpoint('calculatePrice', null)

	}

	@Keyword
	def showCart(String TC_Name){

		WebUI.click(findTestObject('Object Repository/PageComponents/button_Show Cart'))
		WebUI.takeFullPageScreenshot()
		
		WebUI.takeScreenshotAsCheckpoint('showCart', null)

	}

	@Keyword
	def ApprovalCheck(String TC_Name){

		WebUI.click(findTestObject('Object Repository/PageComponents/button_Approval Check'))

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/PageComponents/calculating some metrics for this quote'), 30)){
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/PageComponents/button_Approval Check'))
		}

		//WebUI.verifyElementPresent(findTestObject('Object Repository/PageComponents/calculating some metrics for this quote'), 30)
		WebUI.takeFullPageScreenshot()
		
		WebUI.takeScreenshotAsCheckpoint('ApprovalCheck', null)


		WebUI.delay(3)
	}
}
