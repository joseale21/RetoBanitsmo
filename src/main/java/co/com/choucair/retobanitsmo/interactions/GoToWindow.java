package co.com.choucair.retobanitsmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class GoToWindow implements Interaction {


    public static GoToWindow number() {
        return new GoToWindow();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> theWindows = driver.getWindowHandles();
        for (String currentWindow : theWindows){
            driver.switchTo().window(currentWindow);
        }
    }
}