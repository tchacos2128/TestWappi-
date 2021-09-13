package com.jikkosoft.wappi.questions;

import com.jikkosoft.wappi.utils.CleanString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.jikkosoft.wappi.userinterfaces.WappiPersonalInformation.COUNTRY_REQUIRED_FIELD;

public class TheMessageCountry implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return CleanString.of(Text.of(COUNTRY_REQUIRED_FIELD).viewedBy(actor).asString());
    }
}
