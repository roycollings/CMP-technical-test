package com.wikipedia.cmptest.support;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtilities {
    private static WebDriver currentDriver;

    public static WebDriver getChromerDriver() throws Exception {
        ChromeDriverManager.getInstance().setup();

        /**
         * Remove selenium 'noise' from test output.
         */
        Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
        System.setProperty("webdriver.chrome.args", "--disable-logging --start-maximized");
        System.setProperty("webdriver.chrome.silentOutput", "true");

        currentDriver = new ChromeDriver();

        return currentDriver;
    }

    public static void quitDriver() {
        if (null != currentDriver.toString()){
            currentDriver.quit();
        }
    }
}