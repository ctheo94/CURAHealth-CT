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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURAMakeAppointment/combobox_ChooseFacility'), facilityName, 
    false)

if (isReadmission == 'Yes') {
    WebUI.click(findTestObject('Object Repository/Page_CURAMakeAppointment/chkbox_HospitalReadmission'))
}

switch (programName) {
    case 'Medicaid':
        WebUI.click(findTestObject('Object Repository/Page_CURAMakeAppointment/input_Medicaid_programs'))

        break
    case 'Medicare':
        WebUI.click(findTestObject('Object Repository/Page_CURAMakeAppointment/input_Medicare_programs'))

        break
    default:
        WebUI.click(findTestObject('Object Repository/Page_CURAMakeAppointment/input_None_programs'))

        break
}

WebUI.setText(findTestObject('Object Repository/Page_CURAMakeAppointment/input_VisitDate'), visitDate)

WebUI.setText(findTestObject('Object Repository/Page_CURAMakeAppointment/textbox_Comment'), comment)

WebUI.click(findTestObject('Object Repository/Page_CURAMakeAppointment/button_BookAppointment'))

