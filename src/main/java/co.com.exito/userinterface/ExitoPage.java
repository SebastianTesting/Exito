package co.com.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.alkosto.com/")
public class ExitoPage extends PageObject {

    public static final Target INPUT_BUSCAR_OBJETO = Target.the("Input donde se realiza la busqueda").located(By.id("js-site-search-input"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton buscar articulo").located(By.id("js-search-button"));
    public static final Target LINK_OBJETO_ENCONTRADO = Target.the("Objeto encontrado").located(By.xpath("//li[@class='product__list--item product__list--alkosto js-product-item'] [2]"));


}
