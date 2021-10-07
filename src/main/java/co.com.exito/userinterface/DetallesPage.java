package co.com.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class DetallesPage {

    public static final Target CHECK_RESO = Target.the("Check para resolucion UHD 4K").located(By.xpath("/html/body/main/section/section/aside/div/div/div/div/div/div[1]/div/ul/li[2]/div[1]/label"));

    public static final Target CHECK_PULGADAS = Target.the("Check para pulgadas de 44 a 50").located(By.xpath("(//DIV[@class='filtro_tamano'])[2]"));
    public static final Target CHECK_MARCA = Target.the("Check para Marca LG").located(By.className("(//DIV[@class='filtro_marca'])[2]"));
    public static final Target CHECK_RESOLUCION = Target.the("Check para resolucion UHD 4K").located(By.xpath("/html/body/main/section/div[7]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div/div[2]/form[2]/button"));
    public static final Target BUTTON_FILTROS = Target.the("Boton para los filtros").located(By.xpath("//span[@class='icon alk-icon-carrito']"));
}

