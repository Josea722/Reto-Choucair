package com.choucair.certification.reto.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/choucairEmpleos.feature",
        tags = "@Regression",
        glue = {"com.choucair.certification.reto.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerTags {
}
