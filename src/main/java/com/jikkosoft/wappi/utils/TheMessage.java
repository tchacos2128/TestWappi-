package com.jikkosoft.wappi.utils;

import com.jikkosoft.wappi.questions.TheMessageBirthDate;
import com.jikkosoft.wappi.questions.TheMessageCountry;
import com.jikkosoft.wappi.questions.TheMessageLastName;
import com.jikkosoft.wappi.questions.TheMessageName;
import net.serenitybdd.screenplay.Question;

public class TheMessage {

    public static Question<String> of(String field) {

        if (field.contains ("nombre")) {
            return new TheMessageName();
        }else if(field.contains ("apellido")) {
            return new TheMessageLastName();
        }else if(field.contains ("nacimiento")) {
            return new TheMessageBirthDate();
        }else {
            return new TheMessageCountry();
        }
    }

}
