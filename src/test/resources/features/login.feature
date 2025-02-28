Feature: Login with credentials

  Background:
    Given "Automation" open the website

  Scenario Outline: login with multiple users
    And enter "<username>" and "<password>"
    Then visualize the word "Products"
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | problem_user            | secret_sauce |


  @Run
  Scenario Outline: login with wrong credentials
    When enter "<username>" and "<password>"
    Then following message is displayed "Sorry, this user has been locked out"
    Examples:
      | username        | password     |
      | locked_out_user | secret_sauce |