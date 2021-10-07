package co.com.exito.tasks;

import co.com.exito.userinterface.DetallesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.exito.userinterface.ExitoPage.INPUT_BUSCAR_OBJETO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.exito.userinterface.DetallesPage.*;

public class AgregarProducto implements Task {

    private String cantidad;
    public AgregarProducto(String cantidad) { this.cantidad = cantidad; }


    public static AgregarProducto cantidad(String cantidad){ return instrumented(AgregarProducto.class, cantidad); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CHECK_RESOLUCION),
                Click.on(BUTTON_FILTROS)
        );


    }




}
