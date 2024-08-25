Feature: Abrir páginas distintas, y validar su URL
  
  @Smoke
  Scenario Outline: Abrir páginas cualquiera
    Given Abrir navegador '<url>' - '<number>'
    And Validar la URL
    Then Cerrar navegador

    Examples:
      | url                           | number |
      | https://www.google.com/       | 1      |
      | https://www.youtube.com/      | 2      |
      | https://gemini.google.com/app | 3      |
      | https://chatgpt.com/          | 4      |