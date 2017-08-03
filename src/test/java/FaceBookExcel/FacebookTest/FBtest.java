package FaceBookExcel.FacebookTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Base;
import FaceBookExcel.FacebookTest.*;
import FaceBookExcel.FacebookTest.FBRegisterPage;;

public class FBtest extends Base {
	static WebDriver driver;
	 Base base = new Base();
	FBRegisterPage registerpage;

	@BeforeClass
	public static void launchBrowser() {		
		driver = getBrowser();
	}

	@Test
	public void verifyRegistrationDetails() {
		registerpage = new FBRegisterPage(driver);
		// FirstName
		setText(registerpage.getTxtFirstName(), readValueFromExcelSheet()
				.get(1).get("FirstName"));
		// LastName
		setText(registerpage.getTxtLastName(), readValueFromExcelSheet().get(1)
				.get("LastName"));
		// PhoneOrEmail
		setText(registerpage.getTxtEmail(), readValueFromExcelSheet().get(1)
				.get("Email"));
		// RePhoneOrEmail
				//setText(registerpage.getTxtReEmail(), readValueFromExcelSheet().get(1)
					//	.get("Email"));
		// Password
		setText(registerpage.getTxtPassword(), readValueFromExcelSheet().get(1)
				.get("Password"));

		//dropDownSelectByVText(registerpage.getDpdDay(), readValueFromExcelSheet().get(1).get("Day"));
		//dropDownSelect(registerpage.getDpdMonth(), readValueFromExcelSheet().get(1).get("Month"));
		//dropDownSelectByVText(registerpage.getDpdYear(), readValueFromExcelSheet().get(1).get("Year"));
		
		dropDownSelectByVText(registerpage.getDpdDay(),"1");
		dropDownSelectByVText(registerpage.getDpdMonth(),"Jan");
		dropDownSelectByVText(registerpage.getDpdYear(), "1992");
		
		if(readValueFromExcelSheet().get(1).get("Gender").equals("Male") || readValueFromExcelSheet().get(1).get("Gender").equals("Female"))
		{
		clickBtn(registerpage.getChkGender());
		}
		
		clickBtn(registerpage.getBtnCreateAccount());
		getScreenShot("after login");
		System.out.println("Success");

	}

	@AfterClass
	public static void closeBrowser() {
		// driver.quit();

	}
}
