package com.ztna.steps.Login;

import com.ztna.hooks.SoftAssertionsHook;
import com.google.gson.JsonObject;
import com.ztna.login.models.LoginParameters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import org.assertj.core.api.SoftAssertions;
import serenity.custom.tasks.Login;

import static indexed.pojo.model.IndexedPojoDeserializer.deserializeJsonTo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    LoginParameters loginParameters;
    SoftAssertions softAssertions = SoftAssertionsHook.softAssertions;


    @Given("user is on login page")
    public void userIsOnLoginPage() {
       theActorInTheSpotlight().attemptsTo(Open.url("https://ztna-admin:Ztnarocks05,.@qa.ztmesh.io/login"));
    }

    @When("user tries to login using {jsonTestData}")
    public void whenUserLogins(JsonObject parameter) {

     loginParameters = deserializeJsonTo(parameter, LoginParameters.class);

     theActorInTheSpotlight().attemptsTo(Login.using(loginParameters));

    }

    @Then("user should see that he is logged in")
    public void userLoggedIn() {
//        theActorInTheSpotlight().should(
//                seeThat(the("//tr[contains(@id, 'en-ztna-TableRow')][.//td[contains(@id, 'RowCell-role')][.='Admin']]//td[contains(@id, 'RowCell-email')]//span"), containsText(email))
//        );
    }
}
