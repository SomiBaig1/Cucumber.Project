package steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.ConfigFileReader;
import utils.WebDriverUtils;

public class LoginSteps extends WebDriverUtils {
   // LoginPage loginPage=new LoginPage();
    @Given("Login Page is loaded")
    public void login_page_is_loaded() {
        launchBrowser(ConfigFileReader.getPropertyV("url"));

    }
    @When("user Enters valid UserName")
    public void user_enters_valid_user_name() {
       // LoginPage loginPage=new LoginPage();
        String userName=ConfigFileReader.getPropertyV("userName");
       // webDriver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
        loginPage.userNameTextBox.sendKeys(userName);
    }
    @When("user Enters valid Password")
    public void user_enters_valid_password() {
       // LoginPage loginPage=new LoginPage();
        String Password=ConfigFileReader.getPropertyV("Password");
     //   webDriver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Password);
        loginPage.passwordTextBox.sendKeys(Password);
    }
    @When("user clicks on the login Button")
    public void user_clicks_on_the_login_button() {
       // LoginPage loginPage=new LoginPage();
     //   webDriver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        loginPage.loginBtn.click();
    }
    @Then("verify user is logged in")
    public void verify_user_is_logged_in() {
      //  LoginPage loginPage=new LoginPage();
        boolean isDisplayed = webDriver.findElement(By.xpath("//b[normalize-space()='Dashboard']")).isDisplayed();
        Assert.assertTrue(isDisplayed);
        closeWebDriver();
    }

    @When("user Enters invalid UserName")
    public void userEntersInvalidUserName() {
        //LoginPage loginPage=new LoginPage();
       // webDriver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("");
        loginPage.userNameTextBox.sendKeys("");
    }

    @Then("verify user Gets the error msg")
    public void verifyUserGetsTheErrorMsg() {
       // LoginPage loginPage=new LoginPage();
      // String actual= webDriver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
         String actual =loginPage.loginErrorMsg.getText();
       String expected="User cannot be empty";
        Assert.assertEquals("Error msg was not same",actual,expected);
    }
}
