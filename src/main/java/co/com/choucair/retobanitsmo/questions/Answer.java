package co.com.choucair.retobanitsmo.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result= false;
        String verifyResult = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (verifyResult.contains(question)){
            result = true;
        }
        return result;
    }
}
