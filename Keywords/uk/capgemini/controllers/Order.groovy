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

public class Order {

	Date today = new Date()
	String todaysDate1 = today.format('MM/dd/yyyy')
	String todaysDate2 = today.format('MMddyyyy')
	String nowTime1 = today.format('hhmmss')


	@Keyword
	def generateOrder(String TC_Name){


		WebUI.click(findTestObject('PageGenerateOrder/Btn_ShowmoreActions'))

		WebUI.waitForElementVisible(findTestObject('PageGenerateOrder/Tab_GenerateOrder'), 20)

		WebUI.click(findTestObject('PageGenerateOrder/Tab_GenerateOrder'))

		WebUI.delay(10)

		//WebUI.click(findTestObject('Object Repository/PageGenerateOrder/input_Clone without Products_generate_order'))

		//WebUI.switchToWindowIndex(1)
		//WebUI.maximizeWindow()

		WebUI.takeFullPageScreenshot()

		WebUI.takeScreenshotAsCheckpoint('generateOrder', null)
	}

	@Keyword
	def manageOrder(String todayDate, String CircuitId, String OrderNumber, String SI_Stage , String ActualBilledDate, String HIUNumber, String NoofProducts){

		WebUI.waitForElementVisible(findTestObject('PageGenerateOrder/Btn_Related'), 60)

		WebUI.click(findTestObject('PageGenerateOrder/Btn_Related'))

		WebUI.waitForElementVisible(findTestObject('PageGenerateOrder/Btn_EditProducts'), 20)

		WebUI.click(findTestObject('PageGenerateOrder/Btn_EditProducts'))

		WebUI.delay(10)



		if (NoofProducts.equals('1')) {

			if(!(CircuitId.equals('Null'))){


				WebUI.click(findTestObject('PageGenerateOrder/Btn_CircuitId1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), CircuitId)
			}

			if(!(OrderNumber.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_OrderNumber1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), OrderNumber)
			}


			WebUI.click(findTestObject('PageGenerateOrder/Btn_SIStage1'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_SIStage'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_RFSCompleted'))

			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}

			WebUI.takeFullPageScreenshot()
			
			WebUI.takeScreenshotAsCheckpoint('manageOrder', null)
		}




		if (NoofProducts.equals('2')) {

			//1st product
			if(!(CircuitId.equals('Null'))){


				WebUI.click(findTestObject('PageGenerateOrder/Btn_CircuitId1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), CircuitId)
			}

			if(!(OrderNumber.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_OrderNumber1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), OrderNumber)
			}


			WebUI.click(findTestObject('PageGenerateOrder/Btn_SIStage1'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_SIStage'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_RFSCompleted'))

			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}


			//2nd product
			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}

			if(!(CircuitId.equals('Null'))){


				WebUI.click(findTestObject('PageGenerateOrder/Btn_CircuitId2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), CircuitId)
			}

			if(!(OrderNumber.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_OrderNumber2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), OrderNumber)
			}


			WebUI.click(findTestObject('PageGenerateOrder/Btn_SIStage2'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_SIStage'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_RFSCompleted'))

			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}

			WebUI.takeFullPageScreenshot()
			
			WebUI.takeScreenshotAsCheckpoint('PageGenerateOrder', null)

		}




		if (NoofProducts.equals('3')) {

			//1st product
			if(!(CircuitId.equals('Null'))){


				WebUI.click(findTestObject('PageGenerateOrder/Btn_CircuitId1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), CircuitId)
			}

			if(!(OrderNumber.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_OrderNumber1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), OrderNumber)
			}


			WebUI.click(findTestObject('PageGenerateOrder/Btn_SIStage1'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_SIStage'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_RFSCompleted'))

			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate1'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}


			//2nd product
			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}

			if(!(CircuitId.equals('Null'))){


				WebUI.click(findTestObject('PageGenerateOrder/Btn_CircuitId2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), CircuitId)
			}

			if(!(OrderNumber.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_OrderNumber2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), OrderNumber)
			}


			WebUI.click(findTestObject('PageGenerateOrder/Btn_SIStage2'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_SIStage'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_RFSCompleted'))

			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate2'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}

			//3rd product
			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate3'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}

			if(!(CircuitId.equals('Null'))){


				WebUI.click(findTestObject('PageGenerateOrder/Btn_CircuitId3'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), CircuitId)
			}

			if(!(OrderNumber.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_OrderNumber3'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), OrderNumber)
			}


			WebUI.click(findTestObject('PageGenerateOrder/Btn_SIStage3'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_SIStage'))

			WebUI.click(findTestObject('PageGenerateOrder/Select_RFSCompleted'))

			if(!(ActualBilledDate.equals('Null'))){

				WebUI.click(findTestObject('PageGenerateOrder/Btn_ActualBillDate3'))

				WebUI.setText(findTestObject('PageGenerateOrder/input_Field'), todaysDate1)
			}


			WebUI.takeFullPageScreenshot()

		}

		WebUI.waitForElementClickable(findTestObject('PageGenerateOrder/Btn_Save'), 30, FailureHandling.OPTIONAL)

		WebUI.click(findTestObject('PageGenerateOrder/Btn_Save'))

		WebUI.takeFullPageScreenshot()


		if((CircuitId.equals('Null'))){
			//	WebUI.verifyTextPresent(OpportunityName, true)
			return
		}

		if((OrderNumber.equals('Null'))){
			//WebUI.verifyTextPresent(Stage, true)
			return
		}

		if((todaysDate1.equals('Null'))){
			//WebUI.verifyTextPresent(Stage, true)
			return
		}

		if((HIUNumber.equals('Null'))){
			//WebUI.verifyTextPresent(Stage, true)
			return
		}


		WebUI.click(findTestObject('PageGenerateOrder/Btn_Details'))

		WebUI.delay(5)

		WebUI.click(findTestObject('PageGenerateOrder/link_gotoOpportunity'))

		WebUI.delay(5)

		WebUI.click(findTestObject('PageGenerateOrder/Btn_OpportunityDetails'))

		WebUI.delay(5)

		WebUI.takeFullPageScreenshot()
		
		WebUI.takeScreenshotAsCheckpoint('PageGenerateOrder1', null)
	}





	@Keyword
	def validateOppotunity(String TC_Name){

		//WebUI.click(findTestObject('Object Repository/PageValidateOppotunity/a_Opportunities'))

		//WebUI.click(findTestObject('Object Repository/PageValidateOppotunity/a_Cualquier valor'))

		//WebUI.click(findTestObject('Object Repository/PageValidateOppotunity/div_Closed'))

		//WebUI.verifyElementPresent(findTestObject('PageValidateOppotunity/div_Closed Won'), 30)
		//WebUI.verifyElementPresent(findTestObject('PageValidateOppotunity/div_Closed'), 30)

		/*WebUI.verifyTextPresent("Closed Won", true)
		 WebUI.verifyTextPresent("Closed", true)*/

		//WebUI.scrollToElement(findTestObject('Object Repository/PageValidateOppotunity/mainTitle'), 30)
		//WebUI.takeFullPageScreenshot()
		//_'+TC_Name+'/LCPR_Order_04.png')
	}
}
