package com.jikkosoft.wappi.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/order.feature",
        glue = {"com.jikkosoft.wappi.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class Order {
}
