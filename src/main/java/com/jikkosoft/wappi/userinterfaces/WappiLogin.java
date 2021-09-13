package com.jikkosoft.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WappiLogin {
	public static final Target USER_WAPPI = Target.the("User Field").located(By.id("username"));
	public static final Target PASS_WAPPI = Target.the("Password Field").located(By.id("password"));
	public static final Target LOGIN_BUTTON = Target.the("Login Botton Wappi").located(By.id("button-login"));

}
