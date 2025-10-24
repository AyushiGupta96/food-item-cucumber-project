Feature: menu management
  Background: Add another menu
    Given I have a menu item with name "Cucumber " and price $10
    When I add that menu item
    Then Menu Item with name "Cucumber "  should be added
  @SmokeTest
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber sandwitch" and price $20
    When I add that menu item
    Then Menu Item with name "Cucumber sandwitch"  should be added

    @RegularTest
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber salad" and price $10
    When I add that menu item
    Then i should get error test "duplicate item"

  @nightTest @RegularTest
  Scenario: add  a menu item

    Given I have a menu item with name "Cucumber " and price $10
    When I add that menu item
    Then Menu Item with name "Cucumber "  should be added
