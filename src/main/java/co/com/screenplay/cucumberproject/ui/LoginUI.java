package co.com.screenplay.cucumberproject.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {

    public static final Target IPT_USERNAME = Target.the("user login")
            .located(By.cssSelector("input#user-name"));
    public static final Target IPT_PASSWORD = Target.the("enter password")
            .located(By.cssSelector("input#password"));
    public static final Target BTN_LOGIN = Target.the("click login")
            .located(By.cssSelector("input#login-button"));
    public static final Target LBL_ERROR_LOGIN = Target.the("label error login")
            .located(By.cssSelector("h3[data-test='error']"));
}
