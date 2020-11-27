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

WebUI.openBrowser('https://platform.kata.ai/login')

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_Kata Platform/input_Create your free account_username'), 'abilaTest')

WebUI.setText(findTestObject('Object Repository/Page_Kata Platform/input_Create your free account_email'), 'rachmadhany@mailinator.com')

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/div_Professional_sc-AxjAm eZoZgv'))

WebUI.setText(findTestObject('Object Repository/Page_Kata Platform/input_Student_company'), 'testCompany')

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/img_Click verify once there are none left_r_1e3bc3'))

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/img_Click verify once there are none left_r_1e3bc3'))

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/img_Click verify once there are none left_r_1e3bc3'))

WebUI.click(findTestObject('Object Repository/Page_Kata Platform/button_Verify'))

WebUI.closeBrowser()

