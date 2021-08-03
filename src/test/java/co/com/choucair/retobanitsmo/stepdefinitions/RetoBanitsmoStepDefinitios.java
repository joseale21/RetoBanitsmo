package co.com.choucair.retobanitsmo.stepdefinitions;

import co.com.choucair.retobanitsmo.questions.Answer;
import co.com.choucair.retobanitsmo.tasks.OpenUp;
import co.com.choucair.retobanitsmo.tasks.SearchDocument;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RetoBanitsmoStepDefinitios {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Dante wants read a specific pdf documents he enters the Banitsmo page$")
    public void thatDanteWantsReadASpecificPdfDocumentsHeEntersTheBanitsmoPage() {
        theActorCalled("Dante").wasAbleTo(OpenUp.thePage());
    }


    @When("^he searched for the pdf document and read it$")
    public void heSearchedForThePdfDocumentAndReadIt() {
        theActorInTheSpotlight().attemptsTo(SearchDocument.onThePage());
    }

    @Then("^he verified that it is (.*) pdf document$")
    public void heVerifiedThatItIsPJAutocertificacionUnificado(String question) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


}
