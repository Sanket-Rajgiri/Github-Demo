Feature: To check each functionality under home loans dropdown options

  Background: To click on home loans dropdown option
    When Twelve_Driver is loaded
    When Twelve_Property File is loaded
    Given Twelve_Directed to the site
    Then Twelve_Clicked on Home Loans dropdown

  Scenario: To check For Apply Now options
    #1
    When Twelve_Click on Home Loans
    #2
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on Balance Transfer
    #3
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on Loan Against Property
    #4
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on Preapproved Home Loan
    And Twelve_driver is closed

  Scenario: To check For Bank Partners options
    ##1
    When Twelve_Click on SBI Home Loan
    ##2
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on HDFC Ltd Home Loan
    ##3
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on PNB HFL Home Loan
    ##4
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on ICICI Home Loan
    ##5
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on Bajaj Housing
    ##6
    Then Twelve_Clicked on Home Loans dropdown
    When Twelve_Click on Bank of Badoda
    And Twelve_driver is closed
