package com.jikkosoft.wappi.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WappiOrder {
    public static final Target ITEM_LIST = Target.the("Ítem List").located(By.xpath("//*[@class='app-table offers-table']/tbody/tr/td[contains(text(),'Pan tajado')]/following-sibling::td/button"));
    public static final Target ORDER_CONFIRM = Target.the("Order Confirm").located(By.id("order-confirm"));
    public static final Target CLOSE_MODAL = Target.the("Close confirm pop up").located(By.xpath("//*[@id='confirmation-modal']/div/span[@class='close']"));

    }
