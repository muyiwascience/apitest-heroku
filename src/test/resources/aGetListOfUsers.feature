Feature: Gist list of items from the end-point

  @ListOfUsers
  Scenario: Check a route is created
    Given I navigate to the api URI
    Then I get a list of users from the end point and verify the HTTP response "200"
