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

WebUI.callTestCase(findTestCase('Component/Common/Login'), [('username') : findTestData('TestData').getValue(1, 1), ('password') : findTestData(
            'TestData').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

'First appointment'
WebUI.callTestCase(findTestCase('Component/Common/Make Appointment'), [('programName') : findTestData('TestData').getValue(
            3, 1), ('visitDate') : findTestData('TestData').getValue(4, 1), ('facilityName') : findTestData('TestData').getValue(
            5, 1), ('isReadmission') : findTestData('TestData').getValue(6, 1), ('comment') : findTestData('TestData').getValue(
            7, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Verify Appointment after Submitting'), [('programName') : findTestData(
            'TestData').getValue(3, 1), ('visitDate') : findTestData('TestData').getValue(4, 1), ('facilityName') : findTestData(
            'TestData').getValue(5, 1), ('isReadmission') : findTestData('TestData').getValue(6, 1), ('comment') : findTestData(
            'TestData').getValue(7, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Sidebar Navigator'), [('navigateTo') : 'History'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Verify History'), [('programName') : findTestData('TestData').getValue(
            3, 1), ('visitDate') : findTestData('TestData').getValue(4, 1), ('facilityName') : findTestData('TestData').getValue(
            5, 1), ('isReadmission') : findTestData('TestData').getValue(6, 1), ('comment') : findTestData('TestData').getValue(
            7, 1), ('occurence') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Sidebar Navigator'), [('navigateTo') : 'Home'], FailureHandling.STOP_ON_FAILURE)

'Second appointment'
WebUI.callTestCase(findTestCase('Component/Common/Make Appointment'), [('programName') : findTestData('TestData').getValue(
            3, 2), ('visitDate') : findTestData('TestData').getValue(4, 2), ('facilityName') : findTestData('TestData').getValue(
            5, 2), ('isReadmission') : findTestData('TestData').getValue(6, 2), ('comment') : findTestData('TestData').getValue(
            7, 2)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Verify Appointment after Submitting'), [('programName') : findTestData(
            'TestData').getValue(3, 2), ('visitDate') : findTestData('TestData').getValue(4, 2), ('facilityName') : findTestData(
            'TestData').getValue(5, 2), ('isReadmission') : findTestData('TestData').getValue(6, 2), ('comment') : findTestData(
            'TestData').getValue(7, 2)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Sidebar Navigator'), [('navigateTo') : 'History'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Verify History'), [('programName') : findTestData('TestData').getValue(
            3, 2), ('visitDate') : findTestData('TestData').getValue(4, 2), ('facilityName') : findTestData('TestData').getValue(
            5, 2), ('isReadmission') : findTestData('TestData').getValue(6, 2), ('comment') : findTestData('TestData').getValue(
            7, 2), ('occurence') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Common/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Component/Browser Related/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

