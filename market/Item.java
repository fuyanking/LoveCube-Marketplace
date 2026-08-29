public class Item {
    private String name;
    private int itemId;
    private int quantity;
    private double price;
    private String type;

    public Item(String name, int itemId, int quantity, double price, String type) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public String getInfo() {
        return itemId + ": " + name + " (" + type + "), $" + price
                + ", quantity: " + quantity;
    }
}
