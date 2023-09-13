Feature: Validating login functionality

 
  Scenario: Validating login with invalid username and valid password
    Given User is on Facebook page in chrome browser
    When user enter "<username>" and "<password>"
    And user enter login button
    Then user do validation
    
    Examples:
    |username|password|
    |RevathiRavi03|931C1G|
    
    
    
