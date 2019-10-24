package paginas;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/index",
        glue = "paginas",
		tags = {"@executar,@naoExecutar332"}
        
)
public class IndexTestSuite {}
