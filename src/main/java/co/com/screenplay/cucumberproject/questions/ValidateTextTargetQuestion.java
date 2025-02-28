package co.com.screenplay.cucumberproject.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateTextTargetQuestion implements Question<String> {

    Target target;

    public ValidateTextTargetQuestion(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible())
        );
        return target.resolveFor(actor).getText();
    }

    public static ValidateTextTargetQuestion validateTextTarget(Target target) {
        return new ValidateTextTargetQuestion(target);
    }
}
