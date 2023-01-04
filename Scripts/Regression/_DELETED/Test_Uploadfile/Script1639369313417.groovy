import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.time.LocalTime as LocalTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.util.Date as Date
import com.kms.katalon.core.annotation.TearDown as TearDown
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String todayDate = calculateTodayDate()

String todayDateTime = calculateTodayDateTime()

Date today = new Date()

String todaysDate1 = today.format('MM_dd_yy')

String nowTime1 = today.format('hhmmss')

//def Url = findTestData('LCPR_TestData').getValue('url', 1)
CustomKeywords.'uk.capgemini.controllers.Login.navigateToLCPRurl'(GlobalVariable.url, TC_Name)

CustomKeywords.'uk.capgemini.controllers.Login.loginwithCredentials'(GlobalVariable.userName, GlobalVariable.passWord, TC_Name)

CustomKeywords.'uk.capgemini.controllers.Login.secondLoginwithLcprUser'(LoginwithSecondUser, TC_Name)



CustomKeywords.'uk.capgemini.controllers.Quote.uploadFile'(ChooseFileupload, TC_Name)




private String calculateTodayDate() {
    String todayDate = ''

    Calendar cal = Calendar.getInstance()

    todayDate = ((todayDate + (cal.get(Calendar.MONTH) + 1)) + '/')

    todayDate = ((todayDate + cal.get(Calendar.DAY_OF_MONTH)) + '/')

    todayDate = (todayDate + cal.get(Calendar.YEAR))

    return todayDate
}

private String calculateTodayDateTime() {
    String todayDateTime = ''

    Calendar cal = Calendar.getInstance()

    todayDateTime = ((todayDateTime + (cal.get(Calendar.MONTH) + 1)) + '/')

    todayDateTime = ((todayDateTime + cal.get(Calendar.DAY_OF_MONTH)) + '/')

    todayDateTime = ((todayDateTime + cal.get(Calendar.YEAR)) + ' ')

    LocalTime now = LocalTime.now()

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern('hh:mm a')

    todayDateTime += now.format(dateTimeFormatter)

    return todayDateTime
    
    
}

