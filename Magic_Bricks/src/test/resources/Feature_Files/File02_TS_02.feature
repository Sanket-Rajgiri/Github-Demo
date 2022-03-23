Feature: Login Check

  Background: Redirecting the home page
    When Two_Driver is loaded
    When Two_Property File is loaded
    Given Two_Directed to the site to login
    And Two_Clicked on Login

  Scenario: Check User is able to login with valid mobile number
    Then Two_Enter Phone Number and clicked Next
    And Two_Enter OTP and Clicked Continue
    Then Two_Landed on logined site
    And Two_Returns to Final Page
    And Two_Driver is closed

  Scenario: Check User is able to login with valid email id
    Then Two_Enter email id and clicked Next
    And Two_Enter Password and Clicked Continue
    Then Two_Landed on logined site
    And Two_Returns to Final Page
    And Two_Driver is closed

  Scenario: Check User is not able to login with invalid mobile number
    Then Two_Enter invalid Phone Number and clicked Next
    And Two_Returns to Final Page
    And Two_Driver is closed

  Scenario: Check User is not able to login with invalid email id
    Then Two_Enter invalid email id and clicked Next
    And Two_Returns to Final Page
    And Two_Driver is closed

  Scenario: To validate if user is unable to login with null email id/mobile number and password
    Then Two_Enter nothing and clicked Next
    And Two_Returns to Final Page
    And Two_Driver is closed
