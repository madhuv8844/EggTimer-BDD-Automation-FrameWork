Feature: EggTimer launch

  Scenario: Logo presence on EggTimer Homepage
    Given Launch Chrome browser and Maximise the window
    When Open homepage and verify the Title
    Then Verify the logo present on page
    Then Verify the homepage title
    Then Verify the Timer for 15 Mins
    And Close the Chrome browser
