package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.WebDriverUtils;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends WebDriverUtils {
    @And("user clicks PIM")
    public void userClicksPIM() {
       // webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
        dashBoardPage.pimBtn.click();
    }

    @And("user clicks addEmployee")
    public void userClicksAddEmployee() {
      //  webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
dashBoardPage.addEmployee.click();



    }

    @And("user enters {string} in firstName field")
    public void userEntersInFirstNameField(String arg0) {
        //webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(arg0);

        addEmployeePage.firstName.sendKeys(arg0);
    }

    @And("user enters {string} in lastName field")
    public void userEntersInLastNameField(String arg0) {
       // webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(arg0);

        addEmployeePage.lastName.sendKeys(arg0);
    }

    @And("user clicks on the save button")
    public void userClicksOnTheSaveButton() {
       // webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();

        addEmployeePage.saveBtn.click();
    }

    @Then("user verifies employee is added")
    public void userVerifiesEmployeeIsAdded() {
      // boolean isDisplayed= webDriver.findElement(By.xpath("//h1[normalize-space()='Personal Details']")).isDisplayed();
        boolean isDisplayed=personalDetailsPage.personalDetails.isDisplayed();
        Assert.assertTrue(isDisplayed);
        webDriver.close();

    }

    @And("user enter {string} {string} {string}")
    public void userEnter(String arg0, String arg1, String arg2) {
       /* webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(arg0);
        webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(arg1);
        webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(arg2);*/

        addEmployeePage.firstName.sendKeys(arg0);
        addEmployeePage.middleName.sendKeys(arg1);
        addEmployeePage.lastName.sendKeys(arg2);

    }

    @When("user clicks add Multiple Employees and verifies employee is added")
    public void user_clicks_add_multiple_employees_and_verifies_employee_is_added(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> listMap = dataTable.asMaps();
        for (Map<String, String> map : listMap) {
           /* webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("firstName"));
            webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("middleName"));
            webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("lastName"));
            webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();*/


            dashBoardPage.pimBtn.click();
            dashBoardPage.addEmployee.click();
            addEmployeePage.firstName.sendKeys(map.get("firstName"));
            addEmployeePage.middleName.sendKeys(map.get("middleName"));
            addEmployeePage.lastName.sendKeys(map.get("lastName"));
            addEmployeePage.saveBtn.click();

        }
        closeWebDriver();
    }



}
