Feature: Validar el registro de un usuario en https://www.utest.com/

  Scenario Outline: Realizar un registro de usuario
    Given El usuario esta en la pagina de registro de utest
    When El relizar el registro de usuario
      | nombre   | apellido   | correo   | dia   | mes   | year   | idioma   | cuidad   | postal   | pais   | modelo   | password   |
      | <nombre> | <apellido> | <correo> | <dia> | <mes> | <year> | <idioma> | <cuidad> | <postal> | <pais> | <modelo> | <password> |
    Then Verifica que el registro se completo exitosamente <mensaje>

    Examples:
      | nombre | apellido | correo               | dia | mes   | year | idioma  | cuidad   | postal | pais     | modelo | password     | mensaje              |
      | Carlos | Peres    | cperes02@yopmail.com | 10  | April | 1991 | Spanish | Sabaneta | 055450 | colombia | iPhone | $YDFHgoX#2bK | Welcome to the world |


