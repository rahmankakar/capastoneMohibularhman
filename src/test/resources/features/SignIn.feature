Feature: Sign In Feature

  Background: 

  @first
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on sign in option
    And User enter email'Abo.bakar@gmail.com' and password 'Kak@4321'
    And User click on login button
    Then User should be logged in into account

  @second
  Scenario: Verify user can create an account into Retail website
    Given User is on retail website
    When User click on sign in option
    And User click on create new account button
    And User fill the signup information with below data
      | name     | email                 | password  | confirmPassword |
      | panthers | pant.kak@tekschool.us | Tek@10045 | Tek@10045       |
    And User click on signup button
    Then User should be logged into account page
