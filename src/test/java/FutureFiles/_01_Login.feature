Feature: Login Functionality

  Scenario Outline: Login Functionality
    Given User is on the login page
    When Enter "<username>" as username and "<password>" as password
    And Click on login button
    Then They should be "<loginStatus>"
    Examples: Data for username and password
      | username | password     | loginStatus  |
      | john89   | 78sds6John   | unsuccessful |
      | john8q9  | 789456John.  | unsuccessful |
      | john8q9  | 789456qJohn. | unsuccessful |
      |          | 789456John.  | unsuccessful |
      | john89   |              | unsuccessful |
      |          |              | unsuccessful |
      | john89   | 789456John.  | successful   |

