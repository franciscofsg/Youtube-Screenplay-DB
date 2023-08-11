package com.youtube.tasks;

import com.youtube.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.youtube.ui.InicioUI.TXT_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CatalogoVideosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ClickRandom.click()

        );

    }

    public static CatalogoVideosTask on() {


        return instrumented(CatalogoVideosTask.class);


    }

}
