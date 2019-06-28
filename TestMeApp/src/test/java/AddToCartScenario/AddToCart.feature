

 Feature: AddToCart

  
  

  
  Scenario Outline: AddToCartScenario
    Given User is in the Loginpage
    When User enters the username"<username>"
    And user enters the password"<password>"
    And user clicks the login button
    Then User navigate to the home page
    When User enters the string "Headphone" in search box
    And User clicks on the find details button
    Then user enters the AddTo Cart page
    

    Examples: 
      | username  | password |
      | Logesh123 | 123456   |
 