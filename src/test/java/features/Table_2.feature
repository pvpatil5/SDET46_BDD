Feature: To read data from cucumber table with maps

  Scenario: To read data
    Given launch browser
    Then go to URL
    And enter un and pwd and mailid
      | mailid          | username | pwd  |
      | user1@gmail.com | user1    | pwd1 |
      | user2@gmail.com | user2    | pwd2 |
      | user3@gmail.com | user3    | pwd3 |
    Then click on login btn
