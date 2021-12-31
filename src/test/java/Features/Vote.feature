
Feature: Vote
  As a user, I want to click on Vote

  @Vote
  Scenario: User should able to click on Vote and open successfully

    Given user is on home page
    When user click on vote Button
    And accept apper alert
    Then verify text message of alert