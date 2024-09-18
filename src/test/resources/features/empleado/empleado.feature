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
    Cuando inicio sesion con mis credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Y diligencio el formulario de informacion del empleado
      | primerNombre   | segundoNombre   | apellido   | id   | usuario2   | clave2   | confirmaClave2   |
      | <primerNombre> | <segundoNombre> | <apellido> | <id> | <usuario2> | <clave2> | <confirmaClave2> |
    Y realizo la busqueda del empleado agregado
    Entonces se visualizara el empleado agregado en una tabla
    Ejemplos:
      | usuario | clave    | primerNombre | segundoNombre | apellido | id    | usuario2       | clave2         | confirmaClave2 |
      | Admin   | admin123 | Juan         | Camilo        | Perez    | 12340 | pruebaChoucair | Prueba12345678 | Prueba12345678 |