package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import co.com.exito.tasks.AgregarProducto;
import co.com.exito.tasks.BuscarProducto;
import co.com.exito.userinterface.ExitoPage;

public class CompraStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private ExitoPage exitoPage = new ExitoPage();



    @Dado("^que quiero comprar un televisor para ver el mundial de futbol$")
    public void queQuieroComprarUnTelevisorParaVerElMundialDeFutbol() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(exitoPage));
    }


    @Cuando("^ingreso a la página virtual del éxito y selecciono el (.*) que más me gusta (.*)$")
    public void ingresoALaPáginaVirtualDelÉxitoYSeleccionoElQueMásMeGusta(String descripcion, String cantidad) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
                AgregarProducto.cantidad(cantidad)

        );
    }

    @Entonces("^realizo la compra para que sea enviado a mi casa$")
    public void realizoLaCompraParaQueSeaEnviadoAMiCasa(String descripcion, String cantidad) {


    }
}
