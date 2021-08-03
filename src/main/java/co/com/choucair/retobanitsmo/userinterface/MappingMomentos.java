package co.com.choucair.retobanitsmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MappingMomentos {
    public static final Target DESCUBRE = Target.the("Button that we go to the next page")
            .located(By.xpath("//a[@href='/wps/portal/banistmo/personas/campanas/momentos-de-bienestar']"));
    public static final Target VER_MAS = Target.the("Button that we go to the next page")
            .located(By.xpath("//a[@href='/wps/wcm/connect/www.banistmo.com11237/7d31e71b-4af5-4d1b-8b20-3c1e5d792118/MOMENTOS+DE+BIENESTAR2_Cuarentena+para+uno.pdf?MOD=AJPERES&CVID=n7E6gJt']"));

}
