package co.com.choucair.userinterface.iniciosesion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionUserinterface {
    public static final Target INPUT_USUARIO = Target.the("Input para diligenciar usuario a loguearse").located(By.name("username"));
    public static final Target INPUT_CLAVE = Target.the("Input para diligenciar clave de usuario a loguearse").located(By.name("password"));
    public static final Target BTN_INGRESAR = Target.the("Boton ingresar al sistema").located(By.xpath("//button[text()= ' Login ']"));
    public static final Target NOMBRE_USUARIO_LOGUEADO = Target.the("Nombre de usuario logueado").located(By.xpath("//p[text() = 'manda user']"));
}
