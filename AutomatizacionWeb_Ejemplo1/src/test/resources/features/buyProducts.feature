@buyProducts
Feature: Test Shopping Cart

  Scenario: Adds 2 products
    Given Jorge navegar a la pagina principal
    When seleccionar producto y añadir al carrito
    When regresar pagina principal
    When seleccionar segundo producto y añadir al carrito
    When visualizar cart
    When visualizar orden
    When llenar formulario "Jorge Nacipucha", "Ecuador", "Cuenca", "01010101010101", "10", "2023"
    Then Validar mensaje "Thank you for your purchase!"