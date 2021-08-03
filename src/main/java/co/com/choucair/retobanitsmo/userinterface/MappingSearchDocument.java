package co.com.choucair.retobanitsmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MappingSearchDocument {

    public static final Target APRENDER_ES_FACIL = Target.the("Button that we go to the next page")
            .located(By.xpath("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/']"));
    public static final Target DESCUBRE_MAS = Target.the("Button that show more info about Legales")
            .located(By.xpath("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/legales/']"));
    public static final Target CONOCE_MAS = Target.the("Button that show more info about Legales")
            .located(By.xpath("//a[@title='ENSA']"));
    public static final Target DESCARGAR = Target.the("Button that show the pdf document")
            .located(By.xpath("//a[@href='/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-']"));
}
