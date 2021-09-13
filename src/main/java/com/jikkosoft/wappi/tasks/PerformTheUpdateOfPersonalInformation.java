package com.jikkosoft.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static com.jikkosoft.wappi.userinterfaces.WappiPersonalInformation.*;

public class PerformTheUpdateOfPersonalInformation implements Task {
    private  String name;
    private  String lastName;
    private  String birthDate;
    private  String country;
    private Target CHOOSE_COUNTRY;
    PerformTheUpdateOfPersonalInformation(String name, String lastName, String birthDate,String country){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.country = country;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CHOOSE_COUNTRY = (country.equals("Country")?COLOMBIA_COUNTRY:WITHOUT_COUNTRY);
        actor.attemptsTo(Click.on(OPTION_PERSONAL_INFORMATION),
                Enter.theValue(name).into(NAME),
                Enter.theValue(lastName).into(LASTNAME),
                Enter.theValue(birthDate).into(BIRTH_DATE),
                Click.on(CHOOSE_COUNTRY),
                Click.on(SAVE_BUTTON));
    }

    public static PerformTheUpdateOfPersonalInformation with(String name, String lastName, String birthDate,String country){
        return new PerformTheUpdateOfPersonalInformation(name,lastName,birthDate,country);

    }
}
