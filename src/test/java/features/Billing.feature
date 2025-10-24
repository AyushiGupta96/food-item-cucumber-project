@ListofMaps
Feature: Billing
  Scenario: Bill amount generation
    Given : I placed an order for the following  itemd
    |ItemName          |units|unitPrice|
    |cucumber sandwitch|2    |20       |
    |cucumber slad     |5    |40       |
    When I generated the bill
    Then A bill for $40 should  be generated

