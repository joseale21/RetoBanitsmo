package co.com.choucair.retobanitsmo.stepdefinitions;

import co.com.choucair.retobanitsmo.questions.AnswerMomentos;
import co.com.choucair.retobanitsmo.tasks.OpenUp;
import co.com.choucair.retobanitsmo.tasks.SearchMomentos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MomentosBienestarStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Dante wants download a specific pdf documents he enters the Banitsmo page$")
    public void thatDanteWantsDownloadASpecificPdfDocumentsHeEntersTheBanitsmoPage() {
        theActorCalled("Dante").wasAbleTo(OpenUp.thePage());
    }


    @When("^he searched for the pdf document and downloaded it$")
    public void heSearchedForThePdfDocumentAndDownloadedIt() {
        theActorInTheSpotlight().attemptsTo(SearchMomentos.onThePage());
    }


    @Then("^verified that it is (.*) pdf document$")
    public void verifiedThatItIsMOMENTOSDEBIENESTARPdfDocument(String question) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerMomentos.toThe(question)));
    }
}
