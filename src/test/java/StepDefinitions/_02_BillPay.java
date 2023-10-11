package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _02_BillPay {
    DialogContent dialogContent = new DialogContent();

    @And("Navigate to Bill Pay Page")
    public void navigateToBillPayPage() {
        dialogContent.clickMethod(dialogContent.billPayButton);
    }

    @And("User fills the form for {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void userFillsTheFormForAnd(String payeeName, String address, String city, String state, String zipCode, String phone, String account, String accountVerify, String amount) {
        dialogContent.sendKeysMethod(dialogContent.payeeNameInbox,payeeName);
        dialogContent.sendKeysMethod(dialogContent.payeeAddressInbox,address);
        dialogContent.sendKeysMethod(dialogContent.payeeCityInbox,city);
        dialogContent.sendKeysMethod(dialogContent.payeeStateInbox,state);
        dialogContent.sendKeysMethod(dialogContent.payeeZipInbox,zipCode);
        dialogContent.sendKeysMethod(dialogContent.payeePhoneInbox,phone);
        dialogContent.sendKeysMethod(dialogContent.payeeAccountNumberInbox,account);
        dialogContent.sendKeysMethod(dialogContent.payeeAccountNumberVerifyInbox,accountVerify);
        dialogContent.sendKeysMethod(dialogContent.payeeAmount,amount);
    }

    @When("Click on Send Payment button")
    public void clickOnSendPaymentButton() {
        dialogContent.clickMethod(dialogContent.sendPaymentButton);
    }

    @Then("User should be able to pay the bill")
    public void userShouldBeAbleToPayTheBill() {
        Assert.assertTrue(dialogContent.billSuccessMessage.isDisplayed());
    }
}
