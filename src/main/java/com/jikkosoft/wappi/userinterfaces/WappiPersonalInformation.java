package com.jikkosoft.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WappiPersonalInformation {
	public static final Target OPTION_PERSONAL_INFORMATION = Target.the("Personal Information Option").located(By.xpath("//*[@class='nav-bar-menu']/li/a[contains(text(),'Información personal')]"));
	public static final Target NAME = Target.the("Name").located(By.id("name"));
	public static final Target LASTNAME = Target.the("lastName").located(By.id("lastName"));
	public static final Target BIRTH_DATE = Target.the("Birth Date").located(By.id("bornDate"));
	public static final Target COLOMBIA_COUNTRY = Target.the("Country").located(By.xpath("//*[@id='country']/option[contains(text(),'Colombia')]"));
	public static final Target WITHOUT_COUNTRY = Target.the("Without Country").located(By.xpath("//*[@id='country']/option[contains(text(),'Seleccionar')]"));
	public static final Target SAVE_BUTTON = Target.the("Save Botton").located(By.id("save-profile"));

	public static final Target NAME_REQUIRED_FIELD = Target.the("Nombre Required Field").located(By.id("e-name"));
	public static final Target LASTNAME_REQUIRED_FIELD = Target.the("Nombre Required Field").located(By.id("e-lastName"));
	public static final Target BIRTH_DATE_REQUIRED_FIELD = Target.the("Nombre Required Field").located(By.id("e-bornDate"));
	public static final Target COUNTRY_REQUIRED_FIELD = Target.the("Nombre Required Field").located(By.id("e-country"));

}
