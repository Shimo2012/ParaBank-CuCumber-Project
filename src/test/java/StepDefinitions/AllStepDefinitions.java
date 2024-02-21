package StepDefinitions;

import Pages.LocatorPage;
import Utilities.DR;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllStepDefinitions extends DR {

    LocatorPage rp = new LocatorPage();


    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        driver.get("https://parabank.parasoft.com/");

    }

    @When("Click On The Element")
    public void clickOnTheElement() {
    }

    @Then("Enter Data in Text Box")
    public void enterDataInTextBox() {
    }

    @Then("Verification Is In Progress")
    public void verificationIsInProgress() {
    }
}