package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddEmployeePage;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;
import java.util.Map;


public class LoginSteps extends CommonMethods {

    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        LoginPage loginpage = new LoginPage();
        sendText(loginpage.usernamebox, ConfigReader.getPropertyValue("username"));
        sendText(loginpage.passwordbox, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        LoginPage loginpage = new LoginPage();
        click(loginpage.loginBtn);
    }

    //dodali smo assertion ovde i idu opozite nego kod testNg
    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        DashBoardPage dash = new DashBoardPage();
        //Assert.assertTrue(dash.welcomemessage.isDisplayed());
        String expected = "Welcome Admin";
        String actual = dash.welcomemessage.getText();
        Assert.assertEquals("Values do not match", expected, actual);
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        LoginPage loginpage = new LoginPage();
        sendText(loginpage.usernamebox, "johnny1234560000");
        sendText(loginpage.passwordbox, "Syntax1253!!!!");
    }

    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
        DashBoardPage dash = new DashBoardPage();
        Assert.assertTrue(dash.welcomemessage.isDisplayed());
    }

    @When("user enters valid username and invalid password")
    public void user_enters_valid_username_and_invalid_password() {
        LoginPage loginpage = new LoginPage();
        sendText(loginpage.usernamebox, "Admin");
        sendText(loginpage.passwordbox, "Syntax1253!!!!");
    }

    @Then("user see invalid credentials text on login page")
    public void user_see_invalid_credentials_text_on_login_page() {
        System.out.println("Error message is displayed");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        LoginPage loginPage = new LoginPage();
        sendText(loginPage.usernamebox, "username");
        sendText(loginPage.passwordbox, "password");
    }

    @When("{string} is successfully logged in")
    public void is_successfully_logged_in(String string) {
        System.out.println("working fine");
    }
        @When("user enters valid username and invalid pasword and verify error")
        public void user_enters_valid_username_and_invalid_pasword_and_verify_error(DataTable errordata) {
            List<Map<String, String>> employeeNames = errordata.asMaps();
            for (Map<String, String> employeename : employeeNames) {
                String usernamevalue = employeename.get("username");
                String passwordvalue = employeename.get("password");
                String errorvalue = employeename.get("errormessage");
                System.out.println(usernamevalue + " " + passwordvalue + " " + errorvalue);

                LoginPage loginPage=new LoginPage();
                sendText(loginPage.usernamebox, employeename.get("username"));
                sendText(loginPage.passwordbox, employeename.get("password"));
                click(loginPage.loginBtn);

                //assertions
                String actual=loginPage.errormessage.getText();
                Assert.assertEquals("values do not match", errorvalue, actual);
                System.out.println("my test case passed");

//                AddEmployeePage addEmployeePage = new AddEmployeePage();
//                sendText(addEmployeePage.firstName, firstnamevalue);
//                sendText(addEmployeePage.middleName, middlenamevalue);
//                sendText(addEmployeePage.lastName, lastnamevalue);
//                click(addEmployeePage.saveBtn);
        }}


            @When("user enters different {string} and {string} and verify the {string} for all combinations")
            public void user_enters_different_and_and_verify_the_for_all_combinations(String usernamevalue, String passwordvalue, String error) {
               LoginPage loginPage=new LoginPage();
               sendText(loginPage.usernamebox, usernamevalue);
               sendText(loginPage.passwordbox, passwordvalue);
               click(loginPage.loginBtn);

                String actual=loginPage.errormessage.getText();
                Assert.assertEquals("values not match", error, actual);


    }
}