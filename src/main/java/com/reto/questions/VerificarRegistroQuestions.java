package com.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.reto.userinterfaces.ElementosRegistro.lBL_MENSAJE;

public class VerificarRegistroQuestions implements Question<Boolean> {

    private String mensaje;

    public VerificarRegistroQuestions(String mensaje) {
        this.mensaje = mensaje;
    }

    public static VerificarRegistroQuestions verificarRegistro(String mensaje) {
        return new VerificarRegistroQuestions(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(lBL_MENSAJE).viewedBy(actor).asString().contains(mensaje);
    }
}
