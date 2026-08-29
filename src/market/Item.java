package market;

public class Item {
    private String name;
    private int itemId;
    private int quantity;
    private double price;
    private String category;

    public Item(String name, int itemId, int quantity, double price, String category) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public String getInfo() {
        return itemId + ": " + name + " (" + category + "), $" + price + ", stock: " + quantity;
    }
}