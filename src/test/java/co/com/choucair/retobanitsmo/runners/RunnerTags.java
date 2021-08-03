package co.com.choucair.retobanitsmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/retoBanitsmo.feature",
        tags = "@stories",
        glue = "co.com.choucair.retobanitsmo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {
}
