package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\EpicMain\\src\\main\\java\\Feature\\FeatureFile.feature", //the path of the feature files
		glue={"StepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout"},
		dryRun = false,
		monochrome = true,
		strict = true
		)
public class TestRunner {

}
