package com.reto.steps_definitions;

import com.reto.models.DatosModel;
import com.reto.questions.VerificarRegistroQuestions;
import com.reto.tasks.RegistroUsuario;
import com.reto.userinterfaces.PageHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.reto.userinterfaces.PageHome.BTN_REGISTRO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinitions {


    private PageHome pageHome;

    @Before
    public void prepararActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Carlos");
    }

    @Given("^El usuario esta en la pagina de registro de utest$")
    public void elUsuarioEstaEnLaPaginaDeRegistroDeUtest() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.browserOn(pageHome),
                Click.on(BTN_REGISTRO)
        );
    }

    @When("^El relizar el registro de usuario$")
    public void elRelizarElRegistroDeUsuario(List<DatosModel> datosModelList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroUsuario.registrar(datosModelList)
        );
    }

    @Then("^Verifica que el registro se completo exitosamente (.*)$")
    public void verificaQueElRegistroSeCompletoExitosamente(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerificarRegistroQuestions.verificarRegistro(mensaje))
        );
    }
}
