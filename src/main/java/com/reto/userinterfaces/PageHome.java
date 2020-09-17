package com.reto.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class PageHome extends PageObject {

    public static final Target BTN_REGISTRO = Target.the("boton de registro").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
}
