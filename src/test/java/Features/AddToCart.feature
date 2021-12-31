
Feature: Add to cart
  As a Registered user I Want to Buy Product and  Checkout Successfully on DemoNopeCommerce website

  @addToCart
  Scenario: User should able to add to cart  successfully

    Given User is alredy register
    When Select on computer Menu
    And click on build computer
    And Select Required Feilds
    And click on Add to Cart
    And click on CheckOut
    And Enter Address Detail and conitue
    And Choose Shipping Method
    And Choose Payment Credit card Method and Contiue
    And Enter Card Details and continue
    And Click On Confirm
    Then verify You order has been successfully

