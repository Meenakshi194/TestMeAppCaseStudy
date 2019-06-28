

Feature: Registration

  @registration
  Scenario: Registration Scenario
  Given User enters the TestMeApp
    Given User clicks on the signup link
   When User enters the signUp page
    And User enters the UserName "IndraKumar123"
     And User enters the FirstName "Indra"
     And User enters the LastName "Kumar"
     
     And User enters the Password "123456"
     And User enters the ConfirmPassword "123456"
     And User enters the Gender "male"
     And User enters the Email "logesh123@gmail.com"
     And User enters the MobileNumber "9962248772"
     And User enters the DateOfBirth "10/08/1998"
     And User enters the Address "No:2, Nehru Street, Chennai-44."
     And User enters the SecurityQuestion "411010"
     And User enters the Answer "Chennai"
     When User clicks on the Register Button
    Then New user gets Registered
    

 