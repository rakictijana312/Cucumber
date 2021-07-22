package Runners;
//ovo dole .junit znaci da koristimo junit in cucumber
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



//NE  RADIIIIIIIII

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt",
        //glue is where we can find implementations for gherkin steps
        // we provide the path of package for steps
        glue = "steps",
        //if we set dry run to true, it will quickly scan all gherkin steps are implemented or not
        // if it is true, then no actual execution happens
        dryRun = false,
        //it means that the console output for the cucumber test is easily readable
        //it will remove unreadable character
        monochrome = true,
        //if strict is set to true then at the time of execution if cucumber encounters any undefined
        //steps, it will give an error and stops execution. Also it gives code snippet for the
        //unimplemented steps

        // tags = "@regression",
        //tags will identify the scenarios based on the tags we will provide such as @smoke, @regression etc
        // we can add multiple tags in the runner class to execute scenarios belong to different tags such
        //as and or ,
        plugin = {"pretty"}
)



public class FailedRunner {
}
