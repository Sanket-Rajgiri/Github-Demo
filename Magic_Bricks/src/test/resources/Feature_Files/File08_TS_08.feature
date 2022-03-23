Feature: Verification of Commercial Options Functionality

  Scenario: Commercial Option Functionality
    When Eight_Driver is loaded
    When Eight_Property File is loaded
    Given Eight_Directed to the site
    Then Eight_Clicked on Commercial
    Then Eight_Select Commerical type
    And Eight_Enter location
    And Eight_Select Property Type
    Then Eight_Select Budget
    And Eight_Click on Search
    And Eight_Driver is closed
