package co.com.choucair.userinterface.iniciosesion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionUserinterface {

    public static final Target BTN_LOGIN_MENU = Target.the("Boton del menu para acceder al formulario de inicio de sesion").located(By.id("login2"));

    public static final Target INPUT_USUARIO = Target.the("Input para diligenciar el usuario").located(By.id("loginusername"));

    public static final Target INPUT_CLAVE = Target.the("Input para diligenciar la clave").located(By.id("loginpassword"));

    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion con las credenciales ingresadas").located(By.xpath("(//button[@class= 'btn btn-primary'])[3]"));

    public static final Target NOMBRE_USUARIO_LOGUEADO = Target.the("Nombre de usuario logueado").located(By.id("nameofuser"));
}
