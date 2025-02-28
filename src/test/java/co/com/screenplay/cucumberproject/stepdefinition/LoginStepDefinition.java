package co.com.screenplay.cucumberproject.stepdefinition;

import co.com.screenplay.cucumberproject.questions.ValidateTextLabelQuestion;
import co.com.screenplay.cucumberproject.questions.ValidateTextTargetQuestion;
import co.com.screenplay.cucumberproject.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.cucumberproject.ui.LoginUI.LBL_ERROR_LOGIN;
import static co.com.screenplay.cucumberproject.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.ensure.Ensure.that;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("enter {string} and {string}")
    public void enterUsernameAndPassword(String username, String password){
        theActorCalled(ACTOR).attemptsTo(
                LoginTask.enterCredentials(username,password)
        );
    }
    @Then("visualize the word {string}")
    public void visualizeTheWord(String productLbl){
        theActorInTheSpotlight().should(
                seeThat(ValidateTextLabelQuestion.validateText(),equalTo(productLbl))
        );
    }

    @Then("following message is displayed {string}")
    public void followingMessageIsDislayed(String message){
        theActorInTheSpotlight().should(
                seeThat(ValidateTextTargetQuestion.validateTextTarget(LBL_ERROR_LOGIN), containsString(message))
        );
    }



}
