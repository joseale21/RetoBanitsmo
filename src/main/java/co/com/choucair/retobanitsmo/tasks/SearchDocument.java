package co.com.choucair.retobanitsmo.tasks;


import co.com.choucair.retobanitsmo.interactions.GoToWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.retobanitsmo.userinterface.MappingSearchDocument.*;

public class SearchDocument implements Task {
    public static SearchDocument onThePage() {
        return Tasks.instrumented(SearchDocument.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(APRENDER_ES_FACIL),
                Click.on(DESCUBRE_MAS),
                Click.on(CONOCE_MAS),
                Click.on(DESCARGAR),
                GoToWindow.number()

        );
    }
}
