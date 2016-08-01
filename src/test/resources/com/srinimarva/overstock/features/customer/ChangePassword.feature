#Author: Srinivasan Ramu
#Email: srinimarva@gmail.com
@ChangePassword
Feature: To test the Change Password functionality

  Background: 
    Given I open "Chrome" browser to execute "ChangePassword" test
    When I connect to "http://www.overstock.com" website
    And I login to my account
    Then I should see Hi Customer Name
      | Field        | Value      |
      | CustomerName | Srinivasan |

  Scenario: Change password satisfying the standards
    Given I am on the My Account page
    When I select "Account Settings" menu option and select "Email Address & Password" sub-menu option
    Then I should see "Email Address & Password" page
    When I enter Current Password, New Password, Confirm Password and hit the Save button
      | Field            | Value    |
      | New Password     | Orange@7 |
      | Confirm Password | Orange@7 |
    Then I should see "Success! Your password has been updated." and I sign out of my account
    When I login to my account
    Then I should see Hi Customer Name
      | Field        | Value      |
      | CustomerName | Srinivasan |

  Scenario: Change password with mismatching passwords
    Given I am on the My Account page
    When I select "Account Settings" menu option and select "Email Address & Password" sub-menu option
    Then I should see "Email Address & Password" page
    When I enter Current Password, New Password, Confirm Password and hit the Save button
      | Field            | Value    |
      | New Password     | Orange@7 |
      | Confirm Password | Orange@9 |
    Then I should see "We're sorry. The passwords you have entered do not match. Please re-enter a new password."

  Scenario: Change password NOT satisfying the standards
    Given I am on the My Account page
    When I select "Account Settings" menu option and select "Email Address & Password" sub-menu option
    Then I should see "Email Address & Password" page
    When I enter Current Password, New Password, Confirm Password and hit the Save button
      | Field            | Value |
      | New Password     | Apple |
      | Confirm Password | Apple |
    Then I should see "We're sorry. Passwords must be a minimum of nine characters."