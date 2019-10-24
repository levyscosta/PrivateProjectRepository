package blank;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/blankToTest",
        glue = "blank",
		tags = {"@executar1234,@naoExecutar332"}
        
)
public class BlankTestSuite {}
