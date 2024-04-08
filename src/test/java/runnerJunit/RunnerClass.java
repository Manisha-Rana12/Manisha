package runnerJunit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = {"C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\cucumber\\src\\test\\resources\\form1\\Form1.feature"},
    glue = ("stepDefination")
)

public class RunnerClass {

	
}
