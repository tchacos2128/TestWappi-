package com.jikkosoft.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.jikkosoft.wappi.userinterfaces.WappiPersonalInformation.LASTNAME_REQUIRED_FIELD;

public class TheMessageLastName implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(LASTNAME_REQUIRED_FIELD).viewedBy(actor).asString();
    }
}
