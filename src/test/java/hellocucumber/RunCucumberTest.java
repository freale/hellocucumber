package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/CucumberResult",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
        , features = ".\\src\\test\\resources\\hellocucumber"
        , glue = ""
        , monochrome = false
        , tags = {"@WithParams or @Fast"}
)
public class RunCucumberTest {

}
