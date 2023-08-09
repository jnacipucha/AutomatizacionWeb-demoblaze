package co.com.ejercicio.software.navigate;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable OpenHomePage() {
        return Task.where("{0} Open home page",
                Open.browserOn().the(OpenPage.class));
    }
}
