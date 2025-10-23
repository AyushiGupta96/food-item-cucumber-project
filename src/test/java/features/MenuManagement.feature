Feature: menu management
  @SmokeTest
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber sandwitch" and price $20
    When I add that menu item
    Then Menu Item with name "Cucumber sandwitch"  should be added

    @RegularTest
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber salad" and price $10
    When I add that menu item
    Then Menu Item with name "Cucumber salad"  should be added

  @nightTest @RegularTest
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber " and price $10
    When I add that menu item
    Then Menu Item with name "Cucumber "  should be added
