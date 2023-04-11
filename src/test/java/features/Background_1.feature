Feature: Verify User is Able To Login With Valid Cred

  Background: 
    Given launch browser
    Then enter url
    Then maximize window
    And wait for page loading

  Scenario: Login into App
    Then enter username
    And enter password
    Then click on login btn

  Scenario: Login into App with manager cred
    Then enter username "pavan"
    And enter password "12345"
    Then click on login btn
