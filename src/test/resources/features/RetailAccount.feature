 Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on sign in option
    And User enter email'Abo.bakar@gmail.com' and password 'Kak@4321'
    And User click on login button
    And User should be logged in into Account

  @third
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Hajarjan' and Phone '323-323-5544'
    And User click on Update button
    Then user profile information should be updated

  @forth
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@1045        | Tek@1220    | Tek@1220        |
    And User click on Change Password button
    Then a message should be displayed Password Updated Successfully

  @fifth
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 7373737373737373 | Taqwa      |              12 |           2035 |          115 |
    And User click on Add your card button
    Then paymenet method should be successfully added

  @Sixth
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationyear | securityCode |
      | 1213141516171920 | Ahmad      |              12 |           2028 |          716 |
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
      | country     | fullName  | phoneNumber | streetAddress | apt | city       | state | zipCode |
      | Afghanistan | Aqdas jan |  2223334444 | 2125 banacasa |  11 | Washington | Kabul |   98031 |
    And User click  on Add Your Address button
    Then a message should be displayed Address Added Successfully

  @Ninth
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city      | state      | zipCode |
      | United States | Abo jan  |  5252225211 | 4344 Alta     |  15 | Las Vegas | California |   91032 |
    And User click update Your Address button
    Then a message should be displayed Address Updated Successfully
