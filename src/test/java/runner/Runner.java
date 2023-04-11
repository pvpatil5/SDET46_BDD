package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions
(
		features = {"./src/test/java/features/Login.feature",},
		glue = {"stepdefination","hooks"}



		)

public class Runner extends AbstractTestNGCucumberTests
{

}
