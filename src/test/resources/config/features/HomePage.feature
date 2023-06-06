Feature:HomePage Verification

  Background:
    Given Login Page is loaded
    When  user Enters valid UserName
    And  user Enters valid Password
    And  user clicks on the login Button

  Scenario:User verifies the tabs on HomePage
    Then User verifies all Tabs are available
    |Admin|PIM|Leave|Time|Recruitment|Mt Info|Performance|Dashboard|Directory|Maintenance|Buzz|