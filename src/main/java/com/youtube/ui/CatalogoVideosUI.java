package com.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogoVideosUI {

    public static Target LBL_NOMBRE_VIDEO =  Target.the("Detalle del video").locatedBy("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer' and not(@is-empty)]");

}
