package com.wikipedia.cmptest.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SearchSteps {

    @Given("^I have launched the browser and navigated to the Wikipedia search page$")
    public void I_have_launched_the_browser_and_navigated_to_the_Wikipedia_search_page() throws Throwable {
    }

    @When("^I search for (.*)$")
    public void I_search_for_x(String searchString) throws Throwable {
    }

    @Then("^I am shown the Wikipedia page for (.*)$")
    public void I_am_shown_the_Wikipedia_page_for_x(String searchString) throws Throwable {
    }
}