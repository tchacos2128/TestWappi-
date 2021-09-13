package com.jikkosoft.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.jikkosoft.wappi.userinterfaces.WappiPersonalInformation.BIRTH_DATE_REQUIRED_FIELD;

public class TheMessageBirthDate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BIRTH_DATE_REQUIRED_FIELD).viewedBy(actor).asString();
    }
}
