package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {

    public DialogContent(){
        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }

    @FindBy (css = "input[name=\"username\"")
    public WebElement usernameInbox;

    @FindBy (css = "input[name=\"password\"]")
    public WebElement passwordInbox;

    @FindBy (css = "input[value=\"Log In\"]")
    public WebElement loginButton;

    @FindBy (xpath = "//h1[text()='Error!']")
    public WebElement errorMessage;

    @FindBy (xpath = "//h1[text()='Accounts Overview']")
    public WebElement successMessage;

    @FindBy (xpath = "//a[text()='Bill Pay']")
    public WebElement billPayButton;

    @FindBy (css = "input[name=\"payee.address.street\"]")
    public WebElement payeeAddressInbox;

    @FindBy (css = "input[name=\"payee.name\"]")
    public WebElement payeeNameInbox;

    @FindBy (css = "input[name=\"payee.address.city\"]")
    public WebElement payeeCityInbox;

    @FindBy (css = "input[name=\"payee.address.state\"]")
    public WebElement payeeStateInbox;

    @FindBy (css = "input[name=\"payee.address.zipCode\"]")
    public WebElement payeeZipInbox;

    @FindBy (css = "input[name=\"payee.phoneNumber\"]")
    public WebElement payeePhoneInbox;

    @FindBy (css = "input[name=\"payee.accountNumber\"]")
    public WebElement payeeAccountNumberInbox;

    @FindBy (css = "input[name=\"verifyAccount\"]")
    public WebElement payeeAccountNumberVerifyInbox;

    @FindBy (css = "input[name=\"amount\"]")
    public WebElement payeeAmount;

    @FindBy (css = "input[value=\"Send Payment\"]")
    public WebElement sendPaymentButton;

    @FindBy (xpath = "//p[text()='See Account Activity for more details.']")
    public WebElement billSuccessMessage;





}
