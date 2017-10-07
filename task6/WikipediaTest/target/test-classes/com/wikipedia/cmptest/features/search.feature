Feature: Search functionality

  Background: Always start these scenarios with the relevant application open in a browser
    Given I have launched the browser and navigated to the Wikipedia search page

  Scenario: Searching for a term takes me to the first suggested page by default
    When I search for Test Automation
    Then I am shown the Wikipedia page for Test automation