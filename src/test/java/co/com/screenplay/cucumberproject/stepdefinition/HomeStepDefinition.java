package co.com.screenplay.cucumberproject.stepdefinition;

import co.com.screenplay.cucumberproject.questions.ValidateTextTargetQuestion;
import co.com.screenplay.cucumberproject.tasks.ChooseProductTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.cucumberproject.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class HomeStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("click on random product")
    public void clickOnRandomProduct(){
        theActorCalled(ACTOR).attemptsTo(
                ChooseProductTask.chooseProduct()
        );
    }
    @Then("should see the same product name")
    public void shouldSeeTheSameProductName(){
        System.out.println("Llegue sin problema");
    }
}
