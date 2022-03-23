Feature: To check each functionality under Rent dropdown options

  Background: To click on Rent dropdown option
    When Ten_Driver is loaded
    When Ten_Property File is loaded
    Given Ten_Directed to the site
    Then Ten_Clicked on Rent dropdown

  Scenario: To check Popular Choices options
    #1
    When Ten_Click on Owner Properties
    #2
    Then Ten_Clicked on Rent dropdown
    Then Ten_Click on Verified Properites
    #3
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Furnished Homes
    #4
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Bachelor Friendly Homes
    #5
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Immediately Available
    And Ten_Driver is closed 

  Scenario: To check Property Type options
    #1
    When Ten_Click on Flat for rent in Mumbai
    #2
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on House for rent in Mumbai
    #3
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Villa for rent in Mumbai
    #4
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on PG in Mumbai
    #5
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Office Space in Mumbai
    #6
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Commercial Shops in Mumbai
    #7
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Coworking Space in Mumbai
    And Ten_Driver is closed 

  Scenario: To check Budget options
    #1
    When Ten_Click on Under ten_k
    #2
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on ten_k to fifteen_k
    #3
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on fifteen_k to twentyfive_k
    #4
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on above twnetyfive_k
    And Ten_Driver is closed 

  Scenario: To check Explore options
    #1
    When Ten_Click on Localities
    #2
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Buy vs Rent
    #3
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Find an Agent
    #4
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Share requirement
    #5
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Property Services
    #6
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Rent Agreement
    #7
    Then Ten_Clicked on Rent dropdown
    When Ten_Click on Pay Rent
    And Ten_Driver is closed 
