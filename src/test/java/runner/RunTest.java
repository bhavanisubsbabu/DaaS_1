package runner;

import baseFile.BaseFile;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/resources/Featurefiles" }, dryRun = false, strict = false, monochrome = true, format = {
		"pretty", "html:target/cucumber" }, glue = { "stepdefinations" }, tags = "@Regression")
public class RunTest extends BaseFile {

}