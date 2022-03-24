Feature: Verification of Sell Options Functionality

  Scenario: Sell Option Functionality
    When Five_Driver is loaded
    When Five_Property File is loaded
    Given Five_Directed to the site
    Then Five_Clicked on Buy
    Then Five_Enter location
    And Five_Select Bhk
    Then Five_Select Price
    And Five_Click on Search
    And Five_Driver is closed
