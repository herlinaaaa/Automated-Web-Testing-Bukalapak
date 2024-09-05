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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Object Repository/Healthcare/Login/input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Healthcare/Login/input_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Healthcare/Login/button_Login'))

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/index.php#appointment')

WebUI.click(findTestObject('Healthcare/Appointment/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'))

WebUI.click(findTestObject('Healthcare/Appointment/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Healthcare/Appointment/input_Medicare_programs'))

WebUI.click(findTestObject('Healthcare/Appointment/input_Visit Date'))

WebUI.click(findTestObject('Healthcare/Appointment/td_6'))

WebUI.setText(findTestObject('Healthcare/Appointment/textarea_Comment'), 'test')

WebUI.click(findTestObject('Healthcare/Appointment/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Healthcare/Appointment/h2_Appointment Confirmation'), 'Appointment Confirmation')

