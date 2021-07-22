#homework - admin user should be able to modify the details of the employee
  Feature: modify the details of the employee as admin

    @example
    Scenario:
      And user is logged in with valid admin credentials
      And user navigates to employee list page
      When user enters first name "Tijana" and click on search button
      And user clicks on employee name and clicks on edit button
      And user changes firstname to "Rakic" and clicks on save button
      Then user is able to successfully modify employee details


