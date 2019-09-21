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

Mobile.tap(findTestObject('login/android.widget.TextView2 - Sudah punya akun Log In Sekarang'), 0)

Mobile.setText(findTestObject('login/android.widget.EditText0 - 085885106710'), '85885106710', 0)

Mobile.setText(findTestObject('login/android.widget.EditText1 - Masukkan Kode PIN'), '0104', 0)

Mobile.tap(findTestObject('login/android.widget.Button0 - LOGIN'), 0)

Mobile.tap(findTestObject('login/android.widget.ImageView22'), 0)

Mobile.scrollToText('LOGOUT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('login/android.widget.TextView11 - LOG OUT'), 0)

Mobile.closeApplication()

