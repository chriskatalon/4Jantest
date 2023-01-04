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

CustomKeywords.'uk.capgemini.controllers.Opportunity.createNewOpportunity'(TC_Name)

CustomKeywords.'uk.capgemini.controllers.Opportunity.manageOpportunity'(AccountName, OpportunityName, todayDate, Stage, 
    ContractTerm, HIUnumber, todayDateTime, CloseDate, OrderSignedDate, TC_Name)



if (((AccountName.equals('Null') || OpportunityName.equals('Null')) || CloseDate.equals('Null')) || Stage.equals('Null')) {
    CustomKeywords.'uk.capgemini.controllers.ScreenErrorMsg.HandlingErrorScreen'(TC_Name)

    return 
}

if (NoofProducts.equals('1')) {
    CustomKeywords.'uk.capgemini.controllers.Product.newService'(TC_Name, Product1)

    CustomKeywords.'uk.capgemini.controllers.Product.addOfferAttributes'(TermFrequency, TemporaryTransaction, Quantity, 
        Term, TC_Name)

    if (TermFrequency.equals('Null') || TemporaryTransaction.equals('Null')) {
        CustomKeywords.'uk.capgemini.controllers.ScreenErrorMsg.HandlingErrorScreen'(TC_Name)

        return null
    }
    
    CustomKeywords.'uk.capgemini.controllers.Product.addcomponents'(Product1, Discountproduct1, TypeVideo1, Bandwidth1, 
        LineNumbers1, TypeDeco1, TC_Name)

    CustomKeywords.'uk.capgemini.controllers.Product.calculatePrice'(TC_Name)

    CustomKeywords.'uk.capgemini.controllers.Product.showCart'(TC_Name)
}

if (NoofProducts.equals('2')) {
    addProduct(Product1, TermFrequency, TemporaryTransaction, Quantity, Term, Discountproduct1, TypeVideo1, Bandwidth1, 
        LineNumbers1, TypeDeco1, TC_Name)

    addProduct(Product2, TermFrequency, TemporaryTransaction, Quantity, Term, Discountproduct2, TypeVideo2, Bandwidth2, 
        LineNumbers2, TypeDeco2, TC_Name)
}

if (NoofProducts.equals('3')) {
    addProduct(Product1, TermFrequency, TemporaryTransaction, Quantity, Term, Discountproduct1, TypeVideo1, Bandwidth1, 
        LineNumbers1, TypeDeco1, TC_Name)

    addProduct(Product2, TermFrequency, TemporaryTransaction, Quantity, Term, Discountproduct2, TypeVideo2, Bandwidth2, 
        LineNumbers2, TypeDeco2, TC_Name)

    addProduct(Product3, TermFrequency, TemporaryTransaction, Quantity, Term, Discountproduct3, TypeVideo3, Bandwidth3, 
        LineNumbers3, TypeDeco3, TC_Name)
}

CustomKeywords.'uk.capgemini.controllers.Product.ApprovalCheck'(TC_Name)

CustomKeywords.'uk.capgemini.controllers.Quote.gotoQuote'(TC_Name)



CustomKeywords.'uk.capgemini.controllers.Quote.gotoOpportunity'(TC_Name)

CustomKeywords.'uk.capgemini.controllers.Quote.createContactroles'(Primary_contact1, Page_ContactRoles1, Primary_contact2, 
    Page_ContactRoles2, TC_Name)

CustomKeywords.'uk.capgemini.controllers.Quote.uploadFile'(ChooseFileupload, TC_Name)

CustomKeywords.'uk.capgemini.controllers.Quote.changeStage'(Stage_ProposalAcceptance, TC_Name)

CustomKeywords.'uk.capgemini.controllers.Order.generateOrder'(TC_Name)

if (OrderSignedDate.equals('Null')) {
    /*  WebUI.delay(3)
    WebUI.takeScreenshot(((('Screenshots/LCPR_' + TC_Name) + '/LCPR_') + nowTime1) + '.png')*/
    CustomKeywords.'uk.capgemini.controllers.ScreenErrorMsg.HandlingErrorScreen'(TC_Name)

    return null
}

if (NoofProducts.equals('1')) {
    CustomKeywords.'uk.capgemini.controllers.Order.manageOrder'(todayDate, CircuitId, OrderNumber, SI_Stage, ActualBilledDate, 
        'Edit_Product1', NoofProducts)
}

if (NoofProducts.equals('2')) {
    CustomKeywords.'uk.capgemini.controllers.Order.manageOrder'(todayDate, CircuitId, OrderNumber, SI_Stage, ActualBilledDate, 
        'Edit_Product1', NoofProducts)

   // CustomKeywords.'uk.capgemini.controllers.Order.manageOrder'(todayDate, CircuitId, OrderNumber, SI_Stage, ActualBilledDate, 
    //    'Edit_Product2', TC_Name)
}

if (NoofProducts.equals('3')) {
    CustomKeywords.'uk.capgemini.controllers.Order.manageOrder'(todayDate, CircuitId, OrderNumber, SI_Stage, ActualBilledDate, 
        'Edit_Product1', NoofProducts)

  //  CustomKeywords.'uk.capgemini.controllers.Order.manageOrder'(todayDate, CircuitId, OrderNumber, SI_Stage, ActualBilledDate,'Edit_Product2', TC_Name)

   // CustomKeywords.'uk.capgemini.controllers.Order.manageOrder'(todayDate, CircuitId, OrderNumber, SI_Stage, ActualBilledDate,   'Edit_Product3', TC_Name)
}

if (((CircuitId.equals('Null') || OrderNumber.equals('Null')) || ActualBilledDate.equals('Null')) || HIUnumber.equals('Null')) {
    //WebUI.verifyTextPresent("Error: Invalid Data.Review all error messages below to correct your data.", true)
    /*WebUI.delay(3)
    WebUI.takeScreenshot(((('Screenshots/LCPR_' + TC_Name) + '/LCPR_') + nowTime1) + '.png')*/
    CustomKeywords.'uk.capgemini.controllers.ScreenErrorMsg.HandlingErrorScreen'(TC_Name)

    return null
}

CustomKeywords.'uk.capgemini.controllers.Order.validateOppotunity'(TC_Name) //CustomKeywords.'uk.capgemini.controllers.Product.addOfferAttributes'(TermFrequency, TemporaryTransaction, TC_Name)

private void addProduct(String Product, String TermFrequency, String TemporaryTransaction, String Quantity, String Term, String Discountproduct, String TypeVideo, String Bandwidth, String LineNumbers, String TypeDeco, String TC_Name) {
    CustomKeywords.'uk.capgemini.controllers.Product.newService'(TC_Name, Product)

    CustomKeywords.'uk.capgemini.controllers.Product.addOfferAttributes'(TermFrequency, TemporaryTransaction, Quantity, 
        Term, TC_Name)

    if (TermFrequency.equals('Null') || TemporaryTransaction.equals('Null')) {
        CustomKeywords.'uk.capgemini.controllers.ScreenErrorMsg.HandlingErrorScreen'(TC_Name)

        return null
    }
    
    CustomKeywords.'uk.capgemini.controllers.Product.addcomponents'(Product, Discountproduct, TypeVideo, Bandwidth, LineNumbers, 
        TypeDeco, TC_Name)

    CustomKeywords.'uk.capgemini.controllers.Product.calculatePrice'(TC_Name)

    CustomKeywords.'uk.capgemini.controllers.Product.showCart'(TC_Name)
}

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

