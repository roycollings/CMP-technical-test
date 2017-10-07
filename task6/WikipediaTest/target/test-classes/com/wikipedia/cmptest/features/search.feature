Feature: Search functionality

  Scenario: Searching for a term takes me to the first suggested page by default
    Given I have launched the browser and navigated to the Wikipedia search page
    When I search for Test Automation
    Then I am shown the Wikipedia page for Test automation