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

WebUI.callTestCase(findTestCase('Component/Browser Related/Start Browser and Head to URL'), [:], FailureHandling.STOP_ON_FAILURE)

'Login with invalid username but valid password'
WebUI.callTestCase(findTestCase('Component/Common/Login'), [('username') : findTestData('TestData').getValue(1, 3), ('password') : findTestData(
            'TestData').getValue(2, 3)], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURAHealth_Login/label_Login failed Please ensure the username and password'), 
    'Login failed! Please ensure the username and password are valid.')

'Login with valid username but unvalid password'
WebUI.callTestCase(findTestCase('Component/Common/Login'), [('username') : findTestData('TestData').getValue(1, 4), ('password') : findTestData(
            'TestData').getValue(2, 4)], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURAHealth_Login/label_Login failed Please ensure the username and password'), 
    'Login failed! Please ensure the username and password are valid.')

WebUI.callTestCase(findTestCase('Component/Browser Related/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)
