package co.com.choucair.userinterface.empleado;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpleadoUserinterface {

    public static final Target OPCION_MENU_PIM = Target.the("Opcion PIM del menu lateral").located(By.xpath("(//a[@class = 'oxd-main-menu-item'])[2]"));
    public static final Target BTN_AGREGAR = Target.the("Input para diligenciar clave de usuario a loguearse").located(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']"));
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Input para diligenciar primer nombre del empleado").located(By.name("firstName"));
    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Input para diligenciar segundo nombre del empleado").located(By.name("middleName"));
    public static final Target INPUT_APELLIDO = Target.the("Input para diligenciar apellido del empleado").located(By.name("lastName"));
    public static final Target INPUT_ID = Target.the("Input para diligenciar id del empleado").located(By.xpath("(//input[@class = 'oxd-input oxd-input--active'])[2]"));
    public static final Target SWITCH_CREAR_DATOS_SESION = Target.the("Switch para señalar crear datos inicio de sesion").located(By.xpath("//span[@class = 'oxd-switch-input oxd-switch-input--active --label-right']"));
    public static final Target BTN_GUARDAR = Target.the("Boton para guardar datos del empleado").located(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
    public static final Target INPUT_USUARIO = Target.the("Input para diligenciar usuario a crear").located(By.xpath("(//input[@class = 'oxd-input oxd-input--active'])[3]"));
    public static final Target INPUT_CLAVE = Target.the("Input para diligenciar clave de usuario a crear").located(By.xpath("(//input[@class = 'oxd-input oxd-input--active'])[4]"));
    public static final Target INPUT_CONFIRMAR_CLAVE = Target.the("Input para diligenciar confirmacion de clave de usuario a crear").located(By.xpath("(//input[@class = 'oxd-input oxd-input--active'])[5]"));

}
