
Feature: New Online Store
  As a registered user, I want Leave comment on New Online Store on DemoNopeCommerce website

  @NewStoreComment
  Scenario: User should able to see Leave Comment Successfully

    Given User is alredy register
    When user click on new online store details button
    And verify title or Subtitle of page
    And user enters title and comment
    And user click on NewComment Button
    And verify comment add successfully
    Then user can see added comment at end of list successfully
