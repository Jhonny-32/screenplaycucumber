package co.com.screenplay.cucumberproject.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {
    public static final Target LBL_PRODUCT = Target.the("displays the word Products")
            .located(By.xpath("//span[contains(text(),'Products')]"));

}
