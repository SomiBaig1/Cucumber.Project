Feature:Orange HRMS Login Features
  Scenario:Login with valid userName and password
    Given Login Page is loaded
    When  user Enters valid UserName
    And  user Enters valid Password
    And  user clicks on the login Button
    Then verify user is logged in

  Scenario:Login with invalid userName and valid password
    Given Login Page is loaded
    When  user Enters invalid UserName
    And  user Enters valid Password
    And  user clicks on the login Button
    Then verify user Gets the error msg

  Scenario: Login with valid userName and invalid password
    Given Login Page is loaded
    When user Enters valid UserName
    And  User Enters invalid Password
    And User clicks on the login Button
    Then verify User Gets empty Password error msg
