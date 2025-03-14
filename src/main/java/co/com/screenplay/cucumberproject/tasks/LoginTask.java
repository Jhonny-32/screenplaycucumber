package co.com.screenplay.cucumberproject.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.cucumberproject.ui.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    @Step("{0} enter username #username and password #password")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IPT_USERNAME,isVisible()),
                Enter.theValue(username).into(IPT_USERNAME),
                Enter.theValue(password).into(IPT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask enterCredentials(String username, String password){
        return Tasks.instrumented(LoginTask.class, username, password);
    }

}
