package FaceBookExcel.FacebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBRegisterPage {
	static WebDriver driver;

	@FindBy(id = "u_0_2")
	private WebElement txtFirstName;

	@FindBy(id = "u_0_4")
	private WebElement txtLastName;
	
	@FindBy(id = "u_0_7")
	private WebElement txtEmail;
	
	@FindBy(id = "u_0_9")
	private WebElement txtReEmail;
	
	@FindBy(id = "u_0_e")
	private WebElement txtPassword;
	
	@FindBy(id = "day")
	private WebElement dpdDay;
	
	@FindBy(id = "month")
	private WebElement dpdMonth;
	
	@FindBy(id = "year")
	private WebElement dpdYear;
	
	//@FindBy(name = "sex")
	//private WebElement chkGender;	
	
	@FindBy(xpath = "//label[@class = '_58mt']")
	private WebElement chkGender;
	@FindBy(id = "u_0_m")
	private WebElement btnCreateAccount;	
	
	
	public FBRegisterPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public void setTxtLastName(WebElement txtLastName) {
		this.txtLastName = txtLastName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtReEmail() {
		return txtReEmail;
	}

	public void setTxtReEmail(WebElement txtReEmail) {
		this.txtReEmail = txtReEmail;
	}	
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getDpdDay() {
		return dpdDay;
	}

	public void setDpdDay(WebElement dpdDay) {
		this.dpdDay = dpdDay;
	}

	public WebElement getDpdMonth() {
		return dpdMonth;
	}

	public void setDpdMonth(WebElement dpdMonth) {
		this.dpdMonth = dpdMonth;
	}

	public WebElement getDpdYear() {
		return dpdYear;
	}

	public void setDpdYear(WebElement dpdYear) {
		this.dpdYear = dpdYear;
	}

	public WebElement getChkGender() {
		return chkGender;
	}

	public void setChkGender(WebElement chkGender) {
		this.chkGender = chkGender;
	}

	public WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}

	public void setBtnCreateAccount(WebElement btnCreateAccount) {
		this.btnCreateAccount = btnCreateAccount;
	}
	
	
	

}
