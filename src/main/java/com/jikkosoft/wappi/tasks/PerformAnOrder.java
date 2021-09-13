package com.jikkosoft.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.jikkosoft.wappi.userinterfaces.WappiOrder.*;

public class PerformAnOrder implements Task {
    private  String item;

    PerformAnOrder(String item){
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ITEM_LIST),
                Click.on(ORDER_CONFIRM),
                Click.on(CLOSE_MODAL));
    }

    public static PerformAnOrder of(String item){
        return new PerformAnOrder(item);

    }
}
