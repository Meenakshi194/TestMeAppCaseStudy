

Feature:Login

  
  

  
  Scenario Outline: LoginScenario
    Given User is in the Loginpage
    When User enters the username"<username>"
    And user enters the password"<password>"

    And user clicks the login button

    Then User navigate to the home page
    

    Examples: 
      | username  | password |
      | Logesh123 | 123456   |
