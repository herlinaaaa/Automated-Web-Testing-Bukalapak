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

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.click(findTestObject('Bukalapak/Login/p_Login'))

WebUI.click(findTestObject('Object Repository/Bukalapak/Login/div_Nomor handphone atau email'))

WebUI.setText(findTestObject('Object Repository/Bukalapak/Login/input_Nomor handphone atau email_LoginID'), 'xevanapaul@gmail.com')

WebUI.click(findTestObject('Object Repository/Bukalapak/Login/button_Lanjut'))

WebUI.setEncryptedText(findTestObject('Object Repository/Bukalapak/Login/input_Lanjut_Password'), 'HwhOXXM/Zyo=')

WebUI.click(findTestObject('Object Repository/Bukalapak/Login/button_Login'))

WebUI.click(findTestObject('Bukalapak/Search/input_BukaBantuan_searchkeywords'))

WebUI.setText(findTestObject('Bukalapak/Search/input_BukaBantuan_searchkeywords'), 'jam tangan pink')

WebUI.click(findTestObject('Bukalapak/Search/button_BukaBantuan_v-omnisearch__submit'))

WebUI.mouseOver(findTestObject('Bukalapak/Check Out/Product/img_Asuransi_bl-thumbnail--img'))

WebUI.click(findTestObject('Bukalapak/Check Out/Product/img_Asuransi_bl-thumbnail--img'))

WebUI.click(findTestObject('Bukalapak/Check Out/Page_Product/button_Beli Sekarang'))

WebUI.click(findTestObject('Bukalapak/Check Out/Payment/button_Pilih metode bayar'))

WebUI.click(findTestObject('Bukalapak/Check Out/Payment/input_Pembayaran_payment-category'))

