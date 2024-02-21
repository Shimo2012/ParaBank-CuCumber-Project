package Pages;

import Utilities.DR;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent {

    public LocatorPage() {
        PageFactory.initElements(DR.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()=\"Register\"]")
    private WebElement register;
    @FindBy(css = "input[id=\"customer.firstName\"]")
    private WebElement firstName;
    @FindBy(css = "input[id=\"customer.lastName\"]")
    private WebElement lastName;
    @FindBy(css = "input[id=\"customer.address.street\"]")
    private WebElement address;
    @FindBy(css = "input[id=\"customer.address.city\"]")
    private WebElement city;
    @FindBy(css = "input[id=\"customer.address.state\"]")
    private WebElement state;
    @FindBy(css = "id=\"customer.address.zipCode\"")
    private WebElement zipCode;
    @FindBy(css = "input[id=\"customer.phoneNumber\"]")
    private WebElement phone;
    @FindBy(css = "input[id=\"customer.ssn\"]")
    private WebElement ssn;
    @FindBy(css = "input[id=\"customer.username\"]")
    private WebElement userName;
    @FindBy(css = "input[id=\"customer.password\"]")
    private WebElement passWord;
    @FindBy(css = "input[id=\"repeatedPassword\"]")
    private WebElement confirmPassWord;
    @FindBy(css = "value=\"Register\"")
    private WebElement registerButton;
    @FindBy(xpath = "//h1[text()=\"Welcome Omar\"]")
    private WebElement welcomeMessage;

    public WebElement getRegister() {
        return register;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getZipCode() {
        return zipCode;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getSsn() {
        return ssn;
    }

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassWord() {
        return passWord;
    }

    public WebElement getConfirmPassWord() {
        return confirmPassWord;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getWelcomeMessage() {
        return welcomeMessage;
    }
}
