package FaceBookExcel.FacebookTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Base;
import utility.ReportJunit;
import FaceBookExcel.FacebookTest.*;

public class FBtest extends ReportJunit  {
	static WebDriver driver;
	 //Base base = new Base();
	FBRegisterPage registerpage;

	@BeforeClass
	public static void launchBrowser() {		
		driver = Base.getBrowser();
	}

	@Test
	public void verifyRegistrationDetails() {
		registerpage = new FBRegisterPage(driver);
		// FirstName
		Base.setText(registerpage.getTxtFirstName(), Base.readValueFromExcelSheet()
				.get(1).get("FirstName"));
		// LastName
		Base.setText(registerpage.getTxtLastName(), Base.readValueFromExcelSheet().get(1)
				.get("LastName"));
		// PhoneOrEmail
		Base.setText(registerpage.getTxtEmail(),Base.readValueFromExcelSheet().get(1)
				.get("Email"));
		// RePhoneOrEmail
				//setText(registerpage.getTxtReEmail(), readValueFromExcelSheet().get(1)
					//	.get("Email"));
		// Password
		Base.setText(registerpage.getTxtPassword(), Base.readValueFromExcelSheet().get(1)
				.get("Password"));

		//dropDownSelectByVText(registerpage.getDpdDay(), readValueFromExcelSheet().get(1).get("Day"));
		//dropDownSelect(registerpage.getDpdMonth(), readValueFromExcelSheet().get(1).get("Month"));
		//dropDownSelectByVText(registerpage.getDpdYear(), readValueFromExcelSheet().get(1).get("Year"));
		
		Base.dropDownSelectByVText(registerpage.getDpdDay(),"1");
		Base.dropDownSelectByVText(registerpage.getDpdMonth(),"Jan");
		Base.dropDownSelectByVText(registerpage.getDpdYear(), "1992");
		
		if(Base.readValueFromExcelSheet().get(1).get("Gender").equals("Male") || Base.readValueFromExcelSheet().get(1).get("Gender").equals("Female"))
		{
			Base.clickBtn(registerpage.getChkGender());
		}
		
		Base.clickBtn(registerpage.getBtnCreateAccount());
		Base.getScreenShot("after login");
		System.out.println("Success");

	}

	@AfterClass
	public static void closeBrowser() {
		// driver.quit();

	}
}
