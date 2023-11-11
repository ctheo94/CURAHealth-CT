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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Wait until "Make Appointment button appears and click the button
WebUI.waitForElementVisible(findTestObject('Page_CURAHealth_Login/btn_Make Appointment'), GlobalVariable.longWait)

WebUI.click(findTestObject('Object Repository/Page_CURAHealth_Login/btn_Make Appointment'))

//Add delay to cater for page load or network speed
WebUI.delay(GlobalVariable.shortWait)

//Input username
WebUI.setText(findTestObject('Object Repository/Page_CURAHealth_Login/input_Username'), username)

//Input password
WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURAHealth_Login/input_Password'), password)

//Clicks Login button and wait until user succesfully login by verifying "Make Appointment" header title
WebUI.click(findTestObject('Object Repository/Page_CURAHealth_Login/btn_Login'))

