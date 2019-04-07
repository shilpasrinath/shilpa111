Feature: verifying vehicle exist
Scenario: cover check in insurance portal
Given user is on login page
When  user enters vehicle registration number
When User clicks on find vehicle
Then user get results for that vehicle