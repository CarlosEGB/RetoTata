package com.reto.tasks;

import com.reto.models.DatosModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.reto.userinterfaces.ElementosRegistro.*;

public class RegistroUsuario implements Task {

    private List<DatosModel> datosModelList;

    public RegistroUsuario(List<DatosModel> datosModelList) {
        this.datosModelList = datosModelList;
    }

    public static Performable registrar(List<DatosModel> datosModelList) {
        return Tasks.instrumented(RegistroUsuario.class, datosModelList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.keyValues(datosModelList.get(0).getNombre()).into(INPUT_NOMBRE),
                Enter.keyValues(datosModelList.get(0).getApellido()).into(INPUT_APELLIDO),
                Enter.keyValues(datosModelList.get(0).getCorreo()).into(INPUT_CORREO),
                SelectFromOptions.byVisibleText(datosModelList.get(0).getMes()).from(CBOX_MES),
                SelectFromOptions.byVisibleText(datosModelList.get(0).getDia()).from(CBOX_DIA),
                SelectFromOptions.byVisibleText(datosModelList.get(0).getYear()).from(CBOX_YEAR),
                Enter.keyValues(datosModelList.get(0).getIdioma()).into(INPUT_IDIOMA).thenHit(Keys.ENTER),
                Click.on(BTN_NEXT)
        );

        actor.attemptsTo(
                Enter.keyValues(datosModelList.get(0).getPostal()).into(INPUT_CODIGO),
                Click.on(CBOX_PAIS)

        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Enter.keyValues(datosModelList.get(0).getPais()).into(INPUT_PAIS).thenHit(Keys.ENTER),
                Click.on(BTN_NEXT_DOS)
        );

        actor.attemptsTo(
                //Click.on(CBOX_MODEL),
                //Enter.keyValues(datosModelList.get(0).getModelo()).into(INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(BTN_NEXT_TRES)
        );

        actor.attemptsTo(
                Enter.keyValues(datosModelList.get(0).getPassword()).into(INPUT_PASSWORD),
                Enter.keyValues(datosModelList.get(0).getPassword()).into(INPUT_VALIDAR_PASSWORD),
                Click.on(CHECK_TERMINOS),
                Click.on(CHECK_PRIVACIDAD),
                Click.on(BTN_NEXT_CUATRO)
        );
    }
}
