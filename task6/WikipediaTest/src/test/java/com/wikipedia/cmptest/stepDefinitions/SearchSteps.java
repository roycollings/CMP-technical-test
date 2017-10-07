package com.wikipedia.cmptest.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.wikipedia.cmptest.support.WebDriverUtilities;
import com.wikipedia.cmptest.RuntimeSettings;
import com.wikipedia.cmptest.pages.search.SearchPage;
import com.wikipedia.cmptest.pages.subject.SubjectPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.assertj.core.api.Assertions.*;

public class SearchSteps {
    private WebDriver driver;

    @Given("^I have launched the browser and navigated to the Wikipedia search page$")
    public void I_have_launched_the_browser_and_navigated_to_the_Wikipedia_search_page() throws Throwable {
        this.driver = WebDriverUtilities.getChromerDriver();
        String applicationUrl = RuntimeSettings.getApplicationUrl();
        driver.get(applicationUrl);
    }

    @When("^I search for (.*)$")
    public void I_search_for_x(String searchString) throws Throwable {
        SearchPage.searchField(driver).sendKeys(searchString);
        SearchPage.searchForm(driver).submit();
    }

    @Then("^I am shown the Wikipedia page for (.*)$")
    public void I_am_shown_the_Wikipedia_page_for_x(String expectedHeader) throws Throwable {
        String header = SubjectPage.pageHeader(driver).getText();
        assertThat(header).isEqualTo(expectedHeader);
    }
}