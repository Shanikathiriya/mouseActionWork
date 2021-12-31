Feature: Navigate to Category Pages
  @test

  Scenario Outline: As a user ,i should able to navigate to correct page
                    then click on menu category button

    Given I am on home page
    When I click on "<category>" Button
    Then I should able To Verify The "<Page_URL>" accordingly
    And I should Able To Verify the Page Title As "<Page_Title>" Accordingly

    Examples:

      | category    | Page_URL                                 | Page_Title  |
      |Computers    | https://demo.nopcommerce.com/computers   | Computers   |
      |Electronics  | https://demo.nopcommerce.com/electronics | Electronics |
      | Apparel     | https://demo.nopcommerce.com/apparel     | Apparel     |


