@AZUL10-337 @Login
Feature: Log in features

  Background: where user is
    Given user is on login page

   @AZUL10-431
  Scenario Outline: Login with valid cridentials
    When the user enter the valid "<username>" username
    And   user enter the  valid "<password>" password
    And user clicks the login button
    Then user arrives to home page
     Then Then user can see "<username>" in profile menu
    Examples: marketing user cridentials
      | username                       | password |username                      |
      | marketing99@cybertekschool.com | UserUser |marketing99@cybertekschool.com|
      | hr100@cybertekschool.com       | UserUser |hr100@cybertekschool.com       |
      | helpdesk99@cybertekschool.com  | UserUser |helpdesk99@cybertekschool.com |

     @AZUL10-432
  Scenario Outline: Login with invalid cridentials
    When The user enters "<username>" username
    And   user enters "<password>" password
    And user clicks the login button
    Then user should see "Incorrect login or password" message
    Examples: invalid cridentials
      | username                       | password |
      | invalid                        | UserUser |
      | helpdesk100@cybertekschool.com | ivalid   |


       @AZUL10-433  @BUG
  Scenario Outline: Login without cridentials
    When the user enter the valid or empty "<username>" username
    And   user enter the  valid or empty "<password>" password
    And user clicks the login button
    Then user should see "Please fill out this field"
    Examples: invalid cridentials
      | username                      | password |
      |                               | UserUser |
      | helpdesk98@cybertekschool.com |          |


     @AZUL10-434
  Scenario: user try to get get password page
    When user clicks the forgot your password button
    Then user in get password page

     @AZUL10-435
  Scenario: user can see remember me button and click it
    When remember me button exist and user can click
    Then remember me button is clickable

   @AZUL10-436
  Scenario: user can see password in bullet sign
    When user click the password button
    Then user sees password in bullet sign

  @AZUL10-437
  Scenario: user can use enter key in login page
    When user enter valid cridentials
    And user get enter key
    Then user should get profile menu




