#language: es
#autor: Stiven Hernandez Ramirez

Característica: Sitio OrangeHRM - Inicio de Sesion
  Yo como usuario del sitio web OrangeHRM
  Quiero iniciar sesión con mi usuario
  Para realizar tramites

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion

  @InicioSesionExitoso
  Esquema del escenario: inicio de sesion exitoso
    Cuando el usuario ingresa sus credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces el usuario se visualizara logueado en la pagina de inicio
    Ejemplos:
      | usuario | clave    |
      | Admin   | admin123 |