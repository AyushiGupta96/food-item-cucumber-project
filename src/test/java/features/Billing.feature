Feature: Billing
  Scenario: Bill amount generation
    Given : I placed an order for the following  itemd
    |cucumber sandwitch|2|20|
    When I generated the bill
    Then A bill for $40 should  be generated

