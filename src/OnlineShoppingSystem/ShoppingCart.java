package OnlineShoppingSystem;

public class ShoppingCart {

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    String items;

    public void addItem(String items){
        System.out.println("Item added");
    }

    public void removeItem(String items){
        System.out.println("Item removed");
    }


}
