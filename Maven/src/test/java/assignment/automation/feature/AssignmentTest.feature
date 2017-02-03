Feature: Calculator

  Scenario Outline: Add two numbers
    Given user is on ebay homepage
    When user search with keyword "<search_keyword>"
    Then verify item listing page should be displayed
    And verify all item name contains search keyword
    When user select any product from product listing page
    Then verify product detail page should be displayed
    And verify item details on product detail page
    When user click on add to cart button
    Then verify cart page should be displayed
    And verify item information on cart page
    When user click on checkout button
    Then verify login screen should be displayed
    When user click on proceed to checkout as guest
    Then verify item information on checkout page

    Examples: 
      | search_keyword |
      | Sony TV        |
