package com.choucair.certification.reto.questions;

import com.choucair.certification.reto.userinterface.ChoucairPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {
    public static Answer Tothe() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        if(ChoucairPage.BANNER.isVisibleFor(actor)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
