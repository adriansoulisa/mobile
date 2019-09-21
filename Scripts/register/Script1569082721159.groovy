import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\IT181102\\Downloads\\APK-Demo\\id.co.myhomecredit_2019-09-18.apk', true)

Mobile.tap(findTestObject('Component/android.widget.TextView2 - Sudah punya akun Log In Sekarang'), 0)

Mobile.tap(findTestObject('Component/android.widget.TextView3 - Belum punya akun Daftar sekarang'), 0)

Mobile.tap(findTestObject('Component/android.widget.TextView1 - Tanggal Lahir'), 0)

Mobile.setText(findTestObject('Component/android.widget.EditText0 - Sep'), 'Apr', 0)

Mobile.tap(findTestObject('Component/android.widget.EditText2 - 2000'), 0)

Mobile.tap(findTestObject('Component/android.widget.Button7 - OK'), 0)

Mobile.setText(findTestObject('Component/android.widget.EditText0 - Masukkan No. Handphone Anda'), '87781822534', 0)

Mobile.setText(findTestObject('Component/android.widget.EditText1 - Tentukan Kode PIN (4 Digit)'), '0104', 0)

Mobile.setText(findTestObject('Component/android.widget.EditText2 - Konfirmasi Kode PIN'), '0104', 0)

Mobile.tap(findTestObject('Component/android.widget.Button0 - LANJUTKAN'), 0)

Mobile.tap(findTestObject('Component/android.widget.TextView1 - Saya Setuju'), 0)

Mobile.setText(findTestObject('Component/android.widget.EditText0'), '4380', 0)

Mobile.tap(findTestObject('Component/android.widget.Button0 - DAFTAR'), 0)

Mobile.tap(findTestObject('Component/android.widget.Button0 - OK'), 0)

Mobile.closeApplication()

