Feature: Read Data from Table

  Scenario: To read data
    Given launch browser
    Then navigate to url
    And enter data
      | "pavan" | "12345" | "pavan@gmail.com" |
      | "tyss"  | "7890"  | "tyss@gmail.com"  |
    Then enter data in reqd feilds  