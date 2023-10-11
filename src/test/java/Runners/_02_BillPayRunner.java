package Runners;

import Utilities.ParameterDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions (
        features = "src/test/java/FutureFiles/_02_BillPay.feature",
        glue = "StepDefinitions",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)

public class _02_BillPayRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browser){
        ParameterDriver.setThreadDriverName(browser);
    }

}
