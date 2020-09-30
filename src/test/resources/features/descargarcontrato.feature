Feature: Descargar contrato
  Yo como usuario Banistmo
  Quiero descargar el contrato de tc
  Para leer las condiciones de contrato.


 
  Scenario: Descarga exitosa
    Given que el usuario esta en la pagina Banistmo
    When  edescarga el contrato en pdf
    Then el pvisualizara el mensaje Contrato de Tarjetas de Crédito.