package com.youtube.stepsDefinitions.busquedaVideo;

import com.youtube.questions.ValidacionVideoQuestion;
import com.youtube.tasks.CatalogoVideosTask;
import com.youtube.tasks.InicioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BusquedaVideoStepDef {

    @Before
    public void setStage() {

        setTheStage(new OnlineCast());

    }


    @Dado("que el usuario abre la pagina de youtube")
    public void queElUsuarioAbreLaPaginaDeYoutube() {

        theActorCalled("User").wasAbleTo(

                Open.url("https://www.youtube.com/")

        );

    }
    @Cuando("busque un video y le da clic aleatoriamente a un video")
    public void busqueUnVideoYLeDaClicAleatoriamenteAUnVideo() {

        theActorInTheSpotlight().attemptsTo(

                InicioTask.on(),
                CatalogoVideosTask.on()

        );


    }
    @Entonces("podrá visualizar el titulo del video")
    public void podráVisualizarElTituloDelVideo() {

        theActorInTheSpotlight().should(

                seeThat(ValidacionVideoQuestion.from(), Matchers.equalTo(true)

                )
        );

    }

}
