Feature: menu management
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber sandwitch" and price $20
    When I add that menu item
    Then Menu Item with name "Cucumber sandwitch"  should be added

  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber salad" and price 10
    When I add that menu item
    Then Menu Item with name "Cucumber salad"  should be added