package com.jikkosoft.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.jikkosoft.wappi.userinterfaces.WappiPersonalInformation.NAME_REQUIRED_FIELD;

public class TheMessageName implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(NAME_REQUIRED_FIELD).viewedBy(actor).asString();
    }

}