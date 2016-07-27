#Author: Srinivasan Ramu
#Email: srinimarva@gmail.com
@ForgotPassword
Feature: To test the Forgot Password functionality

  Background: 
    Given I open "Chrome" browser to execute "ForgotPassword" test
    And I connect to "http://www.overstock.com" website

  Scenario: Retrieve forgotten password with valid email address
    Given I am on Password Assistance page
    When I enter a Email Address and hit Reset Password button
      | Field | Value                |
      | Email | srinimarva@gmail.com |
    Then I should see a message saying including "srinimarva@gmail.com"

  Scenario: Retrieve forgotten password with invalid email address
    Given I am on Password Assistance page
    When I enter a Email Address and hit Reset Password button
      | Field | Value |
      | Email |       |
    Then I should see a message saying "Your e-mail address is not in our system."