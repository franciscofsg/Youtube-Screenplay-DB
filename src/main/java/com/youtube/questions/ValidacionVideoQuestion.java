package com.youtube.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.ui.DetalleVideo.LBL_DETALLE_VIDEO;

public class ValidacionVideoQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

      WebElementFacade nombreVideo = LBL_DETALLE_VIDEO.resolveFor(actor);
      return nombreVideo.isDisplayed();
    }

    public static Question<Boolean> from () {

        return new ValidacionVideoQuestion();

    }

}
