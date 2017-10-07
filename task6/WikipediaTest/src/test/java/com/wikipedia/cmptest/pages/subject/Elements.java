package com.wikipedia.cmptest.pages.subject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    public static WebElement pageHeader(WebDriver driver) throws Exception {
        return driver.findElement(By.id("firstHeading"));
    }
}