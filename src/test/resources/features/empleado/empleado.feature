#language: es
#autor: Stiven Hernandez Ramirez

Característica: Sitio web OrangeHRM - Agregar nuevo empleado
  Yo como administrador del sitio web OrangeHRM
  Quiero agregar un empleado
  Para guardar sus datos personales

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion

  @RegistroExitoso
  Esquema del escenario: registro de empleado exitosamente
    Cuando el usuario ingresa sus credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y el usuario diligencia el formulario de informacion del empleado
      | primerNombre   | segundoNombre   | apellido   | usuario2   | clave2   | confirmaClave2   |
      | <primerNombre> | <segundoNombre> | <apellido> | <usuario2> | <clave2> | <confirmaClave2> |
    Y el usuario realiza la busqueda del empleado agregado
    Entonces el usuario visualizara el nuevo empleado
    Ejemplos:
      | usuario | clave    | primerNombre | segundoNombre | apellido | usuario2         | clave2         | confirmaClave2 |
      | Admin   | admin123 | Juan         | Camilo        | Perez    | pruebaChoucair32 | Prueba12345678 | Prueba12345678 |