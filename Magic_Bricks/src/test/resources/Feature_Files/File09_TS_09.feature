Feature: To check each functionality under buy dropdown options

  Background: To click on buy dropdown option
    When Nine_Driver is loaded
    When Nine_Property File is loaded
    Given Nine_Directed to the site
    Then Nine_Clicked on Buy dropdown

  Scenario: To check Popular Choices options
    #1
    When Nine_Click on Ready to Move
    #2
    Then Nine_Clicked on Buy dropdown
    Then Nine_Click on Owner Properites
    #3
    Then Nine_Clicked on Buy dropdown
    When Nine_Click on Budget Homes
    #4
    Then Nine_Clicked on Buy dropdown
    When Nine_Click on Premium Homes
    And Nine_Driver is closed

  Scenario: To check Property Types options
    #1
    When Nine_Click on Flats in Mumbai
    #2
    Then Nine_Clicked on Buy dropdown
    Then Nine_Click on House for sale in Mumbai
    #3
    Then Nine_Clicked on Buy dropdown
    When Nine_Click on Villa in Mumbai
    #4
    Then Nine_Clicked on Buy dropdown
    When Nine_Click on Plot in Mumbai
    #5
    Then Nine_Clicked on Buy dropdown
    When Nine_Click on Office Space in Mumbai
    #6
    Then Nine_Clicked on Buy dropdown
    When Nine_Click on Commercial Shops in Mumbai
    And Nine_Driver is closed
