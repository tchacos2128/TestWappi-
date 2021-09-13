package com.jikkosoft.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static com.jikkosoft.wappi.userinterfaces.WappiMyOrders.OPTION_MY_ORDERS;
import static com.jikkosoft.wappi.userinterfaces.WappiMyOrders.ORDERED_ITEMS;

public class MyOrders implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(OPTION_MY_ORDERS));
        return Text.of(ORDERED_ITEMS).viewedBy(actor).asString();
    }

    public static MyOrders has(){
        return new MyOrders();

    }
}
