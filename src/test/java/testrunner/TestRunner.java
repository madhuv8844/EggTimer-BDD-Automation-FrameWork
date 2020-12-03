package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/mastan/Desktop/EggTimer-Maersk/Features/EggTimer.feature",
        glue= "stepdefinitions"

)
public class TestRunner {
}
