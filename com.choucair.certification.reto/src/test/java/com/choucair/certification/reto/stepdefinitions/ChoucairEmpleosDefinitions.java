package com.choucair.certification.reto.stepdefinitions;

import com.choucair.certification.reto.questions.Answer;
import com.choucair.certification.reto.tasks.GoTo;
import com.choucair.certification.reto.tasks.OpenUp;

import com.choucair.certification.reto.userinterface.ChoucairPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class ChoucairEmpleosDefinitions {
  /*    @Managed(driver="chrome")
  private final WebDriver hisBrowser;
    private final Actor Jose = Actor.named("Jose");

    public ChoucairEmpleosDefinitions(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }*/

    @Before
    public void setStage() {
        //   Jose.can(BrowseTheWeb.with(hisBrowser));
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jose want to access to Jobs portal$")
    public void thanJoseWantToAccessToJobsPortal() {

        OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage());
    }

    @When("^he clicks the Jobs button$")
    public void heClicksTheJobsButton() {
        OnStage.theActorCalled("Jose").wasAbleTo(GoTo.JobsSection());

    }

    @Then("he should see an image showing Ven a probar el mundo con nosotros")
    public void heShouldSeeAnImageShowingVenAProbarElMundoConNosotros() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.Tothe()));
    }

    @Then("he should see a section called {string}")
    public void heShouldSeeASectionCalled(String choucairSection) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ChoucairPage.LABEL_ABOUT).text().isEqualTo(choucairSection));
    }

    @Then("he should see the section called {string}")
    public void heShouldSeeTheSectionCalled(String applySection) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ChoucairPage.LABEL_APPLY).text().isEqualTo(applySection));
    }

    @And("click on link Que es ser Choucair")
    public void clickOnLinkQueEsSerChoucair() {
        OnStage.theActorCalled("Jose").wasAbleTo(Click.on(ChoucairPage.LABEL_ABOUT));
    }

    @Then("he should see a section title called {string}")
    public void heShouldSeeASectionTitleCalled(String titleSection) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ChoucairPage.TITLE_ABOUT).text().isEqualToIgnoringCase(titleSection));
    }

    @And("click on link Prepararse para aplicar")
    public void clickOnLinkPrepararseParaAplicar() {
        OnStage.theActorCalled("Jose").wasAbleTo(Click.on(ChoucairPage.LABEL_APPLY));
    }

    @Then("he should see the section title called {string}")
    public void heShouldSeeTheSectionTitleCalled(String applySection) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ChoucairPage.TITLE_APPLY).text().isEqualTo(applySection));
    }
}