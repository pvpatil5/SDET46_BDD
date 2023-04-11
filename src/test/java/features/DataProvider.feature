Feature: Verify User is able to book a ticket

  Scenario Outline: To Book the tickets
    Given launch browser
    Then enter url "https://www.makemytrip.com/flights/"
    Then enter source <source>
    And enter destination <dest>

    Examples: 
      | source  | dest      |
      | "DELHI" | "MUMBAI"  |
      | "blr"   | "chennai" |
      | "pune"  | "kolkata" |
