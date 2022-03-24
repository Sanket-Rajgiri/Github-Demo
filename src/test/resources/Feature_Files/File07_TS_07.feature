Feature: Verification of Plot Options Functionality

  Scenario: Plot Option Functionality
    When Seven_Driver is loaded
    When Seven_Property File is loaded
    Given Seven_Directed to the site
    Then Seven_Clicked on Plot
    Then Seven_Enter location
    And Seven_Select Residential Type
    Then Seven_Select Budget
    And Seven_Click on Search
    And Seven_Driver is closed
