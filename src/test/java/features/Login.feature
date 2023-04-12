Feature: Verify User is Able To Login With Valid Cred

@smoketest
  Scenario: Login into App
    Given launch browser
    Then enter url
    Then enter username
    And enter password
    Then click on login btn

@smoketest @regressiontest
  Scenario: Login into App with manager cred
    Given launch browser
    Then enter url "http://localhost:8888"
    Then enter username "admin"
    And enter password "12345"
    Then click on login btn
    
@sanitytest
  Scenario: Login with invalid in prod
    Given launch browser
    Then enter url "https://facebook.com"
    Then enter usernameforfb "admin"
    And enter passwordforfb "12345"
    Then click on login btn on fb
