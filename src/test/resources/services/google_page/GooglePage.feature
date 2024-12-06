Feature: Abrir páginas distintas, y validar su URL
  
  @Smoke
  Scenario Outline: Abrir páginas cualquiera
    Given Abrir navegador '<number>' - '<url>'
    And Validar la URL
    Then Cerrar navegador

    Examples:
      | number | url                           |
      | 1      | https://www.google.com/       |
      | 2      | https://www.youtube.com/      |
      | 3      | https://gemini.google.com/app |
      | 4      | https://chatgpt.com/          |
      | 5      | https://imalittletester.com/  |
      | 6      | https://reqres.in/            |
      | 7      | https://demoqa.com/           |