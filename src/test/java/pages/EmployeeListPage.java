package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;



public class EmployeeListPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement idEmployee;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    //add employee/enter first name
    @FindBy(id="empsearch_employee_name_empName")
    public  WebElement employeeenameFild;

    @FindBy(xpath="//div[@id='tableWrapper']/table/tbody/tr/td[3]")
    public WebElement employeeName;

    @FindBy(id="btnSave")
    public WebElement editButton;

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement FirstName;

    @FindBy(id="btnSave")
    public WebElement saveButton;


    public EmployeeListPage(){
        PageFactory.initElements(driver, this);
    }




}
