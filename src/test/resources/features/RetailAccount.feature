Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on sign in option
    And User enter email'Aqil.Alavee@gmail.com' and password 'Cat@12345'
    And User click on login button
    And User should be logged in into Account

  @third
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Ahmad' and Phone '323-323-5555'
    And User click on Update button
    Then user profile information should be updated

  @forth
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Qand@12345       | Cat@12345   | Cat@12345       |
    And User click on Change Password button
    Then a message should be displayed Password Updated Successfully

  @fifth
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7373737373737373 | Aqil       |              11 |           2037 |          105 |
    And User click on Add your card button
    Then paymenet method should be successfully added

  @Sixth
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationyear | securityCode |
      | 1213141516171920 | Ali        |              12 |           2027 |          786 |
    And User click on Update Your Card button
    Then a message should be displayed Payment Method updated Successfully

  @seventh
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @eight
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName    | phoneNumber | streetAddress | apt | city        | state | zipCode |
      | Afghanistan | Aqil Alavee |  2223334444 | 2121 WorkMan  |  10 | Los Angeles | Kabul |   90031 |
    And User click  on Add Your Address button
    Then a message should be displayed Address Added Successfully

  @Ninth
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city      | state      | zipCode |
      | United States | Qudos    |  5252525252 | 4344 Alta     |  15 | Las Vegas | California |   91006 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully

