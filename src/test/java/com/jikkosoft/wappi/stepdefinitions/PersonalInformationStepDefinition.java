package com.jikkosoft.wappi.stepdefinitions;

import com.jikkosoft.wappi.tasks.Go;
import com.jikkosoft.wappi.tasks.Login;
import com.jikkosoft.wappi.tasks.PerformTheUpdateOfPersonalInformation;
import com.jikkosoft.wappi.utils.TheMessage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.jikkosoft.wappi.utils.SuitUrl.WAPPI;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PersonalInformationStepDefinition {

    /*@Managed(driver = "chrome")
        private WebDriver myBrowser;
        private Actor gloria = Actor.named("Gloria");
        @Before
        public  void setup(){
            gloria.can(BrowseTheWeb.with(myBrowser));
        }*/
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Gloria");
    }

    @Given("^I am authenticated in the app like \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAmAuthenticatedInTheAppLike(String userName,String pass) {
        theActorInTheSpotlight().wasAbleTo(Go.to(WAPPI));
        theActorInTheSpotlight().wasAbleTo(Login.like(userName,pass));
    }

    @When("^I want to update my personal with Name (.*) Last Name (.*) Birth Date (.*) and (.*)$")
    public void iWantToUpdateMyPersonalWithPepitoPerezColombia(String name, String lastName, String birthDate,String country) {
        theActorInTheSpotlight().attemptsTo(PerformTheUpdateOfPersonalInformation.with(name,lastName,birthDate,country));
    }

    @Then("^wappi should tell me that (.*)$")
    public void wappiShouldTellMeThat(String returnis) {
        theActorInTheSpotlight().should(seeThat(TheMessage.of(returnis), equalTo(returnis)));
    }
}
