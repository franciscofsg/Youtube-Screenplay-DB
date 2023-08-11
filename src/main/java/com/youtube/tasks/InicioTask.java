package com.youtube.tasks;

import com.youtube.utils.Database;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static com.youtube.ui.InicioUI.TXT_BUSQUEDA;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class InicioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // Guarda el nombre del video desde la db
        String videoName = Database.getVideoNameFromDatabase();

            actor.attemptsTo(

                    Enter.theValue(videoName).into(TXT_BUSQUEDA).thenHit(Keys.ENTER)

            );

    }


    public static InicioTask on() {


        return instrumented(InicioTask.class);


    }

}
