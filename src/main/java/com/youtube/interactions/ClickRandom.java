package com.youtube.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.youtube.ui.CatalogoVideosUI.LBL_NOMBRE_VIDEO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandom implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listVideos = LBL_NOMBRE_VIDEO.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listVideos.size());
        listVideos.get(indexRandom).click();

    }

    public static Performable click() {

        return instrumented(ClickRandom.class);

    }

}
