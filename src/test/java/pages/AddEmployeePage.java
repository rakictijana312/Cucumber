package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.mobile.AddNetworkConnection;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id="employeeId")
    public WebElement employeeId;

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    @FindBy(id="chkLogin")
    public WebElement createLoginCheckBox;

    @FindBy(id="user_name")
    public WebElement usernamecreate;

    @FindBy(id="user_password")
    public WebElement userpassword;

    @FindBy(id="re_password")
    public WebElement repassword;



    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}