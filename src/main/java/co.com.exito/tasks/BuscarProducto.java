package co.com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import co.com.exito.userinterface.ExitoPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.exito.userinterface.ExitoPage.*;

public class BuscarProducto implements Task {

    private String descripcion;

    public BuscarProducto(String descripcion){
        this.descripcion = descripcion;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_BUSCAR_OBJETO),
                Enter.theValue(descripcion).into(INPUT_BUSCAR_OBJETO),
                Click.on(BUTTON_BUSCAR_ARTICULO),
                Click.on(LINK_OBJETO_ENCONTRADO)







        );
    }

    public static BuscarProducto conDescripcion(String descripcion) {
        return instrumented(BuscarProducto.class, descripcion);
    }

}
