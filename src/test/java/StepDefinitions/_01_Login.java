package StepDefinitions;

import Pages.DialogContent;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.Param;
import org.testng.Assert;

import java.awt.*;

public class _01_Login {
    // NewProject5 has register test. First run that and then login feauture

    DialogContent dialogContent = new DialogContent();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        ParameterDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Enter {string} as username and {string} as password")
    public void enterAsUsernameAndAsPassword(String username, String password) {
        dialogContent.sendKeysMethod(dialogContent.usernameInbox, username);
        dialogContent.sendKeysMethod(dialogContent.passwordInbox, password);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        dialogContent.clickMethod(dialogContent.loginButton);
    }

    @Then("They should be {string}")
    public void theyShouldBe(String loginStatus) {
        if (loginStatus.equalsIgnoreCase("successful")) {
            Assert.assertTrue(dialogContent.successMessage.isDisplayed());
        } else {
            Assert.assertTrue(dialogContent.errorMessage.getText().contains("Error"));
        }
    }
}
