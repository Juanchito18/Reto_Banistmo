Feature: Descargar contrato
  Yo como usuario Banistmo
  Quiero descargar el contrato de tc
  Para leer las condiciones de contrato.


  @tag1
  Scenario: Descarga exitosa
    Given que el usuario esta en la pagina Banistmo.
    When descarga el contrato en pdf
    Then el podra visualizar el mensaje <mensaje>
    
    Examples: 
      | mensaje |
      |Contrato de Tarjetas de Crédito.|