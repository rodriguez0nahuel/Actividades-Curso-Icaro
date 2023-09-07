package com.icaro.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class Actividad3Seleniumtest {
    private WebDriver driver;

    @BeforeTest
    public void SetUp() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        this.driver = new ChromeDriver(options);
    }

    @Test
    public void IngresarHome() {
        driver.get("https://es.wikipedia.org/wiki/Selenium");
    }

    @Test
    public void VerificarTitulo() {
        String tituloEsperado = "Selenium";
        By TituloBy = By.id("firstHeading");
        WebElement Titulo = driver.findElement(TituloBy);
        String ValorTitulo = Titulo.getText();
        Assert.assertEquals(ValorTitulo, tituloEsperado, "El titulo tiene que ser Selenium");
    }
    @Test
    public void VerificarTituloCuadro(){
        String tituloEsperado = "Selenium";
        By TituloBy = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[1]/th");
        WebElement Title = driver.findElement(TituloBy);
        String ValorTitulo = Title.getText();
        Assert.assertEquals(ValorTitulo,tituloEsperado,"El titulo tiene que ser Selenium");
    }

    @AfterTest
    public void TearDown() {
        this.driver.quit();
    }
}


