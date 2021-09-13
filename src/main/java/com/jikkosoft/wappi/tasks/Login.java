package com.jikkosoft.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.jikkosoft.wappi.userinterfaces.WappiLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    private  String userName;
    private  String pass;


    Login(String userName,String pass){
        this.userName = userName;
        this.pass = pass;
    }

    @Step("{0}wants to go to #url")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(USER_WAPPI),
                Enter.theValue(pass).into(PASS_WAPPI),
                Click.on(LOGIN_BUTTON));
    }

    public static Performable like(String userName,String pass){
        return instrumented(Login.class,userName,pass);

    }

}
