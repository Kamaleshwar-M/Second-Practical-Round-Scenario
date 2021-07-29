Feature: Verifying SauceDemo Details

  Scenario Outline: Verifying Correct Product is ordered
    Given User is on SauceDemo Login Page
    And User should enter "<userName>" and "<password>"
    And User should add Product to the Cart
    And User should checkout and enter "<firstName>","<lastName>" and "<postalCode>"
    Then Validate whether ordered the correct product

    Examples: 
      | userName      | password     | firstName   | lastName | postalCode |
      | standard_user | secret_sauce | Kamaleshwar | Murthy   |     600100 |

  Scenario Outline: Verifying Particular product is available
    Given User is on SauceDemo Login Page
    And User should enter "<userName>" and "<password>"
    And Should get all the product list
    Then Validate whether Sauce Labs Bolt T-Shirt product is available

    Examples: 
      | userName      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Verifying price with product listing with product individual page
    Given User is on SauceDemo Login Page
    And User should enter "<userName>" and "<password>"
    And Getting the price of all Product and removing the dollar symbol
    Then Validate the price with product listing with product individual page

    Examples: 
      | userName      | password     |
      | standard_user | secret_sauce |
@Reg
  Scenario Outline: Verifying LoginPage with invalid Credentials
    Given User is on SauceDemo Login Page
    And User should enter invalid "<userName>" and "<password>"
    Then Validate the error message

    Examples: 
      | userName      | password     |
      | standard_us1r | secret_sau7e |
