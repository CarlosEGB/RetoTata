package com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ElementosRegistro {

    public static final Target INPUT_NOMBRE = Target.the("campo nombre").locatedBy("//input[@id='firstName']");
    public static final Target INPUT_APELLIDO = Target.the("campo apellido").locatedBy("//input[@id='lastName']");
    public static final Target INPUT_CORREO = Target.the("campo correo").locatedBy("//input[@id='email']");
    public static final Target CBOX_MES = Target.the("Combobox mes de cumple").locatedBy("//select[@id='birthMonth']");
    public static final Target CBOX_DIA = Target.the("Combobox dia de cumple").locatedBy("//select[@id='birthDay']");
    public static final Target CBOX_YEAR = Target.the("Combobox año de cumple").locatedBy("//select[@id='birthYear']");
    public static final Target INPUT_IDIOMA = Target.the("Campo idioma").locatedBy("//input[@type='search']");
    public static final Target BTN_NEXT = Target.the("Boton siguiente").locatedBy("//span[contains(.,'Next: Location')]");

    public static final Target INPUT_CODIGO = Target.the("Campo de codigo postal").locatedBy("//input[@id='zip']");
    public static final Target CBOX_PAIS = Target.the("Campo de pais").locatedBy("//span[@class='ui-select-match-text pull-left']");
    public static final Target INPUT_PAIS = Target.the("Campo de pais").locatedBy("//input[@placeholder='Select a country']");
    public static final Target BTN_NEXT_DOS = Target.the("Boton siguiente dos").locatedBy("//span[contains(.,'Next: Devices')]");

    public static final Target CBOX_MODEL = Target.the("Campo Modelo").locatedBy("//span[@aria-label='Select a Model']");
    public static final Target INPUT_MODEL = Target.the("Campo Modelo").locatedBy("//input[@aria-owns='ui-select-choices-33']");
    public static final Target BTN_NEXT_TRES = Target.the("Boton siguiente tres").locatedBy("//span[contains(.,'Next: Last Step')]");

    public static final Target INPUT_PASSWORD = Target.the("Campo contraseña").locatedBy("//input[@id='password']");
    public static final Target INPUT_VALIDAR_PASSWORD = Target.the("Campo validar contraseña").locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_TERMINOS = Target.the("Check de terminos").locatedBy("//span[@ng-class='{error: userForm.termOfUse.$error.required}']");
    public static final Target CHECK_PRIVACIDAD = Target.the("Check de privacidad").locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static final Target BTN_NEXT_CUATRO = Target.the("Boton siguiente cuatro").locatedBy("//span[contains(.,'Complete Setup')]");

    public static final Target lBL_MENSAJE = Target.the("Mensaje Final").locatedBy("//div[@class='image-box-header']/h1");

}
