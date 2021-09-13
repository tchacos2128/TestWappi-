package com.jikkosoft.wappi.stepdefinitions;

import com.jikkosoft.wappi.questions.MyOrders;
import com.jikkosoft.wappi.tasks.PerformAnOrder;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class OrderStepDefinition {

    @When("^I order \"([^\"]*)\"$")
    public void iOrder(String item) {
        theActorInTheSpotlight().attemptsTo(PerformAnOrder.of(item));
    }

    @Then("^I should see \"([^\"]*)\" in my orders$")
    public void iShouldSeeInMyOrders(String item) {
        theActorInTheSpotlight().should(seeThat(MyOrders.has(), equalTo(item)));
    }
}
