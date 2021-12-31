Feature: Navigate  Category Pages to Sub Category Page
  @subCategory

  Scenario Outline: As a user i should able to navigate  main category to Sub Category PAge


    Given I am on home page
    When  I take mouse  on "<category>" Button
    And   I select sub category"<subCategory>"
    Then I should able To Verify The "<Page_URL>" accordingly
    And I should Able To Verify the Page Title As "<Page_Title>" Accordingly



    Examples:

      | category    | subCategory    | Page_URL                                  | Page_Title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |


