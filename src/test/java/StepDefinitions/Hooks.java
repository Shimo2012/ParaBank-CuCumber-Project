package StepDefinitions;

import Utilities.DR;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void beforeScenario() {
        System.out.println("Scenario is starting");
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) DR.getDriver());
            final byte[] byteImage = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", "screenshot name");
        }
        DR.quitDriver();
    }
}