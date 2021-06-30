@tag1
Feature: To verify shopping cart section feature in ecommerce site

  @tag1
  Scenario: To Select book and shopping cart section
    Given Launch the url to homepage
    And Verify the product home page navigated or not
    When To select the book from product list
    And Go to Shopping cart section
    And To validate the selected products added in cart or not
    And To increase the quantity of the book and click the updatebasket
    Then Verify whether it is updated or not

  Scenario: To Select book and Remove Product from cart
    Given Launch the url to homepage
    And Verify the product home page navigated or not
    When To select the book from product list
    And Go to Shopping cart section
    And To remove the selected book
    Then Verify  Is the selected book removed or not
