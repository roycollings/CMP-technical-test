package com.wikipedia.cmptest.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    public static WebElement searchForm(WebDriver driver) throws Exception {
        return driver.findElement(By.id("search-form"));
    }

    public static WebElement searchField(WebDriver driver) throws Exception {
        return driver.findElement(By.id("searchInput"));
    }
}