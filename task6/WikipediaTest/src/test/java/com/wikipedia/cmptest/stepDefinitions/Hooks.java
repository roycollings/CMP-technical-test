package com.wikipedia.cmptest.stepDefinitions;

import com.wikipedia.cmptest.support.WebDriverUtilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    @Before
    public void beforeScenarios(){
        
    }

    @After
    public void afterScenarios(){
        WebDriverUtilities.quitDriver();
    }
}