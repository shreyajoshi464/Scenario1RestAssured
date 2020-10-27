Feature: Test success status of latest foreign exchange rates api


  Scenario: Check response code id valid
  Given API for foreign exchange
  When posted with future date information
  Then validate positive response code received
  
  