Feature: Verifying Add To Cart in Amazon

  Scenario Outline: Verifying Add To Cart with the product in Amazon
    Given User is on Amazon page
    When User enters "<searchProduct>"
    Then User verify success message after search Product "Results"
    When User select the product
    And User add the product to cart
    Then User Should verify the sucess message after product added "Added to Cart"

    Examples: 
      | searchProduct      |
      | car vacuum cleaner |
