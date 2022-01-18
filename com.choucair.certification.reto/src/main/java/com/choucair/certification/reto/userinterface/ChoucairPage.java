package com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;

public class ChoucairPage extends PageObject {
    public static final Target JOBS_BUTTON = Target.the("Jobs Button")
            .located(By.id("menu-item-550"));

    public static final Target BANNER = Target.the("Banner")
            .located(By.className("elementor-image"));

    public static final Target LABEL_ABOUT =Target.the("Label About Choucair")
            .locatedBy("//a[contains(text(), '¿Qué es ser')]");

    public static final Target LABEL_APPLY = Target.the("Label Prepare To Apply")
            .locatedBy("//a[contains(text(), 'Prepararse para aplicar')]");

    public static final Target TITLE_ABOUT = Target.the("Title about")
            .locatedBy("//h2[contains(text(), 'SER CHOUCAIR')]");

    public static final Target TITLE_APPLY = Target.the("Title apply")
            .locatedBy("//h2[contains(text(), 'PREPARARSE PARA APLICAR')]");
}