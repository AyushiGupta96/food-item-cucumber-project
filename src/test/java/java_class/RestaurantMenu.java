package java_class;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import java.util.ArrayList;

public class RestaurantMenu {
    ArrayList<RestaurantMenuItem> MenuItems= new ArrayList<RestaurantMenuItem>();
    @After("@SmokeTest")
    public boolean addMenuItem(RestaurantMenuItem newMenuItem){
        if(does_item_exit(newMenuItem)){
          throw new IllegalArgumentException(s:"duplicate item");
        }
return MenuItems.add(newMenuItem);
    }
    @AfterStep("@SmokeTest")
    public boolean does_item_exit(RestaurantMenuItem newMenuItem){
        boolean Exists=false;
        if(MenuItems.contains(newMenuItem)){
           Exists=true;
        }
        return Exists;
    }
}
