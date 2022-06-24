@LoginPage
Feature: Home Page

  @Search
  Scenario Outline: Urun arama
    Given as a user I am on Home page
    When fill search field with "<productName>" data
    Then I click search button
    And I verify that I see searched page
    Examples:
      | productName |
      | kazak       |

  @Filter
  Scenario Outline: Filtreleme
    Given as a user I am on Home page
    When fill search field with "<productName>" data
    Then I click search button
    And I verify that I see searched page
    And I filter results by "<filterSelection>" "<filterName>"
    Then I verify that result list is filtered
    Examples:
      | productName            | filterSelection             | filterName          |
      | kazak                  | TRENDYOLMİLLA               | Marka               |

  @ChooseProduct
  Scenario Outline: Isme Gore Urun Secme
    Given as a user I am on Home page
    When fill search field with "<productName>" data
    Then I click search button
    And I click on product with "<specificName>" name
    Examples:
      | productName                     | specificName                  |
      | kazak                           | Triko                         |

  @AddCart
  Scenario Outline: Urunu sepete ekleme
    Given as a user I am on Home page
    When fill search field with "<productName>" data
    Then I click search button
    And I click on product with "<specificName>" name
    Then I add product to the cart
    When I navigate to cart page
    And I verify that cart count is increased
    Examples:
      | productName                     | specificName                  |
      | kazak                           | Triko                         |

  @RemoveCart
  Scenario Outline: Urunu sepetten cikarma
    Given as a user I am on Home page
    When fill search field with "<productName>" data
    Then I click search button
    And I click on product with "<specificName>" name
    Then I add product to the cart
    When I navigate to cart page
    Then I remove product from cart
    And I verify that product is removed from cart
    Examples:
      | productName                     | specificName                  |
      | kazak                           | Triko                         |