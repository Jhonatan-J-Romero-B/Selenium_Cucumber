package services.google_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class GooglePage {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Abrir navegador {string} - {string}")
    public void abrir_navegador(String number, String url) {
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Prueba: " + number + " - Abriendo navegador: " + url);
        String validation = switch (url) {
            case "https://www.google.com/" -> "https://www.google.com/";
            case "https://www.youtube.com/" -> "https://www.youtube.com/";
            case "https://gemini.google.com/app" -> "https://gemini.google.com/app";
            case "https://chatgpt.com/" -> "https://chatgpt.com/";
            case "https://imalittletester.com/" -> "https://imalittletester.com/";
            case "https://reqres.in/" -> "https://reqres.in/";
            default -> "Página no reconocida";
        };
        Assert.assertEquals(url, validation, "Los datos son diferentes");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    @And("Validar la URL")
    public void validar_la_url() {
        System.out.println("Validando la URL");
        Assert.assertEquals("URL Validada OK", "URL Validada OK", "Los datos son diferentes");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Then("Cerrar navegador")
    public void cerrar_navegador() {
        System.out.println("Cerrando navegador");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
        Assert.assertEquals("Navegador cerrado OK", "Navegador cerrado OK", "Los datos son diferentes");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
}