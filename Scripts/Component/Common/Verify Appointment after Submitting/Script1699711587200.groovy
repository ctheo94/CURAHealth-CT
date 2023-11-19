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

WebUI.verifyMatch(facilityName, WebUI.getText(findTestObject('Page_CURAHealth_Appointment Verification/label_FacilityName')), 
    false)

WebUI.verifyMatch(isReadmission, WebUI.getText(findTestObject('Page_CURAHealth_Appointment Verification/label_ReadmissionStatus')), 
    false)

'To mitigate in case other tester did not put "None" in Test Data'
if (programName == '') {
    'Automation will automatically use "None" to verify Program Name field on Appointment Success page'
    WebUI.verifyMatch('None', WebUI.getText(findTestObject('Page_CURAHealth_Appointment Verification/label_ProgramName')), 
        false)
} else {
    'Else, if it found that programName contains string (e.g. Medicaid), it will use said string to compare'
    WebUI.verifyMatch(programName, WebUI.getText(findTestObject('Page_CURAHealth_Appointment Verification/label_ProgramName')), 
        false)
}

WebUI.verifyMatch(visitDate, WebUI.getText(findTestObject('Page_CURAHealth_Appointment Verification/label_VisitationDate')), 
    false)

WebUI.verifyMatch(comment, WebUI.getText(findTestObject('Page_CURAHealth_Appointment Verification/label_Comment')), false)

