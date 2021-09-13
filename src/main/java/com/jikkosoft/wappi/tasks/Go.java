package com.jikkosoft.wappi.tasks;

import com.jikkosoft.wappi.utils.SuitUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Go implements Task {
    private String url;

    Go(String url){
       this.url = url;
    }
    @Step("{0}wants to go to #url")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }

    public static Performable to(SuitUrl app){
           return instrumented(Go.class,app.url());

    }
}
