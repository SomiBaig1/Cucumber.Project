Feature: Adding employees
  Background:
    Given Login Page is loaded
    When  user Enters valid UserName
    And  user Enters valid Password
    And  user clicks on the login Button
    And user clicks PIM

  Scenario: Add one employee
    And user clicks addEmployee
    And user enters "Somi" in firstName field
    And user enters "Beg" in lastName field
    And user clicks on the save button
    Then user verifies employee is added

  Scenario Outline: Add three employees
    And user clicks addEmployee
    And user enter "<firstName>" "<middleName>" "<lastName>"
    And user clicks on the save button
    Then user verifies employee is added
    Examples:
    |firstName|middleName|lastName|
    | Sam     | BY       |DI      |
    | Ram     |Syb       |De      |
    | Aly     |Zeb       | mAy    |

  Scenario: Add multiple employees on the same page
    And user clicks add Multiple Employees and verifies employee is added
      |firstName|middleName|lastName|
      | Sam     | BY       |DI      |
      | Ram     |Syb       |De      |
      | Aly     |Zeb       |mAy    |
