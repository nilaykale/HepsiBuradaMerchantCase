Feature: Shopping Cart

  Scenario Outline: Kullanıcı girişi yapılarak sepete ürün eklenmesi
    Given User is on homepage
    When User navigates to login page
    Then User enters <email> and <password>
    Then User searches <itemName>
    Then User chooses product
    Then Add the basket
    And Close the pop-up
    Then User chooses the same product but another seller
    Then Check the basket
    Then Delete all basket item

    Examples:
      | email                      | password      | itemName        |
      | dummyfortesting7@gmail.com | dummyTestAcc7 | akıllı bileklik |