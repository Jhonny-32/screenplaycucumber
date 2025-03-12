package co.com.screenplay.cucumberproject.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.cucumberproject.ui.HomeUI.LBL_PRODUCT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateTextLabelQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_PRODUCT, isVisible())
        );
        return LBL_PRODUCT.resolveFor(actor).getText();
    }

    public static ValidateTextLabelQuestion validateText() {
        return new ValidateTextLabelQuestion();
    }

}
