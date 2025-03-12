package co.com.screenplay.cucumberproject.tasks;

import co.com.screenplay.cucumberproject.utils.RandomNumber;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.screenplay.cucumberproject.ui.HomeUI.LBL_ALL_PRODUCTS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class ChooseProductTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> elementFacadeList = LBL_ALL_PRODUCTS.resolveAllFor(actor);
        int number = RandomNumber.randomNumberSearch(elementFacadeList.size());
        actor.attemptsTo(
                WaitUntil.the(LBL_ALL_PRODUCTS, isVisible()),
                Click.on(elementFacadeList.get(number))
        );
    }

    public static ChooseProductTask chooseProduct(){
        return Tasks.instrumented(ChooseProductTask.class);
    }

}
