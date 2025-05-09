package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feature/login.feature",
        glue = {"Steps"},
        dryRun = true,
        plugin = {"pretty", "json:target/cucumberjson/report.json"}
)
public class TestRunner {
}
