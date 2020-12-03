Feature: EggTimer launch

  Scenario: Logo presence on EggTimer Homepage
    Given Open and Navigate to the EggTimer url
    When Open homepage and verify the Title
    Then Verify the logo present on page
    Then Verify the homepage title
    Then Verify the Timer for 15 Mins
    And Close the Chrome browser
  Scenario:
    Given verify the data integration
