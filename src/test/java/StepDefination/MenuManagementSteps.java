package StepDefination;
//package src.main.java.org.example.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;
import java_class.RestaurantMenu;
import java_class.RestaurantMenuItem;
import org.junit.*;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;

//import static com.sun.beans.introspect.PropertyInfo.Name.description;


public class MenuManagementSteps {
    RestaurantMenuItem NewMenuItem;
    RestaurantMenu LocationMenu = new RestaurantMenu();
    String ErrMsg;
    public MenuManagementSteps(){
        System.out.println("custructor called");
    }
    @Given("^I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)$")
    // ^ represent begining and $ represent end.
    public void i_have_a_menu_item_with_name_and_price(String NewMenuItemName, String currency,Integer price) {

        NewMenuItem = new  RestaurantMenuItem(NewMenuItemName,Description:"",price);
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        RestaurantMenu LocationMenu;
        //LocationMenu.add(NewMenuItem);
        try{
            LocationMenu.add(NewMenuItem);
        }
        catch(IllegalArgumentException ex) {
            ErrMsg = ex.getMessage();
        }
        assertThatNoException();
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("i should get error test {String})
    public void i_should_get_error_test(String string) {
        // Write code here that turns the phrase above into concrete actions
        boolean ItemExists = LocationMenu.does_item_exit(NewMenuItem);
        assertThat(ErrMsg).isEqualTo(expected:"duplicate item");
        //throw new io.cucumber.java.PendingException();
    }
}
