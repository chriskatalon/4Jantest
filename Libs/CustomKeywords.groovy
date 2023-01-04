
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize

import org.apache.poi.ss.usermodel.Sheet

import java.util.Map

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import java.util.List

import org.apache.poi.ss.usermodel.Workbook

import java.lang.Object



def static "uk.capgemini.controllers.Product.newService"(
    	String TC_Name	
     , 	String Product	) {
    (new uk.capgemini.controllers.Product()).newService(
        	TC_Name
         , 	Product)
}


def static "uk.capgemini.controllers.Product.addOfferAttributes"(
    	String TermFrequency	
     , 	String TemporaryTransaction	
     , 	String Quantity	
     , 	String Term	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Product()).addOfferAttributes(
        	TermFrequency
         , 	TemporaryTransaction
         , 	Quantity
         , 	Term
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Product.addcomponents"(
    	String Product	
     , 	String Discountproduct	
     , 	String TypeVideo	
     , 	String Bandwidth	
     , 	String LineNumbers	
     , 	String TypeDeco	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Product()).addcomponents(
        	Product
         , 	Discountproduct
         , 	TypeVideo
         , 	Bandwidth
         , 	LineNumbers
         , 	TypeDeco
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Product.calculatePrice"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Product()).calculatePrice(
        	TC_Name)
}


def static "uk.capgemini.controllers.Product.showCart"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Product()).showCart(
        	TC_Name)
}


def static "uk.capgemini.controllers.Product.ApprovalCheck"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Product()).ApprovalCheck(
        	TC_Name)
}


def static "uk.capgemini.controllers.ScreenErrorMsg.HandlingErrorScreen"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.ScreenErrorMsg()).HandlingErrorScreen(
        	TC_Name)
}


def static "uk.capgemini.controllers.Login.navigateToLCPRurl"(
    	String url	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Login()).navigateToLCPRurl(
        	url
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Login.loginwithCredentials"(
    	String userName	
     , 	String passWord	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Login()).loginwithCredentials(
        	userName
         , 	passWord
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Login.secondLoginwithLcprUser"(
    	String LoginwithSecondUser	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Login()).secondLoginwithLcprUser(
        	LoginwithSecondUser
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Opportunity.createNewOpportunity"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Opportunity()).createNewOpportunity(
        	TC_Name)
}


def static "uk.capgemini.controllers.Opportunity.manageOpportunity"(
    	String AccountName	
     , 	String OpportunityName	
     , 	String todayDate	
     , 	String Stage	
     , 	String ContractTerm	
     , 	String HIUnumber	
     , 	String todayDateTime	
     , 	String CloseDate	
     , 	String OrderSignedDate	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Opportunity()).manageOpportunity(
        	AccountName
         , 	OpportunityName
         , 	todayDate
         , 	Stage
         , 	ContractTerm
         , 	HIUnumber
         , 	todayDateTime
         , 	CloseDate
         , 	OrderSignedDate
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Opportunity.ExistingServices_Disconnection"() {
    (new uk.capgemini.controllers.Opportunity()).ExistingServices_Disconnection()
}


def static "uk.capgemini.controllers.Opportunity.ExistingServices_Replacement"() {
    (new uk.capgemini.controllers.Opportunity()).ExistingServices_Replacement()
}


def static "uk.capgemini.controllers.Opportunity.ExistingServices_Upgrade_Downgrade_Renewal"() {
    (new uk.capgemini.controllers.Opportunity()).ExistingServices_Upgrade_Downgrade_Renewal()
}


def static "uk.capgemini.controllers.Order.generateOrder"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Order()).generateOrder(
        	TC_Name)
}


def static "uk.capgemini.controllers.Order.manageOrder"(
    	String todayDate	
     , 	String CircuitId	
     , 	String OrderNumber	
     , 	String SI_Stage	
     , 	String ActualBilledDate	
     , 	String HIUNumber	
     , 	String NoofProducts	) {
    (new uk.capgemini.controllers.Order()).manageOrder(
        	todayDate
         , 	CircuitId
         , 	OrderNumber
         , 	SI_Stage
         , 	ActualBilledDate
         , 	HIUNumber
         , 	NoofProducts)
}


def static "uk.capgemini.controllers.Order.validateOppotunity"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Order()).validateOppotunity(
        	TC_Name)
}


def static "uk.capgemini.controllers.Quote.gotoQuote"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Quote()).gotoQuote(
        	TC_Name)
}


def static "uk.capgemini.controllers.Quote.gotoOpportunity"(
    	String TC_Name	) {
    (new uk.capgemini.controllers.Quote()).gotoOpportunity(
        	TC_Name)
}


def static "uk.capgemini.controllers.Quote.createContactroles"(
    	String Primary_contact1	
     , 	String Page_ContactRoles1	
     , 	String Primary_contact2	
     , 	String Page_ContactRoles2	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Quote()).createContactroles(
        	Primary_contact1
         , 	Page_ContactRoles1
         , 	Primary_contact2
         , 	Page_ContactRoles2
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Quote.uploadFile"(
    	String ChooseFileupload	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Quote()).uploadFile(
        	ChooseFileupload
         , 	TC_Name)
}


def static "uk.capgemini.controllers.Quote.changeStage"(
    	String Stage_ProposalAcceptance	
     , 	String TC_Name	) {
    (new uk.capgemini.controllers.Quote()).changeStage(
        	Stage_ProposalAcceptance
         , 	TC_Name)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}
