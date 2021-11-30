Feature: Login
  As a user I would like to login


  Scenario Outline: User login as a tenant
    Given user is on login page
    When  user tries to login using <parameters>
    Then user should see that he is logged in
    Examples:
    | parameters               |
    | Tenant Login Credentials |
