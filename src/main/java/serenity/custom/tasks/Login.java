package serenity.custom.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import com.ztna.login.models.LoginParameters;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Login  {

    String email;
    String password;
    public Login() {

    }

    public static Task using(LoginParameters L) {

        return Task.where("{0} tires to Sign In",

                Enter.keyValues(L.emailAddress).into("//input[@name='email']"),
                Enter.keyValues(L.password).into("//input[@name='password']"),
                Click.on("//button[.//span[.='Sign in']]"),
                WaitUntil.the("//span[.='Users']", isPresent())

        );

    }


}
