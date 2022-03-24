Feature: Check drop down functionality of next border

  Scenario: Check Each drop down functionality
    When Three_Driver is loaded
    When Three_Property File is loaded
    Given Three_Directed to the site
    Then Three_Clicked on Buy
    And Three_Clicked on Rent
    Then Three_Clicked on Sell
    And Three_Clicked on Home Loans
    Then Three_Clicked on Property Services
    And Three_Clicked on MB Advice
    Then Three_Clicked on Help
    And Three_Driver is closed
