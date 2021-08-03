package co.com.choucair.retobanitsmo.tasks;

import co.com.choucair.retobanitsmo.interactions.GoToWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.retobanitsmo.userinterface.MappingMomentos.*;
import static co.com.choucair.retobanitsmo.userinterface.MappingSearchDocument.*;


public class SearchMomentos implements Task {
    public static SearchMomentos onThePage() {
        return Tasks.instrumented(SearchMomentos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(APRENDER_ES_FACIL),
                Click.on(DESCUBRE),
                Click.on(VER_MAS),
                GoToWindow.number()

        );

    }
}
