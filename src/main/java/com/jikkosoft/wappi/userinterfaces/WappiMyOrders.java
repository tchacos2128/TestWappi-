package com.jikkosoft.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WappiMyOrders {
    public static final Target OPTION_MY_ORDERS = Target.the("My Order Option").located(By.xpath("//*[@class='nav-bar-menu']/li/a[contains(text(),'Mis pedidos')]"));
    public static final Target ORDERED_ITEMS = Target.the("List of articles").located(By.xpath("//*[@class='app-table offers-table']/tbody/tr/td[contains(text(),'Pan tajado')]"));

}
