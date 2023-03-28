@AZUL10-339  @Logout
Feature: Log out features

  Background: where user is
    Given user is on profile page

    @AZUL10-439
    Scenario: The user can log out and ends up on the login page.
      When user clicks user menu
      And user clicks log out button
      Then user go back to login page

      @AZUL10-440
    Scenario: The user can not go to the home page again by clicking the
    step forward button after successfully logging out.
      When users clicks user menu
      And user clicks log out button
      And user click step back button
      Then user is cannot go to profile page


        @AZUL10-441
  Scenario:  The user must be logged out
    if the user close the open tab (all tabs if there are multiple open tabs)
    When  user open new tab with home page url
    And   user close the open tab(s)
    And   user open home page url
    Then  user can not go to home page

