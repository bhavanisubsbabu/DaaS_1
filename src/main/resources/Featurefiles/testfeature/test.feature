@ebaytest
Feature: to verify that the current framework can be used for DaaS

  Scenario:
    Given user types "ebay_Url" in browser URL space
    When I click on  signin
    Then type username and password to login
    And verify "username" is displayed
    Then click on logout
