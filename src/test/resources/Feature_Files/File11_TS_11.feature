Feature: To check each functionality under sell dropdown options

  Background: To click on sell dropdown option
    When Eleven_Driver is loaded
    When Eleven_Property File is loaded
    Given Eleven_Directed to the site
    Then Eleven_Clicked on Sell dropdown

  Scenario: To check For For Owner options
    ##1
    When Eleven_Click on Post Property
    ##2
    Then Eleven_Clicked on Sell dropdown
    When Eleven_Click on My Dashboard
    ##3
    Then Eleven_Clicked on Sell dropdown
    When Eleven_Click on Sell Packages
    And Eleven_driver is closed

  Scenario: To check For For Selling Tools options
    ##1
    When Eleven_Click on Property Valuation
    ##2
    Then Eleven_Clicked on Sell dropdown
    When Eleven_Click on Find an Agent
    ##3
    Then Eleven_Clicked on Sell dropdown
    When Eleven_Click on Rates and Trends
    And Eleven_driver is closed
