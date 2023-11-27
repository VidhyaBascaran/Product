Feature: Verifying Add To Cart in Flipkart

  Scenario Outline: Verifying Add To Cart with a product in flipkart
    Given User is on Flipkart page
    When User enter "<searchProduct>"
    Then User should verify the success message after search product "results"
    When User select product
    And User  add the product in the cart
    Then User Should verify the sucess message after added product  "Place Order"

    Examples: 
      | searchProduct |
      | atomic habits |
