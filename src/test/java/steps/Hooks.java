package steps;
//we change this to cucumber it was before imput import io.unit.after
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        setUp();
    }

    @After
    public void end(Scenario scenario){
        byte[] pic;
        if(scenario.isFailed()) {
            pic = takeScreenshot("failed/" + scenario.getName());
        }else{
            pic=takeScreenshot("passed/" + scenario.getName());
        }
        scenario.attach(pic, "image/pmg", scenario.getName());



        tearDown();
    }
}