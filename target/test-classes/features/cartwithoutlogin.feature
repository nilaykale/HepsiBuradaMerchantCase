Feature: Shopping Cart

  Scenario Outline: Anonim sepete ürün eklenmesi
    Given User is on homepage
    Then User searches <itemName>
    Then User chooses product
    Then Add the basket
    And Close the pop-up
    Then User chooses the same product but another seller
    Then Check the basket
    Then Delete all basket item

    Examples:
      | itemName        |
      | akıllı bileklik |