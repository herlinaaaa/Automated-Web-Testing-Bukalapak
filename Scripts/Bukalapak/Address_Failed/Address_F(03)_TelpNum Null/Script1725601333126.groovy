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

WebUI.click(findTestObject('Bukalapak/Address/div_Lihat semua pembelian_bl-avatar sigil-avatar'))

WebUI.click(findTestObject('Bukalapak/Address/a_Pengaturan Akun'))

WebUI.click(findTestObject('Bukalapak/Address/span_Alamat'))

WebUI.click(findTestObject('Bukalapak/Address/a_Tambah Alamat'))

WebUI.setText(findTestObject('Bukalapak/Address/input_Alamat Sebagai_title'), 'Rumah')

WebUI.setText(findTestObject('Bukalapak/Address/input_Nama Penerima_name'), 'Herlina Nikita')

WebUI.setText(findTestObject('Bukalapak/Address/input_No. Telepon_phone'), '')

WebUI.setText(findTestObject('Bukalapak/Address/input_To navigate, press the arrow keys_js-maps-search'), 'Jakarta Indonesia')

WebUI.click(findTestObject('Bukalapak/Address/li_Jakarta Indonesia'))

WebUI.click(findTestObject('Bukalapak/Address/button_Set Lokasi'))

WebUI.setText(findTestObject('Bukalapak/Address/textarea_Alamat Lengkap_address.address'), 'jalan jakarta')

WebUI.click(findTestObject('Bukalapak/Address/a_Simpan'))

WebUI.verifyElementText(findTestObject('Bukalapak/Address/div_Nomor Telepon harus diisi'), 'Nomor Telepon harus diisi.')