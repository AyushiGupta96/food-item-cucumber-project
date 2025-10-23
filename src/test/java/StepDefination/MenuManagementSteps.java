package StepDefination;
//package src.main.java.org.example.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;
import java_class.RestaurantMenu;
import java_class.RestaurantMenuItem;

import java.awt.*;

//import static com.sun.beans.introspect.PropertyInfo.Name.description;


public class MenuManagementSteps {
    RestaurantMenuItem NewMenuItem;
    RestaurantMenu LocationMenu = new RestaurantMenu();
    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String NewMenuItemName, Integer price) {

        NewMenuItem = new  RestaurantMenuItem(NewMenuItemName,Description:"",price);
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        RestaurantMenu LocationMenu;
        LocationMenu.add(NewMenuItem);
        assertThatNoException();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Menu Item with name {string}  should be added")
    public void menu_Item_with_name_should_be_added(String string) {
        // Write code here that turns the phrase above into concrete actions
        boolean ItemExists = LocationMenu.does_item_exit(NewMenuItem);
        assertThat(ItemExists).isEqualTo(expected:true);
        //throw new io.cucumber.java.PendingException();
    }
}
