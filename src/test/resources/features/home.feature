Feature: Interact with the home page

  Background:
    Given "Automation" open the website

  @Run
  Scenario Outline: choose a product at random
    When enter "<username>" and "<password>"
    And click on random product
    Then should see the same product name
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

