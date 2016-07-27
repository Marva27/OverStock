#Author: Srinivasan Ramu
#Email: srinimarva@gmail.com
Feature: To test the Sign In functionality

  Background: 
    Given I open "Mozilla" browser to execute "SignIn" test
    And I connect to "http://www.overstock.com" website

  Scenario: Attemp sign in with valid credentials
    Given I navigate to Sign In page to execute "SignIn" test
    When I enter credentials and hit Sign In button
      | Field    | Value                |
      | Email    | srinimarva@gmail.com |
      | Password | Orange@7             |
    Then I should see Hi Customer Name
      | Field        | Value      |
      | CustomerName | Srinivasan |

  Scenario: Attemp sign in without valid Email Address
    Given I navigate to Sign In page to execute "SignIn" test
    When I enter credentials and hit Sign In button
      | Field    | Value    |
      | Email    |          |
      | Password | Orange@7 |
    Then I should see an alert message saying "This email address is invalid."
