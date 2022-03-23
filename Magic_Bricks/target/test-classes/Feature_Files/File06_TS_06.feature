Feature: Verification of PG Options Functionality

  Scenario: PG Option Functionality
    When Six_Driver is loaded
    When Six_Property File is loaded
    Given Six_Directed to the site
    Then Six_Clicked on PG
    Then Six_Enter location
    And Six_Select Occpancy Type
    Then Six_Select Budget
    And Six_Click on Search
    And Six_Driver is closed
