package co.com.ejercicio.software.cart;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class FormCart {
    public static Performable addCart() {
        return Task.where("{0} adds product",
                Click.on(FormSearch.SELECCION_PRODUCTO_1),
                Click.on(FormSearch.ADD_CART)

        );
    }

    public static Performable addCart2() {
        return Task.where("{0} adds product",
                Click.on(FormSearch.SELECCION_PRODUCTO_2),
                Click.on(FormSearch.ADD_CART)
        );
    }

    public static Performable regresarPagina() {
        return Task.where("{0} adds product",
                Click.on(FormSearch.REGRESAR_PAGINA)

        );
    }

    public static Performable goOrden() {
        return Task.where("{0} adds product",
                Click.on(FormSearch.ORDER)


        );
    }

    public static Performable cartButton(){
        return Task.where("{0} cart button",
                Click.on(FormSearch.CART)
        );
    }


    public static Performable checkoutForm(String name, String country, String city, String card,
                                               String month, String year) {
        return Task.where("{0} checkout form",
                        Enter.theValue(name).into(Formulario.NAME),
                        Enter.theValue(country).into(Formulario.COUNTRY),
                        Enter.theValue(city).into(Formulario.CITY),
                        Enter.theValue(card).into(Formulario.CARD),
                        Enter.theValue(month).into(Formulario.MONTH),
                        Enter.theValue(year).into(Formulario.YEAR),
                        Click.on(Formulario.CONTINUE_SHOPPING)
                )
                .with("name").of(name)
                .with("country").of(country)
                .with("city").of(city)
                .with("card").of(card)
                .with("month").of(month)
                .with("year").of(year);
    }
}
