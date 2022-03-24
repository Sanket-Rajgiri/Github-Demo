Feature: Verification of Buy Options Functionality

  Scenario: Buy Option Functionality
    When Four_Driver is loaded
    When Four_Property File is loaded
    Given Four_Directed to the site
    Then Four_Clicked on Buy
    Then Four_Enter location
    And Four_Select Plot
    Then Four_Select Price
    And Four_Click on Search
    And Four_Driver is closed
