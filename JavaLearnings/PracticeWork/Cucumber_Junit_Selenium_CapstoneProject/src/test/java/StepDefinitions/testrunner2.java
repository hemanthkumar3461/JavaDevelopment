package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features", // Error
glue= {"StepDefinitions"},
monochrome=true)
public class testrunner2 {

}
