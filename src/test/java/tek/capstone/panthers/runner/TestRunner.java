package tek.capstone.panthers.runner;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Seventheen",
        features = ("classpath:features"),
        glue="tek.capstone.panthers",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
        },
        snippets = CAMELCASE,
        monochrome = true)
public class TestRunner {
}
