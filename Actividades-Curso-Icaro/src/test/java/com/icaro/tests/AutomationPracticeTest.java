package com.icaro.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AutomationPracticeTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        String r = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.out.println("[Info]Ruta driver "+r);
        System.setProperty("webdriver.chrome.driver", r);

        options.addArguments("start-maximized");
        options.addArguments("incognito");

//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model

//        options.addArguments("--headless");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);

    }

    @Test
    public void ingresarALaHome() {
        this.driver.get("http://www.automationpractice.pl/index.php?");
    }

    @AfterTest
    public void tearDown() {
        this.driver.quit();
    }
}
