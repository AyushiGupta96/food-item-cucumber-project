Feature:Final Bill calculation
  @ScenarioOutline
  Scenario Outline: Customer bill calculation
    Given  I have a customer
    And  user enter initial bill amount as <InitialBillamount>
    And Sales tax rate as <TaxRate> Percent
    Then Final bill amount calculated is <CalculatedBillAmount>

    Examples:
    |InitialBillamount | TaxRate |CalculatedBillAmount|
    |100               |10       |110                 |
    |200               |5        |205                 |
    |100               |1.55     |101.55              |