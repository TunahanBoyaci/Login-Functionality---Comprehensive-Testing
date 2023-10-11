Feature: Bill Pay Functionality

  Scenario Outline: Bill Pay Functionality
    Given User is on the login page
    And Enter "john89" as username and "789456John." as password
    And Click on login button
    And Navigate to Bill Pay Page
    And User fills the form for "<Payee Name>", "<Address>", "<City>", "<State>", "<ZipCode>", "<Phone>", "<Account>", "<Account Verify>", and "<Amount>"
    When Click on Send Payment button
    Then User should be able to pay the bill
    Examples: Data for bill pay form
      | Payee Name | Address       | City     | State | ZipCode | Phone      | Account | Account Verify | Amount |
      | John Smith | 230 Worth St. | New York | NY    | 10010   | 8594561232 | 13455   | 13455          | 85     |
      | John Smith | 230 Worth St. | New York | NY    | 10010   | 8594561232 | 13455   | 13455          | 45     |
      | John Smith | 230 Worth St. | New York | NY    | 10010   | 8594561232 | 13455   | 13455          | 150    |
      | John Smith | 230 Worth St. | New York | NY    | 10010   | 8594561232 | 13455   | 13455          | 60     |



