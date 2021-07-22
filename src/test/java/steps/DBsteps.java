package steps;

import io.cucumber.java.en.Then;
import utils.DbUtils;
import utils.GlobalVariables;

import java.util.List;
import java.util.Map;

public class DBsteps {

    @Then("query the HRMS database")
    public void query_the_hrms_database() {

        String query="select emp_firstname, emp_middle_name,emp_lastname " +
                                "from hs_hr_employees where emp_number="+ GlobalVariables.empId;

    List<Map<String, String>> tableDataAsList= DbUtils.getTableDataAsList(query);
    GlobalVariables.dbFirstname=tableDataAsList.get(0).get("emp_firstname");
    GlobalVariables.dbMiddlename=tableDataAsList.get(0).get("emp_middle_name");
    GlobalVariables.dbLastname=tableDataAsList.get(0).get("emp_lastname");




    }
}
