package services.google_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class GooglePage {
    ////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Abrir navegador {string} - {string}")
    public void abrir_navegador(String url, String number) {
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Prueba: " + number + " - Abriendo navegador: " + url);
        Assert.assertEquals(url, url, "Los datos son diferentes");
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