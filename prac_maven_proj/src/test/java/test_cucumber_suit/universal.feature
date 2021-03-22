#Author: chaitali dutta

@universalclass
Feature: Testing the search and subscribe the course

  @search
  Scenario: search for the course
    Given user is in the home page 
    When enter course name and search
    Then releted courses are displayed
  
  @subscribe
  Scenario: to subscribe course by the new user
    Given user is in the home page
    When click the dropdown menu
    And click subscribe
    Then display the subscription plans  