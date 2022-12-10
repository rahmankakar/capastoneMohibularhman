Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @Eleven
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Tewlve
  Scenario Outline: Verify department sidebar options
    When User click on All Section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                        | optionTwo                  |
      | 'Electronics' | 'TV & Video'                     | 'Video Games'              |
      | 'Computers'   | 'Accessories'                    | 'Networking'               |
      | 'Smart Home'  | 'Smart Home Lightning'           | 'Plugs and Outlets'        |
      | 'Sports'      | 'Athletic Clothing'              | 'Exercise & Fitness'       |
      | 'Automotive'  | 'Automative Parts & Accessories' | 'MotorCycle & Powersports' |

  @Thirteen
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'Abo.bakar@gmail.com' and password 'Kak@4321'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity "2"
    And User click add to Cart button
    Then the cart icon quantity should change to "2"

  @Fourteen
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'Abo.bakar@gmail.com' and password 'Kak@4321'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity "2"
    And User click add to Cart button
    Then the cart icon quantity should change to "2"
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill New Address Form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city         | state      | zipCode |
      | United States | Ahmad    |  2224447779 | 1015 banacasa     |  16 | kent | Washington |   90032 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill debit or credit card Information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5552225885511111 | Ahmad      |              11 |           2027 |          333 |
    And User Click On Add Your card button
    And User click on Place Your Order
    Then a message should be displayed Order Placed Thanks

  @fiftheen
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'Abo.bakar@gmail.com' and password 'Kak@4321'
    And User click on login button
    And User should be logged in into Account
    And User change the Category to 'Electronics'
    And User search for item 'Apex Legends'
    And User click on Search icon
    And User click item
    And User select the quantity "5"
    And User click add to Cart button
    Then the cart icon quantity should change to "5"
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed �Order Placed, Thanks�
