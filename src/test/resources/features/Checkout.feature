#Author: Neotech Academy
@checkout
Feature: Checkout

  # operation to log in everytime for each scenario
  Background: 
    Given user is actually successfully logged in

  Scenario Outline: Order Checkout
    When I click on item with name "<Item>"
    And I click on the ADD TO CART button
    And I click on the shopping cart button
    And I click on the checkout button
    And I enter the order information as "<FirstName>", "<LastName>", and "<Zip>"
    And I click on continue button
    Then I verify the item name matches that of "<Item>"

    # CTRL + SHIFT + F
    Examples: 
      | Item                     | FirstName | LastName | Zip   |
      | Sauce Labs Bike Light    | test      | test     | 12345 |
      | Sauce Labs Fleece Jacket | test2     | test2    | 23456 |

  #data driven testing with datatable
  @dt
  Scenario: Print dataTable info
    When I provide the dataTable info
      | Item                     | FirstName | LastName | Zip   |
      | Sauce Labs Bike Light    | test      | test     | 12345 |
      | Sauce Labs Fleece Jacket | test2     | test2    | 23456 |
