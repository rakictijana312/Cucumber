package Runners;

//ovo dole .junit znaci da koristimo junit in cucumber
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//OVAJ NISMO UOPSTE KORISTILI
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",

        //glue is where we can find implementations for gherkin steps
        // we provide the path of package for STEPS
        glue = "steps",

        //if we set dry run to true, it will quickly scan all gherkin steps are implemented or not
        // if it is true, then no actual execution happens
        dryRun = false,

        //it means that the console output for the cucumber test is easily readable
        //it will remove unecesery / unreadable character
        monochrome = true, //uvek je=true, ne mora da se kroisti

        //if strict is set to true then at the time of execution if cucumber encounters any undefined
        //steps, it will give an error and stops execution. Also it gives code snippet for the
        //unimplemented steps
        // strict=true, //uvek je=true//ovako se precrtalo kad sam prvi put exicute code, nismo ga posle spominjai

        //tags will identify the scenarios based on the tags we will provide such as @smoke, @regression etc
        // we can add multiple tags in the runner class to execute scenarios belong to different tags such
        //as and or ,
        //ove usually coristimo tags = "@smoke or @regression or @production"
        tags= "@errorvalidation",

        plugin = {"pretty", "html:target/cucumber.html"}
)



public class RegressionRunner {
}
