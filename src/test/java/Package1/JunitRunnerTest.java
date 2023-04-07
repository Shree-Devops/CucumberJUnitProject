package Package1;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features", 
		glue="StepDefs",
//		tags ="@tag1",
	    tags = "@tag1 or @tag2", // OR execute one of these tags
//	    tags = "@tag1 and @tag2", // AND execute both of these tags
//	    tags ="~@tag1", // exclude these tags
//	    dryRun = true,// will check if there is there is a function for each step in feature file
	    monochrome =true, //to remove unreadable characters in the console output during execution e.g. [32mGiven [0m[32mI am on the homepage[0m
	    plugin={"html:target/htmlReport.html", "json:target/jsonReport.json", 
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    		"rerun:target/failed_scenarios.txt"} // to specify formatting options for the output reports in the mentioned location
	    //format = {"html:format"} // pretty - will show pass in green and fail steps in red
		)

public class JunitRunnerTest {
}