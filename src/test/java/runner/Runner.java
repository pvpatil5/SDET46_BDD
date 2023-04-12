package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions
(
		features = {"./src/test/java/features/Login.feature",},
		glue = {"stepdefination","hooks"},
		dryRun = false,
		monochrome = true,
		tags = "@smoketest and @regressiontest",
		plugin = {"pretty","html:cucumberReport.html"}
		



		)

public class Runner extends AbstractTestNGCucumberTests
{

}
