Feature: Verification of functionality of Top Menu Options

  Scenario: Top Menu Options
    When One_Driver is loaded
    When One_Property File is loaded
    Then One_Directed to the site
    And One_Click on Magic Bricks Logo
    Then One_Click on Location
    And One_Click on MB Prime
    Then One_Click on Login
    Then One_Click on Post Property
    And One_Driver is closed
