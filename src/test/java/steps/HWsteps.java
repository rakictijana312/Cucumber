package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeListPage;
import utils.CommonMethods;

public class HWsteps extends CommonMethods {

    @When("user enters first name {string} and click on search button")
    public void user_enters_first_name_and_click_on_search_button(String firstname) throws InterruptedException {
        EmployeeListPage employeeListPage=new EmployeeListPage();
        Thread.sleep(2000);
        sendText(employeeListPage.employeeenameFild, firstname);
        click(employeeListPage.searchButton);
        Thread.sleep(2000);

    }

    @When("user clicks on employee name and clicks on edit button")
    public void user_clicks_on_employee_name_and_clicks_on_save_button() throws InterruptedException {
        EmployeeListPage employeeListPage=new EmployeeListPage();
        click(employeeListPage.employeeName);
        Thread.sleep(2000);
        click(employeeListPage.editButton);

    }
    @When("user changes firstname to {string} and clicks on save button")
    public void user_changes_firstname_to_and_clicks_on_save_button(String newfirstname) throws InterruptedException {
        EmployeeListPage employeeListPage=new EmployeeListPage();
        employeeListPage.FirstName.clear();
        Thread.sleep(2000);
        sendText(employeeListPage.FirstName, newfirstname);
        click(employeeListPage.saveButton);
    }
    @Then("user is able to successfully modify employee details")
    public void user_is_able_to_successfully_modify_employee_details() {
        System.out.println("Employee detail is sucessfully modified");
    }
















}
