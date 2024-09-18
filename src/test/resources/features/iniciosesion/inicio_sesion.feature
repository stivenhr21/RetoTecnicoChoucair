#language: es
#autor: Stiven Hernandez Ramirez

Característica: Sitio web Product Store - Inicio de Sesion
  Yo como usuario del sitio web Product Store
  Quiero iniciar sesión con mi usuario
  Para realizar compras

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion

  @InicioSesionExitoso
  Esquema del escenario: inicio de sesion exitoso
    Cuando el usuario ingresa sus credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces el usuario se visualizara logueado en la pagina de inicio
    Ejemplos:
      | usuario                  | clave |
      | stivenhr21TestAutomation | 123   |