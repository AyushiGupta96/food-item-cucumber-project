public class RestaurantMenuItem {
    private String NewMenuItemName;
    private String description;
    private int price;

    public String getNewMenuItemName() {
        return NewMenuItemName;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setNewMenuItemName(String newMenuItemName) {
        NewMenuItemName = newMenuItemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public RestaurantMenuItem(String NewMenuItemName, String description, int price){
        this.NewMenuItemName=NewMenuItemName;
        this.description=description;
        this.price= price;
    }
}
