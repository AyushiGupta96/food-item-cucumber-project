package java_class;

public class RestaurantMenuItem {
    private String NewMenuItemName;
    private String Description;
    private int Price;

    public String getNewMenuItemName() {
        return NewMenuItemName;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrice() {
        return Price;
    }

    public void setNewMenuItemName(String newMenuItemName) {
        NewMenuItemName = newMenuItemName;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public RestaurantMenuItem(String NewMenuItemName, String description, int price){
        this.NewMenuItemName=NewMenuItemName;
        this.Description=description;
        this.Price= price;
    }
}
