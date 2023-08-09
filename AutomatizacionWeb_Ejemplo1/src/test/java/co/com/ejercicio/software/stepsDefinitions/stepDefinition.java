package co.com.ejercicio.software.stepsDefinitions;

import co.com.ejercicio.software.cart.FormCart;
import co.com.ejercicio.software.navigate.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class stepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) navegar a la pagina principal")
    public void homeCart(String actor) {
        theActorCalled(actor).attemptsTo(Navigate.OpenHomePage());
    }

    @When("seleccionar producto y añadir al carrito")
    public void darClickEn() {
        withCurrentActor(
                FormCart.addCart()
        );
    }

    @When("seleccionar segundo producto y añadir al carrito")
    public void darClick2() {
        withCurrentActor(
                FormCart.addCart2()
        );
    }

    @When("regresar pagina principal")
    public void regresarPagina() {
        withCurrentActor(
                FormCart.regresarPagina()
        );

    }


    @And("añadir al carrito")
    public void addCart() {
        withCurrentActor(
                FormCart.addCart()
        );
    }


    @When("visualizar cart")
    public void goCart(){
        withCurrentActor(
                FormCart.cartButton()
        );

    }

    @When("visualizar orden")
    public void goOrden(){
        withCurrentActor(
                FormCart.goOrden()
        );

    }

    @When("llenar formulario {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillCheckoutForm(String name, String country, String city, String card, String month, String year){
        withCurrentActor(
                FormCart.checkoutForm(name, country, city, card, month, year)
        );
    }


    @Then("Validar mensaje {string}")
    public void validatesMessage(String message) throws InterruptedException {
        Target confirmOrder = Target.the("message").located(By.xpath("/html/body/div[10]/h2"));
        Thread.sleep(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(confirmOrder).text().contains(message)
        );
    }


}
